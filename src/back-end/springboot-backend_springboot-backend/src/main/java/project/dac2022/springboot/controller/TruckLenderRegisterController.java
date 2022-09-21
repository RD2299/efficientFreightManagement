package project.dac2022.springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import project.dac2022.springboot.model.TruckLendorRegister;
import project.dac2022.springboot.service.TruckLendorRegisterService;




@RestController
@RequestMapping("/tlregister")
@CrossOrigin("*")
public class TruckLenderRegisterController {
	
	
	@Autowired
	TruckLendorRegisterService TLR_S;
	
	
	@PostMapping
	public ResponseEntity<?> TruckLendorRegistration(@RequestBody TruckLendorRegister tl_R)
	{
		return TLR_S.saveTruckLendor(tl_R);
	}

}
