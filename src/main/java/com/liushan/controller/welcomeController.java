package com.liushan.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by liushan03 on 16/3/17.
 */
@Controller
public class welcomeController {

    @RequestMapping(value = "/welcome", method = RequestMethod.GET)
    public String welcome(){
        System.out.println("function welcome!");
        return "welcome";
    }
}
