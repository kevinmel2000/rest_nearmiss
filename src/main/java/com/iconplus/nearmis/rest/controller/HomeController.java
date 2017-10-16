package com.iconplus.nearmis.rest.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping(value = "/")
public class HomeController {

    @RequestMapping(method = RequestMethod.GET)
    public Map home(){
        Map m = new HashMap();
        m.put("response", 1);
        m.put("data", "Welcome to API Nearmiss. This Apps is powered by Indonesia Comnet Plus");
        return m;
    }
}
