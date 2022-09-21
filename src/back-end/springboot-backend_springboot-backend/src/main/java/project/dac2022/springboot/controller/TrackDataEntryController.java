package project.dac2022.springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import project.dac2022.springboot.model.CustomerRegister;
import project.dac2022.springboot.model.Tracking;
import project.dac2022.springboot.repository.TrackDataEntryRepository;
import project.dac2022.springboot.service.TrackDataEntryService;

@RestController
@CrossOrigin("*")
@RequestMapping("/home/dlogin/entertrackdata")
public class TrackDataEntryController {

	@Autowired
	TrackDataEntryService T_DES;
	
	@Autowired
	TrackDataEntryRepository T_DER;
	
	@PostMapping
	public ResponseEntity<?> trackDataentry(@RequestBody Tracking tr) {

		
		return T_DES.saveTrackData(tr);
	}
}
