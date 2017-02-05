package com.accedius.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
@RequestMapping("/master")
public class MasterController {

    @RequestMapping(value="",method=RequestMethod.GET)
    public String get()
    {
        return "master";
    }

    @RequestMapping(value="/{name}",method=RequestMethod.GET)
    public String getName(@PathVariable String name)
    {
        return "Hello" + name ;
    }



}
