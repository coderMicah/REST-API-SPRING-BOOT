package com.micah.rest.webservices.helloworld;

import java.util.Locale;

import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
    private MessageSource msgSrc;
    public HelloWorldController(MessageSource msgSrc){
        this.msgSrc = msgSrc;
    }


    @GetMapping(path = "hello-world")
    public String helloWorld() {
        return "Hello World!";
    }

    @GetMapping(path = "/hello-world-bean")
    public HelloWorldBean helloWorldBean() {
        return new HelloWorldBean("Hello World from Bean");
    }

    // Path Parameters
    @GetMapping(path = "/hello-world-bean/path-variable/{name}")
    public HelloWorldBean helloWorldBeanPathVariable(@PathVariable String name) {
        return new HelloWorldBean(String.format("Hello World, %s", name));
    }

    //i18n
    @GetMapping(path = "/hello-world-i18n")
    public String helloWorldInternationalization() {
        Locale locale = LocaleContextHolder.getLocale();
        return msgSrc.getMessage("good.morning.message", null, "Default Message", locale) ;
    }
}
