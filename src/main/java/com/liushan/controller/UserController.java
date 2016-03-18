package com.liushan.controller;

import com.liushan.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by liushan03 on 16/3/18.
 */

@Controller
@RequestMapping("/user")
public class UserController {

    private Map<String,User> users  = new HashMap<String, User>();
    public UserController(){
        users.put("111",new User("liushan","liushan"));
        users.put("222",new User("shao","shao"));
    }

    @RequestMapping(value = "/users",method = RequestMethod.GET)
    public String list(Model model){
        //model.addAllAttributes("users",users);
        return "list";
    }

}
