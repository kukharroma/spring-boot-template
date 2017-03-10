package com.cooksdev.controllers;

import com.cooksdev.model.GlobalProperties;
import com.cooksdev.model.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestController {

    private static final Logger logger = LoggerFactory.getLogger(TestController.class);

//    private User user;
//
//    @Autowired
//    public void setUser(User user) {
//        this.user = user;
//    }

    private GlobalProperties globalProperties;

    @Autowired
    public void setGlobalProperties(GlobalProperties globalProperties) {
        this.globalProperties = globalProperties;
    }

    private User user;

    @Autowired
    public void setUser(User user) {
        this.user = user;
    }

    @RequestMapping("/")
    @ResponseBody
    String home() {
        logger.info("username = " + user.getName());
        logger.info("user age = " + String.valueOf(user.getAge()));
//        logger.info("books[0] name = " + user.getBooks().get(0).getName());
//        logger.info("books[0] author =" + user.getBooks().get(0).getAuthor());
        return "Hello World!";
    }

}
