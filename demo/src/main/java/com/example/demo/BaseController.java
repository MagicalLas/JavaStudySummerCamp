package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class BaseController {
    @RequestMapping(value = "/")
    public @ResponseBody String view(){
        return "test";
    }

    @RequestMapping(value = "/LAS")
    public String view_(Model m){
        m.addAttribute("message","Spring Fuck");
        return "test";
    }
}
