package com.techietipps.robservice.dao;

import java.util.ArrayList;
import java.util.List;

import com.techietipps.robservice.models.Job;

import org.springframework.stereotype.Repository;
import com.techietipps.robservice.dao.JobDao;

@Repository("jobDaoImpl")
public class JobDaoImpl implements JobDao {

    @Override
    public List<Job> getJobs() {

        Job job1 = new Job();
        job1.setTitle("Project Engineer");
        job1.setDescription("Need java developer level 1.");
        job1.setId(123456);
        job1.setNumberOfVacancies(2);

        Job job2 = new Job();
        job2.setTitle("Senior Software Engineer");
        job2.setDescription("Need java developer level 2.");
        job2.setId(123457);
        job2.setNumberOfVacancies(5);

        List<Job> jobs = new ArrayList<Job>();
        jobs.add(job1);
        jobs.add(job2);

        return jobs;
    }

    @Override
    public Job getJobById(Integer id) {
        Job job1 = new Job();
        job1.setTitle("Project Engineer");
        job1.setDescription("Need java developer level 1.");
        job1.setId(123456);
        job1.setNumberOfVacancies(2);
        return job1;
    }

    @Override
    public void updateJob(Job job) {

    }

    public Integer createJob(Job job) {
        return 123456;
    }

}