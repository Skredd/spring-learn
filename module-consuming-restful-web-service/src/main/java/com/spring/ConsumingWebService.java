package com.spring;

import com.spring.model.QuoteResource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class ConsumingWebService {

    private static final Logger logger = LoggerFactory.getLogger(ConsumingWebService.class);

    public static void main(String[] args) {
        SpringApplication.run(ConsumingWebService.class, args);
    }

    @Bean
    public RestTemplate restTemplate(RestTemplateBuilder builder) {
        return builder.build();
    }

    @Bean
    public CommandLineRunner run(RestTemplate restTemplate) throws Exception {
        return args -> {
            QuoteResource quote = restTemplate.getForObject(
                    "http://localhost:8080/api/random", QuoteResource.class
            );
            logger.info(quote.getValue().toString());
        };
    }
}