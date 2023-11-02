package com.example.prometheus;

import io.micrometer.core.instrument.Counter;
import io.micrometer.core.instrument.MeterRegistry;
import lombok.Getter;
import org.springframework.stereotype.Component;

@Component
@Getter
public class Metrics {

    private final Counter success;

    public Metrics(MeterRegistry registry) {
        this.success = Counter.builder("request_success")
                .description("request was successful").register(registry);
    }
}
