package com.root.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Created by hs on 2017/3/31.
 */
@Configuration
@ComponentScan(basePackages = {"com.root.service"})
public class ServiceConfig {
}
