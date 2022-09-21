package project.dac2022.springboot.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="trucklendor")


public class TruckLendorRegister {

	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="t_ID")
	private long t_ID;
	
	@Column(name="t_FirstName",nullable=false)
	private String t_FirstName;
	
	@Column(name="t_MiddleName")
	private String t_MiddleName;
	
	@Column(name="t_LastName",nullable=false)
	private String t_LastName;
	
	@Column(name="t_Email",nullable=false, unique=true)
	private String t_Email;
	
	@Column(name="t_Password",nullable=false)
	private String t_Password;
	
	@Column(name="t_Phone",nullable=false)
	private String t_Phone;
	
	@Column(name="t_Address",nullable=false)
	private String t_Address;
	
	@Column(name="t_IDcardnumber",nullable=false)
	private String t_IDcardnum;
	
	@Column(name="t_Status", columnDefinition="varchar(50) default 'Pending'")
	private String t_Status;

	@Override
	public String toString() {
		return "TruckLendorRegister [t_ID=" + t_ID + ", t_FirstName=" + t_FirstName + ", t_MiddleName=" + t_MiddleName
				+ ", t_LastName=" + t_LastName + ", t_Email=" + t_Email + ", t_Password=" + t_Password + ", t_Phone="
				+ t_Phone + ", t_Address=" + t_Address + ", t_IDcardnum=" + t_IDcardnum + ", t_Status=" + t_Status
				+ "]";
	}

	TruckLendorRegister() {
		super();
		// TODO Auto-generated constructor stub
	}


	TruckLendorRegister(long t_ID, String t_FirstName, String t_MiddleName, String t_LastName, String t_Email,
			String t_Password, String t_Phone, String t_Address, String t_IDcardnum, String t_Status) {
		super();
		this.t_ID = t_ID;
		this.t_FirstName = t_FirstName;
		this.t_MiddleName = t_MiddleName;
		this.t_LastName = t_LastName;
		this.t_Email = t_Email;
		this.t_Password = t_Password;
		this.t_Phone = t_Phone;
		this.t_Address = t_Address;
		this.t_IDcardnum = t_IDcardnum;
		this.t_Status = t_Status;
	}

	public long getT_ID() {
		return t_ID;
	}

	public void setT_ID(long t_ID) {
		this.t_ID = t_ID;
	}

	public String getT_FirstName() {
		return t_FirstName;
	}

	public void setT_FirstName(String t_FirstName) {
		this.t_FirstName = t_FirstName;
	}

	public String getT_MiddleName() {
		return t_MiddleName;
	}

	public void setT_MiddleName(String t_MiddleName) {
		this.t_MiddleName = t_MiddleName;
	}

	public String getT_LastName() {
		return t_LastName;
	}

	public void setT_LastName(String t_LastName) {
		this.t_LastName = t_LastName;
	}

	public String getT_Email() {
		return t_Email;
	}

	public void setT_Email(String t_Email) {
		this.t_Email = t_Email;
	}

	public String getT_Password() {
		return t_Password;
	}

	public void setT_Password(String t_Password) {
		this.t_Password = t_Password;
	}

	public String getT_Phone() {
		return t_Phone;
	}

	public void setT_Phone(String t_Phone) {
		this.t_Phone = t_Phone;
	}

	public String getT_Address() {
		return t_Address;
	}

	public void setT_Address(String t_Address) {
		this.t_Address = t_Address;
	}

	public String getT_IDcardnum() {
		return t_IDcardnum;
	}

	public void setT_IDcardnum(String t_IDcardnum) {
		this.t_IDcardnum = t_IDcardnum;
	}

	public String getT_Status() {
		return t_Status;
	}

	public void setT_Status(String t_Status) {
		this.t_Status = t_Status;
	}
	
	
	
}
