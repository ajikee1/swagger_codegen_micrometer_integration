package io.tej.SwaggerSpringDemo;

import io.micrometer.prometheus.PrometheusConfig;
import io.micrometer.prometheus.PrometheusMeterRegistry;
import io.tej.SwaggerCodgen.api.CounterApi;
import io.tej.SwaggerCodgen.model.Count;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Counter implements CounterApi {

    @Override
    public ResponseEntity<Void> addCounter(Count body) {
        System.out.println(body.getName());
        System.out.println(body.getBaseUnit());
        System.out.println(body.getDescription());
        System.out.println(body.getTags());

        PrometheusMeterRegistry prometheusRegistry = new PrometheusMeterRegistry(PrometheusConfig.DEFAULT);

        io.micrometer.core.instrument.Counter counter = io.micrometer.core.instrument.Counter
                .builder(body.getName())
                .baseUnit(body.getBaseUnit()) // optional
                .description(body.getDescription()) // optional
                .register(prometheusRegistry);

        counter.increment(2);
        counter.increment(5);
        counter.increment(7);

        double counterCount = prometheusRegistry.get("counter").name("test_counter").counter().count();
        System.out.println(counterCount);

        return new ResponseEntity<>(HttpStatus.ACCEPTED);
    }

    @Override
    public ResponseEntity<Void> addCounter(Counter body) {
        return null;
    }

}
