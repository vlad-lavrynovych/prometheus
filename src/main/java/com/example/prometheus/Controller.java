package com.example.prometheus;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class Controller {

    private final Metrics metrics;

    @GetMapping("/")
    public String hello() {
        metrics.getSuccess().increment();
        return "hello";
    }
}
