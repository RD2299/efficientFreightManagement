package project.dac2022.springboot.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table(name="tracking")

public class Tracking {

	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="t_ID")
	private long tID;
	
	@Column(name="trackingID",nullable=false)
	private int trackingID;
	
	@Column(name="checkpoint",nullable=false)
	private String checkpoint;
	
	@Column(name="time_stamp",nullable=false)
	private String time_stamp;

	@Override
	public String toString() {
		return "Tracking [tID=" + tID + ", trackingID=" + trackingID + ", checkpoint=" + checkpoint + ", time_stamp="
				+ time_stamp + "]";
	}

	public long gettID() {
		return tID;
	}

	public void settID(long tID) {
		this.tID = tID;
	}

	public int getTrackingID() {
		return trackingID;
	}

	public void setTrackingID(int trackingID) {
		this.trackingID = trackingID;
	}

	public String getCheckpoint() {
		return checkpoint;
	}

	public void setCheckpoint(String checkpoint) {
		this.checkpoint = checkpoint;
	}

	public String getTime_stamp() {
		return time_stamp;
	}

	public void setTime_stamp(String time_stamp) {
		this.time_stamp = time_stamp;
	}

	Tracking(long tID, int trackingID, String checkpoint, String time_stamp) {
		super();
		this.tID = tID;
		this.trackingID = trackingID;
		this.checkpoint = checkpoint;
		this.time_stamp = time_stamp;
	}

	Tracking() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
