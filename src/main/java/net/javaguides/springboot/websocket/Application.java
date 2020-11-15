package net.javaguides.springboot.websocket;

import com.netflix.discovery.EurekaClient;
import net.javaguides.springboot.websocket.controller.GreetingController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Lazy;
import org.springframework.web.bind.annotation.RestController;

@EnableEurekaClient
@RestController
@SpringBootApplication
public class Application implements GreetingController {
//
    @Qualifier("eurekaClient")
    @Autowired
    @Lazy
    private EurekaClient eurekaClient;

    @Value("${spring.application.name}")
    private String appName;

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

//    @Override
//    public String greeting() {
//        return null;
//    }
    @Override
    public String greeting() {
        return String.format(
                "Microservicio:  '%s'!", eurekaClient.getApplication(appName).getName());
    }
}
