package project.dac2022.springboot.service;

//import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import project.dac2022.springboot.model.Tracking;
import project.dac2022.springboot.repository.TrackingRepository;

@Service
public class TrackingService {

	@Autowired
	TrackingRepository T_R;
	
	@GetMapping
	public ResponseEntity<Tracking> validateTrackingID(Tracking tr){
		
		
		Tracking track = T_R.findByTrackingID(tr.getTrackingID());
		
		
		if(track.getTrackingID().equalsIgnoreCase(tr.getTrackingID()))
			return new ResponseEntity<Tracking>(track, HttpStatus.OK);
		
		
		else
			return new ResponseEntity<Tracking>(HttpStatus.NOT_FOUND);
	}
}
