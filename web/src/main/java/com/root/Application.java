package com.root;

import com.root.config.DaoConfig;
import com.root.config.ServiceConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

/**
 * Created by hs on 2017/5/5.
 */
@SpringBootApplication
@Import({DaoConfig.class, ServiceConfig.class})
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class);
    }
}
