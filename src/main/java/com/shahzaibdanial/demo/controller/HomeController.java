package com.shahzaibdanial.demo.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {



        @RequestMapping(value = "/")

        public String sayHello()
        {
            return "Hello Shahzaib!";

        }


    @PostMapping (value = "/")

    public String sayHelloPost()
    {
        return "Hello  im getting a post Shahzaib!";

    }


    }

