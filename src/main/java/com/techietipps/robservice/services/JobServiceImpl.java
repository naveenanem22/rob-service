package com.techietipps.robservice.services;

import java.util.List;

import com.techietipps.robservice.dao.JobDao;
import com.techietipps.robservice.models.Job;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service("jobServiceImpl")
public class JobServiceImpl implements JobService {

    @Autowired
    @Qualifier("jobDaoImpl")
    private JobDao jobDao;

    @Override
    public List<Job> getJobs() {
        return jobDao.getJobs();
    }

    @Override
    public Job getJobById(Integer id) {
        return jobDao.getJobById(id);
    }

    @Override    
    public void updateJob(Job job) {
        jobDao.updateJob(job);
    }

}