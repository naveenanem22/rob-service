package com.techietipps.robservice.config;

import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.DirectExchange;
import org.springframework.amqp.core.Queue;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;

@Configuration
public class RabbitMqConfig {

    @Autowired
    private Environment env;

    @Bean(value = "recruitmentQueue", name = "recruitmentQueue")
    Queue recruitmentQueue() {
        return new Queue(env.getProperty("rob.rabbitmq.queue.recruitment"), false);
    }

    @Bean(value = "onboardingQueue", name = "onboardingQueue")
    Queue onboardingQueue() {
        return new Queue(env.getProperty("rob.rabbitmq.queue.onboarding"), false);
    }

    @Bean(value = "directExchange", name = "directExchange")
    DirectExchange exchange() {
        return new DirectExchange(env.getProperty("rob.rabbitmq.exchange.directExchange"));
    }

    @Bean
    Binding recruitmentBinding(Queue recruitmentQueue, DirectExchange directExchange) {
        return BindingBuilder.bind(recruitmentQueue).to(directExchange)
                .with(env.getProperty("rob.rabbitmq.routing.recruitmentrouting"));
    }

    Binding onboardingBinding(Queue onboardingQueue, DirectExchange directExchange) {
        return BindingBuilder.bind(onboardingQueue).to(directExchange)
                .with(env.getProperty("rob.rabbitmq.routing.onboardingrouting"));
    }

}