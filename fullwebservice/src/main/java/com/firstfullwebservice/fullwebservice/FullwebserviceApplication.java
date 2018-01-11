package com.firstfullwebservice.fullwebservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class FullwebserviceApplication {
	
	ApplicationContext applicationContext;

	public static void main(String[] args) {
		ApplicationContext applicationContext = SpringApplication.run(FullwebserviceApplication.class, args);
	}
	
	@GetMapping("/")
    public String hello() {
            return "Welcome to Kalyan's full set of web services!";
    }
	
	@GetMapping("/isCatOrDog")
    public CatBean helloWorld() {
			CatBean catbean = new CatBean ("Kitty", "white");
            return catbean;
            		//applicationContext.getBean(CatBean.class);
    }
	
	//Add a GET that returns an object/JSON
	
	
	//Add a PUT that creates something
}
