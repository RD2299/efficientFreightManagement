package project.dac2022.springboot;

import java.io.File;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import project.dac2022.springboot.controller.CustomerRegisterController;

@SpringBootApplication
public class SpringbootBackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootBackendApplication.class, args);
		
		
		//new File(CustomerRegisterController.uploadDirectory).mkdir();
	}

}