package project.dac2022.springboot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;


import project.dac2022.springboot.model.Tracking;
import project.dac2022.springboot.repository.TrackDataEntryRepository;

@Service
public class TrackDataEntryService {

	@Autowired
	TrackDataEntryRepository T_DER;
	
	@PostMapping
	public ResponseEntity<?> saveTrackData(Tracking tr){
		try {
			T_DER.save(tr);			
			return new ResponseEntity<>(HttpStatus.CREATED);
		}catch(Exception e) {
			return new ResponseEntity<>(HttpStatus.EXPECTATION_FAILED);
		}
	}
	
}
