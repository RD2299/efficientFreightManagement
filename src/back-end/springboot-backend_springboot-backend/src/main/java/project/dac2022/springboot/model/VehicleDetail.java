package project.dac2022.springboot.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="vehicledetail")
public class VehicleDetail {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="vehicle_ID")
	private long vehicle_ID;

	VehicleDetail() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
}
