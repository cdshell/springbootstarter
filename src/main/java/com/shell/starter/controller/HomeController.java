package com.shell.starter.controller;

import com.shell.starter.entity.Message;
import com.shell.starter.repository.JsonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    private JsonRepository repository;

    @Autowired
    public HomeController(JsonRepository repository) {
        this.repository = repository;
    }

    @RequestMapping(value = "/", method = {RequestMethod.GET, RequestMethod.POST})
    public String index() {
        Message msg = new Message("你好，世界！");
        return this.repository.jsonString(msg);
    }

    @RequestMapping(value = "/json", method = {RequestMethod.GET, RequestMethod.POST})
    public String json() {
        Message msg = new Message("Hello, World!");
        return this.repository.jsonString(msg);
    }
}
