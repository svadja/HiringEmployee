package ua.com.integrity.model;

import java.math.BigDecimal;

public class JobDescription {
	private int id;
	private String position;
	private String unit;
	private String department;
	private String workDate;
	private BigDecimal salary;

	public JobDescription() {
		super();
		// TODO Auto-generated constructor stub
	}

	public JobDescription(int id, String position, String unit, String department, String workDate, BigDecimal salary) {
		super();
		this.id = id;
		this.position = position;
		this.unit = unit;
		this.department = department;
		this.workDate = workDate;
		this.salary = salary;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public String getUnit() {
		return unit;
	}

	public void setUnit(String unit) {
		this.unit = unit;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getWorkDate() {
		return workDate;
	}

	public void setWorkDate(String workDate) {
		this.workDate = workDate;
	}

	public BigDecimal getSalary() {
		return salary;
	}

	public void setSalary(BigDecimal salary) {
		this.salary = salary;
	}

}
