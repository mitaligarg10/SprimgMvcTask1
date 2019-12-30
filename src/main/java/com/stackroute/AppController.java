package com.stackroute;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class AppController {

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String greetings(Model model) {
        User user = new User("Mitali", 25);
        model.addAttribute("user", user);
        System.out.println(user.getName());
        System.out.println(user.getAge());
        return "index";
    }
}
