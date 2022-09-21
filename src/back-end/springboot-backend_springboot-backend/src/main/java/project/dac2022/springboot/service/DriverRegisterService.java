package project.dac2022.springboot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;


import project.dac2022.springboot.model.DriverRegister;
import project.dac2022.springboot.repository.DriverRepository;


@Service
public class DriverRegisterService {

	@Autowired
	DriverRepository D_R;
	
	
	@PostMapping
	public ResponseEntity<?> saveDriver(DriverRegister dR) {
		// TODO Auto-generated method stub
			try {
				D_R.save(dR);
				return new ResponseEntity<>(HttpStatus.CREATED);
			}catch(Exception e) {
				return new ResponseEntity<>(HttpStatus.EXPECTATION_FAILED);
			}
		}
	}

