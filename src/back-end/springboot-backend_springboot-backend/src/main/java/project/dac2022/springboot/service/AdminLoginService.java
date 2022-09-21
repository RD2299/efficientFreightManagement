package project.dac2022.springboot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import project.dac2022.springboot.model.AdminRegister;
//import project.dac2022.springboot.model.CustomerRegister;
import project.dac2022.springboot.repository.AdminRepository;

@Service
public class AdminLoginService {
	
	@Autowired
	AdminRepository A_R;
	
	@GetMapping
	public ResponseEntity<AdminRegister> validateAdmin(AdminRegister ar) {
		// TODO Auto-generated method stub
		
		AdminRegister admin=A_R.findByEmail(ar.getA_Email());
		
		if(admin.getA_Email().equals(ar.getA_Email()) && admin.getA_Password().equals(ar.getA_Password()))
			return new ResponseEntity<>(admin,HttpStatus.OK);
		else
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		
		
	}

}
