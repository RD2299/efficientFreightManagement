package project.dac2022.springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import project.dac2022.springboot.model.CustomerRegister;
import project.dac2022.springboot.service.CustomerLoginService;

@RestController
@RequestMapping("/clogin")
@CrossOrigin("*")
public class CustomerLoginController {
	
	@Autowired
	CustomerLoginService C_LS;
	
	
	@GetMapping
	public ResponseEntity<CustomerRegister> CustomerLogin(@RequestBody CustomerRegister cr ) {

		//C_LS.startMethod();
		return C_LS.validateCustomer(cr); 
	  }

}
