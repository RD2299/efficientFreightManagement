package project.dac2022.springboot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;

import project.dac2022.springboot.model.CustomerRegister;
import project.dac2022.springboot.repository.CustomerRepository;


@Service
public class CustomerRegisterService {

	@Autowired
	CustomerRepository C_R;
	
	@PostMapping
	public ResponseEntity<?> saveCustomer(CustomerRegister cr){
		try {
			C_R.save(cr);
			return new ResponseEntity<>(HttpStatus.CREATED);
		}catch(Exception e) {
			return new ResponseEntity<>(HttpStatus.EXPECTATION_FAILED);
		}
	}
}
