package com.codebleeders.learning;

import org.springframework.hateoas.Link;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.*;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;



/**
 * Created by pagarwal on 4/22/17.
 */
@RestController
public class GreetController {

    @RequestMapping(value = "/greet")
    @ResponseBody
    public HttpEntity<Greet> greet(@RequestParam(value = "name", required = false, defaultValue = "HATHEOS") String name) {
        Greet greet =  new Greet("Hello "+name);
        greet.add(linkTo(methodOn(GreetController.class).greet(name)).withSelfRel());

        return new ResponseEntity<Greet>(greet, HttpStatus.OK);
    }
}
