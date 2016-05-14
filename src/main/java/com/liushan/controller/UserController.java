package com.liushan.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.liushan.model.User;

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
    public Map<String, User> list(){
        return users;
    }

    @RequestMapping(method=RequestMethod.GET, value="/users/{id}")
    public ModelAndView get(@PathVariable String id) throws Exception {
        System.out.print(id);

        User e = new User("liushan","aaabbb");

        ModelMap modelMap = new ModelMap();
        modelMap.put("aaa",e);

        ModelAndView model = new ModelAndView("list",modelMap);
//        model.addAllObjects("aaa",e);
//        model.addObject("aaa",e);

        return model;
    }


}
