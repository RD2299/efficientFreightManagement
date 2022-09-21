package project.dac2022.springboot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import project.dac2022.springboot.model.CustomerRegister;
import project.dac2022.springboot.repository.CustomerRepository;

@Service
public class CustomerLoginService {

	@Autowired
	CustomerRepository C_R;
	
	
	@GetMapping
public ResponseEntity<CustomerRegister> validateCustomer(CustomerRegister cr) {
		
		CustomerRegister cust=C_R.findByEmail(cr.getC_Email());
		
		if(cust.getC_Email().equals(cr.getC_Email()) && cust.getC_Password().equals(cr.getC_Password()) )
			return new ResponseEntity<>(cust,HttpStatus.OK);
		else
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
	}
	
}
