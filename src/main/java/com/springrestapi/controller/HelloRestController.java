package com.springrestapi.controller;

/**
 * Create a Rest Controller to demonstrate the various HTTP Methods and respond hello messages to the User.
 */

import com.springrestapi.model.UserInfo;
import org.springframework.web.bind.annotation.*;


@RestController
public class HelloRestController {

    /**
     * purpose : Warn the request mapping is done then all the statements  of sayHello gets executed
     * @return Hello Form BridgeLabz
     */
    @RequestMapping(value="/hello")
    public String sayHello(){
        return "Hello Form BridgeLabz";
    }

    /**
     * @RequestParam : Mapping HTTP GET Request onto specific Handler Methods.
     *                 When mapping is done all statements of  sayHello method get executed
     * URL: localhost:8080/getMessage?name=Akshay
     */
    @GetMapping(value="/getMessage")
    public String sayHello(@RequestParam(value = "name" )String name){
        return "Hello " + name + " Welcome To BridgeLabz";
    }

     /** Purpose : Use GET Request Method and pass name as path variable
     * @param name
     * @return Hello Akshay Kumar Welcome To BridgeLabz
     * URL: localhost:8080/param/Akshay%20Kumar
     */
    @GetMapping(value= "/param/{name}")
    public String sayHelloParam(@PathVariable String name){
        return "Hello " + name + " Welcome To BridgeLabz";
    }

    /** @PostMapping : this annotation handle the post type of annotation
     * @RequestBody : is used to convert the body of HTTP request to java class object
     * URL: http://localhost:8080/post?Content-type=json : URL request through POSTMAN
     * JSON:{
     *          "firstName":"Akshay",
     *          "lastName" :"Kumar"
     *
     *      }
     * O/P ; Hello Akshay Kumar Welcome To BridgeLabz
     */
    @PostMapping("/post")
    public String sayHelloPost(@RequestBody UserInfo userInfo ){
        return "Hello " + userInfo.getFirstName() +" "+userInfo.getLastName() + " Welcome To BridgeLabz";
    }

     /** @PostMapping: mapping HTTP POST requests onto specific handler methods Use POST Request Method and pass first name and last name in the Body;
      * URL: http://localhost:8080/hello/put/Akshay?lastName=Kumar
      * O/P: Hello Akshay Kumar Welcome To BridgeLabz
      */
    @PutMapping("/hello/put/{firstName}")
    public String sayHello(@PathVariable String firstName, @RequestParam (value = "lastName") String lastName){
        return "Hello " + firstName + " " + lastName + " Welcome to BridgeLabz";

    }


}
