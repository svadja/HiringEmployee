package ua.com.integrity.model.person;

import java.util.Date;

public class PersonalInformation {
	private int id;
	private String firstName;
	private String lastName;
	private String middName;
	private Sex sex;
	private Date birthDate;
	private String phone;
	private String skype;

	public PersonalInformation() {
		super();
	}

	public PersonalInformation(int id, String firstName, String lastName, String middName, Sex sex, Date birthDate,
			String phone, String skype) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.middName = middName;
		this.sex = sex;
		this.birthDate = birthDate;
		this.phone = phone;
		this.skype = skype;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getMiddName() {
		return middName;
	}

	public void setMiddName(String middName) {
		this.middName = middName;
	}

	public Sex getSex() {
		return sex;
	}

	public void setSex(Sex sex) {
		this.sex = sex;
	}

	public Date getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getSkype() {
		return skype;
	}

	public void setSkype(String skype) {
		this.skype = skype;
	}

}
