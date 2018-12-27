package com.code.configclientdemo;

import com.code.configclientdemo.service.PersonProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@SpringBootApplication
public class ConfigClientDemoApplication {

	@Autowired
	private PersonProperties personProperties;

	@Value("${book.name}")
	private String name;

	@RequestMapping("/hi")
	public String hi(){
		return  name;
	}

	@Value("${person.name}")
	private String name1;

	@RequestMapping("/hi1")
	public String name1(){
		return name1;
	}

	@RequestMapping("/person")
	public PersonProperties person(){
		return  personProperties;
	}


	public static void main(String[] args) {
		SpringApplication.run(ConfigClientDemoApplication.class, args);
	}

}

