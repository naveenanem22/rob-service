package com.techietipps.robservice.services;

import java.util.List;

import com.techietipps.robservice.models.Job;

public interface JobService {

    public List<Job> getJobs();

    public Job getJobById(Integer id);

    public void updateJob(Job job);

}