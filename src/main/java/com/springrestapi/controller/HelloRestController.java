package com.springrestapi.controller;

/**
 * Create a Rest Controller to demonstrate the various HTTP Methods and respond hello messages to the User.
 */

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HelloRestController {

    /**
     * purpose : Warn the request mapping is done then all the statements  of sayHello gets executed
     * @return
     */
    @RequestMapping(value="/hello")
    public String sayHello(){
        return "Hello Form BridgeLabz";
    }

    /**
     * @RequestParam : Mapping HTTP GET Request onto specific Handler Methods.
     *                 When mapping is done all statements of  sayHello method get executed
     *  curl : localhost:8080/getMessage?name=Akshay
     */
    @GetMapping(value="/getMessage")
    public String sayHello(@RequestParam(value = "name" )String name){
        return "Hello " + name + " Welcome To BridgeLabz";
    }
}
