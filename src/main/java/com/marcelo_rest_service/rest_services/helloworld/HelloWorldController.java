package com.marcelo_rest_service.rest_services.helloworld;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.web.bind.annotation.*;

import java.util.Locale;

@RestController
@RequestMapping("/")
public class HelloWorldController {

    @Autowired
    private MessageSource messageSource;
    @GetMapping("hello-world")
    public String helloWorld(){
        return "Hello Chelo";
    }

    @GetMapping("hello-world-bean")
    public HelloWorldBean helloWorldBean(){
        return new HelloWorldBean("Hello Chelo");
    }

    @GetMapping("hello-world-bean/path-variable/{name}")
    public HelloWorldBean helloWorldBean(@PathVariable String name){
        return new HelloWorldBean(String.format("Hello %s", name));
    }

//    @GetMapping("hello-world-internationalized")
//    public String helloWorldInternationalized(@RequestHeader(name="Accept-Language", required = false) Locale locale){
//        return messageSource.getMessage("good.morning.message", null, locale);
//    }

    @GetMapping("hello-world-internationalized")
    public String helloWorldInternationalized(){
        return messageSource.getMessage("good.morning.message", null, LocaleContextHolder.getLocale());
    }
}
