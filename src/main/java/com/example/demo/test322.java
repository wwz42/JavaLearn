package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@Controller
public  class test322
{

    @RequestMapping(value = "/local",method = RequestMethod.GET)
    public String startHome(){
     return "Home";
    }


}
