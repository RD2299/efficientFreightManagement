package project.dac2022.springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import project.dac2022.springboot.model.AdminRegister;
//import project.dac2022.springboot.model.CustomerRegister;
import project.dac2022.springboot.service.AdminLoginService;

@RestController
@RequestMapping("/adminlogin")
@CrossOrigin("*")
public class AdminLoginController {
	
	@Autowired
	AdminLoginService A_LS;
	
	
	@GetMapping
	public ResponseEntity<AdminRegister> AdminLogin(@RequestBody AdminRegister ar )
	{
		return A_LS.validateAdmin(ar);
	}
	
	

}
