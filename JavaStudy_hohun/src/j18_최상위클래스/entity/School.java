package j18_최상위클래스.entity;

import java.util.Objects;

public class School {
	private String schoolName;
	private String address;
	private String phoneNumber;
	private String major;
	
	public School() {
		// TODO Auto-generated constructor stub
	}

	public School(String schoolName, String address, String phoneNumber, String major) {
		super();
		this.schoolName = schoolName;
		this.address = address;
		this.phoneNumber = phoneNumber;
		this.major = major;
	}

	public String getSchoolName() {
		return schoolName;
	}

	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	@Override
	public int hashCode() {
		return Objects.hash(address, major, phoneNumber, schoolName);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		School other = (School) obj;
		return Objects.equals(address, other.address) && Objects.equals(major, other.major)
				&& Objects.equals(phoneNumber, other.phoneNumber) && Objects.equals(schoolName, other.schoolName);
	}

	@Override
	public String toString() {
		return "School [schoolName=" + schoolName + ", address=" + address + ", phoneNumber=" + phoneNumber + ", major="
				+ major + "]";
	}
	
	
	
}
