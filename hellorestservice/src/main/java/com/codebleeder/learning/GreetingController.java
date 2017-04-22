package com.codebleeder.learning;

import org.springframework.http.HttpMethod;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by pagarwal on 4/22/17.
 */
@RestController
public class GreetingController {

    @RequestMapping(value = "/", method = RequestMethod.GET)
    Greet greet(){
        return new Greet("Hello World!");
    }

    @RequestMapping(value = "/greet", method = RequestMethod.GET)
    String hello(){
        return "hello world!";
    }
}
