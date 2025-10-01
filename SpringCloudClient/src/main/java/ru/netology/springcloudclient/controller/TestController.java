package ru.netology.springcloudclient.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class TestController {

    @Value("${active.version}")
    private String fromConfiguration;

    @GetMapping
    public String get() {
        return fromConfiguration;
    }
}
