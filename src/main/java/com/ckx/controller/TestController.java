package com.ckx.controller;

import com.ckx.model.Person;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by chen- on 2016-11-29.
 */
@RestController
public class TestController {

    @RequestMapping("search")
    public Person search(String personName){
        return new Person(personName, 32, "合肥");
    }

}
