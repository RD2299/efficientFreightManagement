package project.dac2022.springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import project.dac2022.springboot.service.TrackingService;
import project.dac2022.springboot.model.Tracking;

@RestController
@RequestMapping("/home/globaltrack")
@CrossOrigin("*")
public class TrackingController {

	
	@Autowired
	private TrackingService T_S;
	
	
	@GetMapping
	public ResponseEntity<Tracking> getTrackingDetail(@RequestBody Tracking tr){
		return T_S.validateTrackingID(tr);
	}
}
