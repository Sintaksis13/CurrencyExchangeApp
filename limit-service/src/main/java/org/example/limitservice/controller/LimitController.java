package org.example.limitservice.controller;

import lombok.RequiredArgsConstructor;
import org.example.limitservice.LimitConfiguration;
import org.example.limitservice.domain.Limit;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/limits")
@RequiredArgsConstructor
public class LimitController {
    private final LimitConfiguration limitConfiguration;

    @GetMapping
    public Limit retrieveLimit() {
        return new Limit(
                limitConfiguration.getMin(),
                limitConfiguration.getMax()
        );
    }
}
