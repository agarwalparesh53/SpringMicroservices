package com.codebleeders.learning;

import org.springframework.hateoas.ResourceSupport;

/**
 * Created by pagarwal on 4/22/17.
 */
public class Greet extends ResourceSupport {

    private String message;

    public Greet(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {

        this.message = message;
    }
}
