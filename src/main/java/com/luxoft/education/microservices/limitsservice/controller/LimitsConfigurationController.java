package com.luxoft.education.microservices.limitsservice.controller;

import com.luxoft.education.microservices.limitsservice.config.Configuration;
import com.luxoft.education.microservices.limitsservice.config.LimitConfiguration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LimitsConfigurationController {

    private Configuration configuration;

    public LimitsConfigurationController(Configuration configuration) {
        this.configuration = configuration;
    }

    @GetMapping("/limits")
    public LimitConfiguration retrieveLimitsFromConfiguration() {
        return new LimitConfiguration(configuration.getProfileName(), configuration.getMinimum(), configuration.getMaximum());
    }

}
