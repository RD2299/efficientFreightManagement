package project.dac2022.springboot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import project.dac2022.springboot.model.AdminRegister;
import project.dac2022.springboot.model.CustomerRegister;
import project.dac2022.springboot.model.DriverRegister;
import project.dac2022.springboot.model.TruckLendorRegister;
import project.dac2022.springboot.repository.AdminRepository;
import project.dac2022.springboot.repository.CustomerRepository;
import project.dac2022.springboot.repository.DriverRepository;
import project.dac2022.springboot.repository.TruckLenderRepository;

@Service
public class AdminProfileService {

	
	@Autowired
	AdminRepository A_R;
	
	@Autowired
	CustomerRepository C_R;
	
	@Autowired
	DriverRepository D_R;
	
	@Autowired
	TruckLenderRepository TL_R;
	
	
	// Get all customer/user details
	public List<CustomerRegister> getAllCustomer() {
		// TODO Auto-generated method stub
		
		
		return C_R.findAll();
		
	}


	//get All employed Driver Details
	public List<DriverRegister> getAllDriver() {
		// TODO Auto-generated method stub
		return D_R.findAll();
	}


	// get All Truck Lendor Details
	public List<TruckLendorRegister> getAllLendors() {
		// TODO Auto-generated method stub
		return TL_R.findAll();
	}


	//get All Administrators details
	public List<AdminRegister> getAllAdmins() {
		// TODO Auto-generated method stub
		return A_R.findAll();
	}
	
	
	
	
	
}
