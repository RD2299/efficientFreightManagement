package project.dac2022.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
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
	
}
