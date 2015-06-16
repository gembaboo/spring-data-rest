package com.gembaboo.examples.springdatarest.config;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.orm.jpa.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@EnableAutoConfiguration
@ComponentScan
@EnableJpaRepositories(basePackages = "com.gembaboo.examples.springdatarest.service")
@EntityScan(basePackages = "com.gembaboo.examples.springdatarest.domain")
public class SpringConfiguration {

}
