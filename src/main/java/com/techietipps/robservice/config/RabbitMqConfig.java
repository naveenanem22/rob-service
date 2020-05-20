package com.techietipps.robservice.config;

import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.DirectExchange;
import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RabbitMqConfig {

    @Bean(value = "recruitmentQueue", name = "recruitmentQueue")
    Queue recruitmentQueue() {
        return new Queue("recruitmentQueue", false);
    }

    @Bean(value = "onboardingQueue", name = "onboardingQueue")
    Queue onboardingQueue() {
        return new Queue("onboardingQueue", false);
    }

    @Bean(value = "directExchange", name = "directExchange")
    DirectExchange exchange() {
        return new DirectExchange("directExchange");
    }

    Binding recruitmentBinding(Queue recruitmentQueue, DirectExchange directExchange){
        return BindingBuilder.bind(recruitmentQueue).to(directExchange).with("recruitment");
    }

    Binding onboardingBinding(Queue onboardingQueue, DirectExchange directExchange){
        return BindingBuilder.bind(onboardingQueue).to(directExchange).with("onboarding");
    }

}