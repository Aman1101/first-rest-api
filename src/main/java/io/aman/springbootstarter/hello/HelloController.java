package io.aman.springbootstarter.hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    //RequestMapping annotation only maps to GET method.
    @RequestMapping("/hello")
    public String sayHi(){
        return "Hi";
    }
}
