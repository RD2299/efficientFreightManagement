package project.dac2022.springboot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;

import project.dac2022.springboot.model.TruckLendorRegister;
import project.dac2022.springboot.repository.TruckLenderRepository;

@Service
public class TruckLendorRegisterService {

	@Autowired
	TruckLenderRepository TL_R;
	
	@PostMapping
	public ResponseEntity<?> saveTruckLendor(TruckLendorRegister tl_R) {
		// TODO Auto-generated method stub
		try {
			TL_R.save(tl_R);
			return new ResponseEntity<>(HttpStatus.CREATED);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			return new ResponseEntity<>(HttpStatus.EXPECTATION_FAILED);
		}
	}

}
