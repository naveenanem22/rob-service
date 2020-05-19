package com.techietipps.robservice.dao;

import java.util.List;

import com.techietipps.robservice.models.Job;

public interface JobDao {

    public List<Job> getJobs();

    public Job getJobById(Integer id);

    public void updateJob(Job job);

}