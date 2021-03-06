package com.aobin.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by root on 7/26/17.
 */

//@SpringBootApplication
@EnableAutoConfiguration
@RestController
public class Application
{

    @RequestMapping("/")
    String home()
    {
        return "Hello World!";
    }

    public static void main(String[] args)
    {
        SpringApplication.run(Application.class, args);
    }
}
