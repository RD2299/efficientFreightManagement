package project.dac2022.springboot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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
	
	
	public ResponseEntity<?> createCustomer(CustomerRegister cr) {
		// TODO Auto-generated method stub
		
		try {
			C_R.save(cr);
			return new ResponseEntity<>(HttpStatus.CREATED);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			return new ResponseEntity<>(HttpStatus.EXPECTATION_FAILED);
		}
	}
	
	
	public ResponseEntity<?> createDriver(DriverRegister dr) {
		// TODO Auto-generated method stub
		
		try {
			D_R.save(dr);
			return new ResponseEntity<>(HttpStatus.CREATED);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			return new ResponseEntity<>(HttpStatus.EXPECTATION_FAILED);
		}
	}
	
	
	public ResponseEntity<?> createTruckLendor(TruckLendorRegister tlr) {
		// TODO Auto-generated method stub
		
		try {
			TL_R.save(tlr);
			return new ResponseEntity<>(HttpStatus.CREATED);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			return new ResponseEntity<>(HttpStatus.EXPECTATION_FAILED);
		}
	}


	public ResponseEntity<CustomerRegister> updateCustomer(long c_ID, CustomerRegister c_R2) {
		// TODO Auto-generated method stub
		
		CustomerRegister updateCustomer = C_R.findById(c_ID).orElseThrow();
		
		
		updateCustomer.setC_FirstName(c_R2.getC_FirstName());
		updateCustomer.setC_MiddleName(c_R2.getC_MiddleName());
		updateCustomer.setC_LastName(c_R2.getC_LastName());
		updateCustomer.setC_Email(c_R2.getC_Email());
		updateCustomer.setC_Phone(c_R2.getC_Phone());
		updateCustomer.setC_Address(c_R2.getC_Address());
		C_R.save(updateCustomer);
		
		return ResponseEntity.ok(updateCustomer);
	}


	public ResponseEntity<DriverRegister> updateDriver(long d_ID, DriverRegister d_R2) {
		// TODO Auto-generated method stub
		return null;
	}


	public ResponseEntity<TruckLendorRegister> updateTruckLendor(long tl_ID, TruckLendorRegister tl_R2) {
		// TODO Auto-generated method stub
		return null;
	}

	
	
}
