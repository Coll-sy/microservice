package com.hand.springcloud.cfgbean;

import com.hand.myrule.RandomRule_Hand;
import com.netflix.loadbalancer.IRule;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class ConfigBean {

    @LoadBalanced
    @Bean
    public RestTemplate getRestTemplate() {
        return new RestTemplate();
    }

    @Bean
    public IRule getIRule(){
//        return new RoundRobinRule();

//        return new RandomRule();
//        return new RetryRule();
        return new RandomRule_Hand();
    }

}
