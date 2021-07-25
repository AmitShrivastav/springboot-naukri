package com.refwise.naukri.naukri;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;


@SpringBootApplication
//@EnableAutoConfiguration
//@EnableAspectJAutoProxy
public class NaukriApplication {

	public static void main(String[] args) {
		SpringApplication.run(NaukriApplication.class, args);
	}

}



