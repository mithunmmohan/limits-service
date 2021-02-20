package com.learning.services.controller;

import com.learning.services.config.Configuration;
import com.learning.services.model.Limits;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LimitsController {

    @Autowired
    Configuration configuration;

    @GetMapping("/limits")
    public Limits getlimits() {
        return Limits.builder().maximum(configuration.getMaximum()).minimum(configuration.getMinimum()).build();
    }
}
