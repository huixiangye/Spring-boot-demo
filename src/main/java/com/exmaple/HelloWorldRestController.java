package com.exmaple;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by yehuixiang on 6/27/18.
 */
@RestController
public class HelloWorldRestController {

    @RequestMapping(value = "/hello",method = RequestMethod.GET)
    public String helloWorld(){return "Hello nike running";}
}
