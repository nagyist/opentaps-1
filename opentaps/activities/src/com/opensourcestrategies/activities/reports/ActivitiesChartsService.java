/*
 * Copyright (c) 2010 - 2011 Open Source Strategies, Inc.
 *
 * Opentaps is free software: you can redistribute it and/or modify it
 * under the terms of the GNU Affero General Public License as published
 * by the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * Opentaps is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with Opentaps.  If not, see <http://www.gnu.org/licenses/>.
 */
package com.opensourcestrategies.activities.reports;

import java.awt.Color;
import java.io.IOException;
import java.sql.Timestamp;
import java.text.NumberFormat;
import java.util.Arrays;
import java.util.Calendar;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.labels.StandardPieSectionLabelGenerator;
import org.jfree.chart.plot.PiePlot;
import org.jfree.chart.servlet.ServletUtilities;
import org.jfree.data.general.DefaultPieDataset;
import org.jfree.ui.RectangleInsets;
import org.ofbiz.base.util.Debug;
import org.ofbiz.entity.GenericEntityException;
import org.ofbiz.entity.condition.EntityCondition;
import org.ofbiz.entity.condition.EntityOperator;
import org.opentaps.base.constants.OpentapsConfigurationTypeConstants;
import org.opentaps.base.constants.RoleTypeConstants;
import org.opentaps.base.entities.ActivityFact;
import org.opentaps.base.entities.PartyRole;
import org.opentaps.common.reporting.etl.UtilEtl;
import org.opentaps.domain.DomainService;
import org.opentaps.domain.activities.ActivityFactRepositoryInterface;
import org.opentaps.domain.party.PartyRepositoryInterface;
import org.opentaps.foundation.entity.Entity;
import org.opentaps.foundation.infrastructure.Infrastructure;
import org.opentaps.foundation.infrastructure.InfrastructureException;
import org.opentaps.foundation.infrastructure.User;
import org.opentaps.foundation.repository.RepositoryException;
import org.opentaps.foundation.service.ServiceException;

/**
 * Charts for Activities generated by the JFree API.
 */
public class ActivitiesChartsService extends DomainService {

    private static String MODULE = ActivitiesChartsService.class.getName();

    /** Default width of the generated charts. */
    public static final int CHART_WIDTH = 400;
    /** Default height of the generated charts. */
    public static final int CHART_HEIGHT = 300;

    // input parameters
    private int chartWidth = CHART_WIDTH;
    private int chartHeight = CHART_HEIGHT;
    private int cutoffDays = 10;
    private Set<String> allowedLeadPartyIds;
    private boolean createChart = true;

    // output parameters
    private String chartFileName;
    private Set<String> oldPartyIds;
    private Set<String> recentPartyIds;
    private Set<String> noActivityPartyIds;

    /**
     * Default constructor.
     */
    public ActivitiesChartsService() {
        super();
    }

    /**
     * Creates a new <code>ActivitiesChartsService</code> instance.
     * @param infrastructure an <code>Infrastructure</code> value
     * @param user an <code>User</code> value
     * @param locale a <code>Locale</code> value
     * @exception ServiceException if an error occurs
     */
    public ActivitiesChartsService(Infrastructure infrastructure, User user, Locale locale) throws ServiceException {
        super(infrastructure, user, locale);
    }

    // Input parameters

    /**
     * Sets if the chart image should be generated, defaults to <code>true</code>.
     * @param createChart a <code>boolean</code> value
     */
    public void setCreateChart(boolean createChart) {
        this.createChart = createChart;
    }

    /**
     * Sets the width of the chart to generate, defaults to {@link #CHART_WIDTH}.
     * @param chartWidth an <code>int</code> value
     */
    public void setChartWidth(int chartWidth) {
        this.chartWidth = chartWidth;
    }

    /**
     * Sets the width of the chart to generate, defaults to {@link #CHART_WIDTH}.
     * @param chartHeight an <code>int</code> value
     */
    public void setChartHeight(int chartHeight) {
        this.chartHeight = chartHeight;
    }

    /**
     * Sets the cutoffDays, defaults to 10.
     * @param cutoffDays an <code>int</code> value
     */
    public void setCutoffDays(int cutoffDays) {
        this.cutoffDays = cutoffDays;
    }

    /**
     * Sets the lead party ids that are allowed to be accounted in the charts, default to null which accounts all leads, defaults to null.
     * @param allowedLeadPartyIds a <code>Set</code> value
     */
    public void setAllowedLeadPartyIds(Set<String> allowedLeadPartyIds) {
        this.allowedLeadPartyIds = allowedLeadPartyIds;
    }

    // Output parameters

    /**
     * Gets the width of the generated chart.
     * @return an <code>int</code> value
     */
    public int getChartWidth() {
        return chartWidth;
    }

    /**
     * Gets the height of the generated chart.
     * @return an <code>int</code> value
     */
    public int getChartHeight() {
        return chartHeight;
    }

    /**
     * Gets the generated chart file name.
     * @return a <code>String</code> value
     */
    public String getChartFileName() {
        return chartFileName;
    }

    /**
     * Gets the set of lead party id that are in the Old category of the chart.
     * @return a <code>Set<String></code> value
     */
    public Set<String> getOldLeadPartyIds() {
        return oldPartyIds;
    }

    /**
     * Gets the set of lead party id that are in the Recent category of the chart.
     * @return a <code>Set<String></code> value
     */
    public Set<String> getRecentLeadPartyIds() {
        return recentPartyIds;
    }

    /**
     * Gets the set of lead party id that are in the No Activity category of the chart.
     * @return a <code>Set<String></code> value
     */
    public Set<String> getNoActivityLeadPartyIds() {
        return noActivityPartyIds;
    }

    // Service methods

    /**
     * Gets the breakdown of Lead according to their last activity, in Recent / Old / No activity categories, without creating a chart image.
     * @exception ServiceException if an error occurs
     */
    public void getActivitiesByLeadSnapshot() throws ServiceException {
        setCreateChart(false);
        createActivitiesByLeadSnapshotChart();
    }

    /**
     * Snapshot chart that shows the breakdown of Leads according to their last activity, in Recent / Old / No activity categories.
     * @exception ServiceException if an error occurs
     */
    public void createActivitiesByLeadSnapshotChart() throws ServiceException {
        try {
            PartyRepositoryInterface rep = getDomainsDirectory().getPartyDomain().getPartyRepository();
            ActivityFactRepositoryInterface activityFact = getDomainsDirectory().getActivitiesDomain().getActivityFactRepository();

            // Get date dimension ID according to the cutoff
            Long readingDateDimId = lookupDateDimIdForCutoff();

            activityFact.setDateDimensionId(readingDateDimId);
            activityFact.setAllowedTargetPartyIds(allowedLeadPartyIds);
            activityFact.setTargetRoleTypeId(RoleTypeConstants.LEAD);

            // Get the ActivityFacts grouped by Lead
            Map<String, List<ActivityFact>> facts = activityFact.findLeadsActivitiesGroupedBy(ActivityFact.Fields.targetPartyId);

            createActivitiesSnapshotChartFromGroupedActivities(expandLabel("ActivitiesLeadBreakdown"), facts, readingDateDimId, rep);
        } catch (RepositoryException e) {
            throw new ServiceException(e);
        }
    }

    /**
     * Gets the breakdown of Sales Reps according to their last activity, in Recent / Old / No activity categories, without creating a chart image.
     * @exception ServiceException if an error occurs
     */
    public void getActivitiesBySalesRepSnapshot() throws ServiceException {
        setCreateChart(false);
        createActivitiesBySalesRepSnapshotChart();
    }

    /**
     * Snapshot chart that shows the breakdown of Sales Reps according to their last activity, in Recent / Old / No activity categories.
     * @exception ServiceException if an error occurs
     */
    public void createActivitiesBySalesRepSnapshotChart() throws ServiceException {
        try {
            PartyRepositoryInterface rep = getDomainsDirectory().getPartyDomain().getPartyRepository();
            ActivityFactRepositoryInterface activityFact = getDomainsDirectory().getActivitiesDomain().getActivityFactRepository();

            // Get date dimension ID according to the cutoff
            Long readingDateDimId = lookupDateDimIdForCutoff();

            activityFact.setDateDimensionId(readingDateDimId);
            activityFact.setAllowedTargetPartyIds(allowedLeadPartyIds);
            activityFact.setTargetRoleTypeId(RoleTypeConstants.LEAD);

            // Get the ActivityFacts grouped by Sales Representative
            Map<String, List<ActivityFact>> facts = activityFact.findLeadsActivitiesGroupedBy(ActivityFact.Fields.teamMemberPartyId);

            createActivitiesSnapshotChartFromGroupedActivities(expandLabel("ActivitiesSalesRepBreakdown"), facts, readingDateDimId, rep);
        } catch (RepositoryException e) {
            throw new ServiceException(e);
        }
    }

    private void createActivitiesSnapshotChartFromGroupedActivities(String chartTitle, Map<String, List<ActivityFact>> facts, Long readingDateDimId, PartyRepositoryInterface rep) throws ServiceException {
        try {
            // Get totals of old, recent and no activity leads
            oldPartyIds = new TreeSet<String>();
            recentPartyIds = new TreeSet<String>();
            noActivityPartyIds = new TreeSet<String>();
            // get all leads
            noActivityPartyIds.addAll(findAllLeadIds(allowedLeadPartyIds, rep));

            // activities are sorted by dateDimId desc, so we can break early
            for (String teamMemberPartyId : facts.keySet()) {
                List<ActivityFact> activities = facts.get(teamMemberPartyId);

                for (ActivityFact fact : activities) {
                    Debug.logInfo("Removing [" + teamMemberPartyId + "] from no activities [" + noActivityPartyIds + "]", MODULE);
                    noActivityPartyIds.remove(teamMemberPartyId);
                    if (fact.getDateDimId() < readingDateDimId) {
                        oldPartyIds.add(teamMemberPartyId);
                    } else {
                        recentPartyIds.add(teamMemberPartyId);
                    }
                    break;
                }
            }

            // make sure there is no double accounting of recent leads in old
            oldPartyIds.removeAll(recentPartyIds);

            if (createChart) {
                chartFileName = createRONPieChart(chartTitle, recentPartyIds.size(), oldPartyIds.size(), noActivityPartyIds.size());
            }

        } catch (RepositoryException e) {
            throw new ServiceException(e);
        } catch (InfrastructureException e) {
            throw new ServiceException(e);
        } catch (IOException e) {
            throw new ServiceException(e);
        }
    }

    private String createRONPieChart(String title, Number recentCount, Number oldCount, Number noActivityCount) throws InfrastructureException, IOException {
        final DefaultPieDataset dataset = new DefaultPieDataset();
        dataset.setValue(expandLabel("ActivitiesRecent"), recentCount);
        dataset.setValue(expandLabel("ActivitiesOlder"), oldCount);
        dataset.setValue(expandLabel("ActivitiesNoActivity"), noActivityCount);
        return createPieChart(dataset, title);
    }

    private String createPieChart(DefaultPieDataset dataset, String title) throws InfrastructureException, IOException {
        Debug.logInfo("Charting dashboard [" + title + "]", MODULE);
        // set up the chart
        JFreeChart chart = ChartFactory.createPieChart(
                title,
                dataset,
                true,                       // include legend
                true,                       // tooltips
                false                       // urls
        );
        chart.setBackgroundPaint(Color.white);
        chart.setBorderVisible(true);
        chart.setPadding(new RectangleInsets(5.0, 5.0, 5.0, 5.0));

        // get a reference to the plot for further customization...
        final PiePlot plot = (PiePlot) chart.getPlot();
        plot.setBackgroundPaint(Color.white);
        plot.setCircular(true);
        plot.setLabelGenerator(new StandardPieSectionLabelGenerator(
            "{0}: {1} / {2}", NumberFormat.getNumberInstance(), NumberFormat.getPercentInstance()
        ));
        plot.setNoDataMessage("No data available");

        Color[] colors = {Color.decode("#" + infrastructure.getConfigurationValue(OpentapsConfigurationTypeConstants.ACTIVITIES_DASHBOARD_LEADS_NEW_COLOR)),
                          Color.decode("#" + infrastructure.getConfigurationValue(OpentapsConfigurationTypeConstants.ACTIVITIES_DASHBOARD_LEADS_OLD_COLOR)),
                          Color.decode("#" + infrastructure.getConfigurationValue(OpentapsConfigurationTypeConstants.ACTIVITIES_DASHBOARD_LEADS_NO_ACTIVITY_COLOR))};
        for (int i = 0; i < dataset.getItemCount(); i++) {
            Comparable<?> key = dataset.getKey(i);
            plot.setSectionPaint(key, colors[i]);
        }

        // save as a png and return the file name
        return ServletUtilities.saveChartAsPNG(chart, chartWidth, chartHeight, null);
    }

    private Timestamp getTimestampFromCutoffDays(int cutoffDays) {
        Calendar cal = Calendar.getInstance();
        cal.add(Calendar.DATE, -cutoffDays);
        return new Timestamp(cal.getTime().getTime());
    }

    private Long lookupDateDimIdForCutoff() throws ServiceException {
        try {
            return UtilEtl.lookupDateDimensionForTimestamp(getTimestampFromCutoffDays(cutoffDays), infrastructure.getDelegator());
        } catch (GenericEntityException e) {
            throw new ServiceException(e);
        }
    }

    private Set<String> findAllLeadIds(Set<String> allowedLeadPartyIds, PartyRepositoryInterface repository) throws RepositoryException {
        EntityCondition condition = EntityCondition.makeCondition(PartyRole.Fields.roleTypeId.name(), RoleTypeConstants.PROSPECT);
        if (allowedLeadPartyIds != null) {
            condition = EntityCondition.makeCondition(condition, EntityCondition.makeCondition(PartyRole.Fields.partyId.name(), EntityOperator.IN, allowedLeadPartyIds));
        }

        return Entity.getDistinctFieldValues(String.class, repository.findList(PartyRole.class, condition, Arrays.asList(PartyRole.Fields.partyId.name()), Arrays.asList(PartyRole.Fields.partyId.asc())), PartyRole.Fields.partyId);
    }
}
