package com.cooksdev.controllers;

import com.cooksdev.model.GlobalProperties;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@EnableAutoConfiguration
public class TestController {

    private static final Logger logger = LoggerFactory.getLogger(TestController.class);

    private GlobalProperties global;

    @Autowired
    public void setGlobal(GlobalProperties global) {
        this.global = global;
    }

    @Autowired
    private GlobalProperties globalProperties;

    public void setGlobalProperties(GlobalProperties globalProperties) {
        this.globalProperties = globalProperties;
    }

    @RequestMapping("/")
    @ResponseBody
    String home() {
//        logger.info("username = " + user.getName());
//        logger.info("user age = " + String.valueOf(user.getAge()));
//        logger.info("books[0] name = " + user.getBooks().get(0).getName());
//        logger.info("books[0] author =" + user.getBooks().get(0).getAuthor());
        return "Hello World!";
    }

}
