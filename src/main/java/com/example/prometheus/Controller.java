package com.example.prometheus;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequiredArgsConstructor
public class Controller {

    private final Metrics metrics;

    @GetMapping("/")
    public String hello() {
        metrics.getSuccess().increment();
        log.info("Request to hello endponint");
        return "hello";
    }
}
