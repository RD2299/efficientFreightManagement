package project.dac2022.springboot.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
//import org.springframework.web.multipart.MultipartFile;

import project.dac2022.springboot.model.CustomerRegister;
import project.dac2022.springboot.repository.CustomerRepository;
import project.dac2022.springboot.service.CustomerRegisterService;

@RestController
@RequestMapping("/cregister")
@CrossOrigin("*")

public class CustomerRegisterController {

	@Autowired
	CustomerRegisterService C_RService;
	
	@Autowired
	CustomerRepository C_Repo;

	//register customer details and store it
	@PostMapping
	public ResponseEntity<?> CustomerRegistration(@RequestBody CustomerRegister cr) {

		
//		StringBuilder fileName = new StringBuilder();
//		String filename=cr.getC_ID()+ file.getOriginalFilename().substring(file.getOriginalFilename().length()-4);
//		Path fileNameandPath = Paths.get(uploadDirectory, filename);
//		
//		try {
//			Files.write(fileNameandPath, file.getBytes());
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
		
		//cr.setC_photo(filename);
		
		return C_RService.saveCustomer(cr);
	}
	
	
	//public static String uploadDirectory=System.getProperty("user.dir")+"/src/main/webapp/customerimagedata";
	
	
//	public CustomerRegister registercust(@RequestBody CustomerRegister cr) {
//	return C_Repo.save(cr);
//}
}
