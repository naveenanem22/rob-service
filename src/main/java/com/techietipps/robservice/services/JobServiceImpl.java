package com.techietipps.robservice.services;

import java.util.List;

import com.techietipps.robservice.dao.JobDao;
import com.techietipps.robservice.models.Job;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service("jobServiceImpl")
public class JobServiceImpl implements JobService {

    @Autowired
    @Qualifier("jobDaoImpl")
    private JobDao jobDao;

    @Autowired
    private AmqpTemplate amqpTemplate;

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

    public void createJob(Job job) {
        // Create an entry in the DB
        Integer jobId = jobDao.createJob(job);

        // Send a message to RabbitMQ post successful creation of the job
        amqpTemplate.convertAndSend("directExchange", "recruitment", "JOB_CREATED: " + jobId);

    }
}