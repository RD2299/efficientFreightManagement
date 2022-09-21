package project.dac2022.springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import project.dac2022.springboot.model.DriverRegister;
import project.dac2022.springboot.service.DriverRegisterService;

@RestController
@RequestMapping("/dregister")
@CrossOrigin("*")
public class DriverRegisterController {

	@Autowired
	DriverRegisterService DR_S;
	
	
	@PostMapping
	public ResponseEntity<?> DriverRegistration(@RequestBody DriverRegister dR)
	{
		return DR_S.saveDriver(dR);
	}
	
	
}
