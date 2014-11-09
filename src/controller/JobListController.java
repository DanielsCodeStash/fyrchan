package controller;

import model.DownerModel;
import shared.JobListItem;
import view.joblist.JobListPanel;


public class JobListController
{
    private JobListPanel jobListPanel;
    private DownerModel downerModel;
    private Fyrchan fyrchan;

    public JobListController(JobListPanel jobListPanel, DownerModel downerModel, Fyrchan fyrchan)
    {
        this.jobListPanel = jobListPanel;
        this.downerModel = downerModel;
        this.fyrchan = fyrchan;

        jobListPanel.onRemoveButtonClicked(this::removeButtonClicked);
        jobListPanel.onRowClicked(this::onRowClicked);
    }

    private void removeButtonClicked(JobListItem item)
    {
        downerModel.removeAutoUpdateItem(item);
    }

    private void onRowClicked(JobListItem item)
    {
        downerModel.setNewActiveThreadUrl(item.getThreadUrl());
    }



}
