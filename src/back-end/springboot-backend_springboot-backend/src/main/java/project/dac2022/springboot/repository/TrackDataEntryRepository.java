package project.dac2022.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import project.dac2022.springboot.model.Tracking;

public interface TrackDataEntryRepository extends JpaRepository<Tracking, Long>{

	
	@Query(value="SELECT * from tracking where trackingid = ?",nativeQuery = true)
	Tracking findByTrackingID(int trackingid);

	
}
