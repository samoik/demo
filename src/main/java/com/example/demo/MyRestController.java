package com.example.demo;

import org.springframework.web.bind.annotation.*;

@RestController
public class MyRestController {

    @GetMapping("/hello")
    @ResponseBody
    public String sayHello(@RequestParam(name="name", required=false, defaultValue="Stranger") String name) {
        return "Hello "+name;
    }

}
