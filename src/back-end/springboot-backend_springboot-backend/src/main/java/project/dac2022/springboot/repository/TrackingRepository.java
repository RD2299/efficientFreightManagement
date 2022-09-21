package project.dac2022.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.*;

import project.dac2022.springboot.model.Tracking;

public interface TrackingRepository extends JpaRepository<Tracking, Long> {

	@Query(value="SELECT * from tracking where trackingID = ?",nativeQuery = true)
	Tracking findByTrackingID(String trackingid);
}
