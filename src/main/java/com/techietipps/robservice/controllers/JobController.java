package com.techietipps.robservice.controllers;

import java.util.List;

import com.techietipps.robservice.models.Job;
import com.techietipps.robservice.services.JobService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JobController {

    @Autowired
    @Qualifier("jobServiceImpl")
    private JobService jobService;

    @GetMapping("/jobs")
    public List<Job> getJobs() {

        return jobService.getJobs();

    }

    @GetMapping(path = "/job/{id}")
    public Job getJobById(@PathVariable("id") Integer id) {
        return jobService.getJobById(id);
    }

    @PutMapping(path = "/job")
    public String updateJob(@RequestBody Job job) {

        jobService.updateJob(job);
        return "Success";

    }

    @PostMapping(path = "/job")
    public void createJob(@RequestBody Job job) {
        jobService.createJob(job);
    }

}
