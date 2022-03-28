package com.tts.myAwesomeProject.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/* Controllers allow us to route and orchestrate actions based on endpoints (URLs) that are
hit on your website. We're basically making a kinda-sorta "API" for our site.
 */
@RestController /* this annotation basically points Spring server and devs to the
MainController class to handle web requests.
In this instance, RestController is rendering the String in the home() method back to the caller
home() is called, and String "Hello World!" is returned */
public class MainController {
    @RequestMapping ("/") /* this annotation provides routing info. Specifically for the
    statements that follow, any HTTP request with the "/" path should be mapped to the home()
    method.
    IE if you hit our website with a request (http:localhost:4000).. */
    public String home() {
        return "Hello World!"; //.. we're going to return a String of "Hello World"
    }
}
