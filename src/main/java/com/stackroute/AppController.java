package com.stackroute;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class AppController {

    @RequestMapping(value = "/",method = RequestMethod.GET)
    public String loginUserPage(Model model){
        return "index";
    }
    @RequestMapping(value = "/displayUser",method = RequestMethod.POST)
    public String displayUserPage(
            @RequestParam(value = "userName") String userName,
            @RequestParam(value = "userPassword") String userPassword, Model model
    ){
        User user = new User(userName,userPassword);
        model.addAttribute("user",user);
        System.out.println("Login User is : " + user.getName());
        return "displayUser";
    }
}


