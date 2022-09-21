package project.dac2022.springboot.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
//import javax.persistence.Parameter;

//import org.hibernate.annotations.GenericGenerator;

//import project.dac2022.springboot.idgenerator.SequenceIDGenerator;

@Entity
@Table(name="shipments")
public class Shipments {

	
	@Id
//	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="id_Generator")
//	@GenericGenerator(name="id_Generator", 
//			strategy="project.dac2022.springboot.idgenerator.SequenceIDGenerator",
//			parameters= {@Parameter(name= SequenceIDGenerator.INCREMENT_PARAM, value="50")})
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="shipmentID", nullable=false)
	private int shipmentID;
	
Shipments() {
		super();
		// TODO Auto-generated constructor stub
	}

Shipments(int shipmentID, String i_name, double i_weight, String pickup_time, String pickup_location,
			String pickup_state, String pickup_city, String delivery_city, String delivery_state,
			String delivery_location, String description) {
		super();
		this.shipmentID = shipmentID;
		this.i_name = i_name;
		this.i_weight = i_weight;
		this.pickup_time = pickup_time;
		this.pickup_location = pickup_location;
		this.pickup_state = pickup_state;
		this.pickup_city = pickup_city;
		this.delivery_city = delivery_city;
		this.delivery_state = delivery_state;
		this.delivery_location = delivery_location;
		this.description = description;
	}

//	@Column(name="senderFirstName", nullable=false)
//	private String senderFirstName;
//	
//	@Column(name="senderLastName", nullable=false)
//	private String senderLastName;
//	
//	@Column(name="receiverFirstName", nullable=false)
//	private String receiverFirstName;
//	
//	@Column(name="receiverLastName", nullable=false)
//	private String receiverLastName;
//	
//	@Column(name="senderAddressline1", nullable=false)
//	private String senderAddressline1;
//	
//	@Column(name="senderCity", nullable=false)
//	private String senderCity;
//	
//	@Column(name="senderState", nullable=false)
//	private String senderState;
//	
//	@Column(name="senderPincode", nullable=false)
//	private String senderPincode;
//	
//	@Column(name="receiverAddressline1", nullable=false)
//	private String receiverAddressline1;
//	
//	@Column(name="receiverCity", nullable=false)
//	private String receiverCity;
//	
//	@Column(name="receiverState", nullable=false)
//	private String receiverState;
//	
//	@Column(name="receiverPincode", nullable=false)
//	private String receiverPincode;
//	
//	@Column(name="itemWeight", nullable=false)
//	private Double itemWeight;
//	
//	@Column(name="itemLength", nullable=false)
//	private Double itemLength;
//	
//	@Column(name="itemBreadth", nullable=false)
//	private Double itemBreadth;
//	
//	@Column(name="itemHeight", nullable=false)
//	private Double itemHeight;
//	
//	@Column(name="itemVolume", nullable=false)
//	private Double itemVolume;
//	
//	@Column(name="itemValue", nullable=false)
//	private Long itemValue;
//	
//	@Column(name="itemDescription",nullable=false)
//	private String itemDescription;
//	
//	@Column(name="itemType", nullable=false)
//	private String itemType;
//	
//	@Column(name="itemCategory", nullable=false)
//	private String itemCategory;
//	
//	
//	@Column(name="shipmentCost")
//	private Double shipmentCost;
//	
//	@Column(name="paymentStatus")
//	private String paymentStatus;
	
	@Override
	public String toString() {
		return "Shipments [shipmentID=" + shipmentID + ", i_name=" + i_name + ", i_weight=" + i_weight
				+ ", pickup_time=" + pickup_time + ", pickup_location=" + pickup_location + ", pickup_state="
				+ pickup_state + ", pickup_city=" + pickup_city + ", delivery_city=" + delivery_city
				+ ", delivery_state=" + delivery_state + ", delivery_location=" + delivery_location + ", description="
				+ description + "]";
	}

	public int getShipmentID() {
		return shipmentID;
	}

	public void setShipmentID(int shipmentID) {
		this.shipmentID = shipmentID;
	}

	public String getI_name() {
		return i_name;
	}

	public void setI_name(String i_name) {
		this.i_name = i_name;
	}

	public double getI_weight() {
		return i_weight;
	}

	public void setI_weight(double i_weight) {
		this.i_weight = i_weight;
	}

	public String getPickup_time() {
		return pickup_time;
	}

	public void setPickup_time(String pickup_time) {
		this.pickup_time = pickup_time;
	}

	public String getPickup_location() {
		return pickup_location;
	}

	public void setPickup_location(String pickup_location) {
		this.pickup_location = pickup_location;
	}

	public String getPickup_state() {
		return pickup_state;
	}

	public void setPickup_state(String pickup_state) {
		this.pickup_state = pickup_state;
	}

	public String getPickup_city() {
		return pickup_city;
	}

	public void setPickup_city(String pickup_city) {
		this.pickup_city = pickup_city;
	}

	public String getDelivery_city() {
		return delivery_city;
	}

	public void setDelivery_city(String delivery_city) {
		this.delivery_city = delivery_city;
	}

	public String getDelivery_state() {
		return delivery_state;
	}

	public void setDelivery_state(String delivery_state) {
		this.delivery_state = delivery_state;
	}

	public String getDelivery_location() {
		return delivery_location;
	}

	public void setDelivery_location(String delivery_location) {
		this.delivery_location = delivery_location;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Column  (name="i_name")
	private String i_name;
	
	@Column  (name="i_weight")
	private double i_weight;
	
	@Column  (name="pickup_time")
	private String pickup_time;
	
	@Column  (name="pickup_location")
	private String pickup_location;
	
	@Column  (name="pickup_state")
	private String pickup_state;
	
	@Column  (name="pickup_city")
	private String pickup_city;
	
	@Column  (name="delivery_city")
	private String delivery_city;
	
	@Column  (name="delivery_state")
	private String delivery_state;
	
	@Column  (name="delivery_location")
	private String delivery_location;
	
	@Column  (name="description")
	private String description;
	
}
