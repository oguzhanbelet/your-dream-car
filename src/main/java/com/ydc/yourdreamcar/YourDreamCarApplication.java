package com.ydc.yourdreamcar;

import com.redis.om.spring.annotations.EnableRedisDocumentRepositories;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@EnableWebMvc
@EnableRedisDocumentRepositories
@SpringBootApplication
public class YourDreamCarApplication {

    public static void main(String[] args) {
        SpringApplication.run(YourDreamCarApplication.class, args);
    }
}
