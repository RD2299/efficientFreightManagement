package project.dac2022.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import project.dac2022.springboot.model.AdminRegister;
import project.dac2022.springboot.model.CustomerRegister;
import project.dac2022.springboot.model.DriverRegister;
import project.dac2022.springboot.model.TruckLendorRegister;
import project.dac2022.springboot.service.AdminProfileService;

@RestController
@RequestMapping("/adminhomepage")
@CrossOrigin("*")
public class AdminProfileController {
	
	@Autowired
	AdminProfileService A_PS;
	
	@GetMapping 
	@RequestMapping("/getcustomerdata")
	public List<CustomerRegister> getAllCustomer()
	{
		return A_PS.getAllCustomer();
	}

	@GetMapping
	@RequestMapping("/getdriverdata")
	public List<DriverRegister> getAllDriver()
	{
		return A_PS.getAllDriver();
	}
	
	@GetMapping
	@RequestMapping("/gettrucklendordata")
	public List<TruckLendorRegister> getAllLendors()
	{
		return A_PS.getAllLendors();
	}
	
	@GetMapping
	@RequestMapping("/getadmindata")
	public List<AdminRegister> getAllAdmins()
	{
		return A_PS.getAllAdmins();
	}
	
	@PostMapping
	@RequestMapping("/createcustomer")
	public ResponseEntity<?> CustomerCreation(@RequestBody CustomerRegister cr)
	{
		return A_PS.createCustomer(cr);
	}
	
	@PostMapping
	@RequestMapping("/createdriver")
	public ResponseEntity<?> DriverCreation(@RequestBody DriverRegister dr)
	{
		return A_PS.createDriver(dr);
	}
	
	@PostMapping
	@RequestMapping("/createtrucklendor")
	public ResponseEntity<?> TruckLendorCreation(@RequestBody TruckLendorRegister tlr)
	{
		return A_PS.createTruckLendor(tlr);
	}
	
	
	@PutMapping("/updateCustomer/{c_ID}")
	public ResponseEntity<CustomerRegister> updateCustomer(@PathVariable long c_ID,@RequestBody CustomerRegister c_R)
	{
		return A_PS.updateCustomer(c_ID,c_R);
	}
	
	
	public ResponseEntity<DriverRegister> updateCustomer(long d_ID, DriverRegister d_R)
	{
		return A_PS.updateDriver(d_ID,d_R);
	}
	
	
	public ResponseEntity<TruckLendorRegister> updateTruckLendor(long tl_ID, TruckLendorRegister tl_R)
	{
		return A_PS.updateTruckLendor(tl_ID,tl_R);
	}

	
}
