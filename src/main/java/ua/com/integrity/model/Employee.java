package ua.com.integrity.model;

public class Employee {
	private PersonalInformation person;
	private JobDescription job;

	public Employee() {
		super();
	}

	public Employee(PersonalInformation person, JobDescription job) {
		super();
		this.person = person;
		this.job = job;
	}

	public PersonalInformation getPerson() {
		return person;
	}

	public void setPerson(PersonalInformation person) {
		this.person = person;
	}

	public JobDescription getJob() {
		return job;
	}

	public void setJob(JobDescription job) {
		this.job = job;
	}

}
