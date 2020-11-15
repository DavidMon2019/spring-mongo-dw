package net.javaguides.springboot.websocket.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;

@CrossOrigin
public interface GreetingController {
    @RequestMapping("/greeting")
    String greeting();

}