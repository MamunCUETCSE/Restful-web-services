package com.test.restfulservices;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.concurrent.atomic.AtomicLong;

@Controller
public class GreetingsController {
    public static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();
    @GetMapping("/greetings")
    public Greetings greetings(@RequestParam(value = "name", defaultValue = "World") String name)
    {
        return new Greetings(counter.incrementAndGet(),String.format(template,name));
    }
}
