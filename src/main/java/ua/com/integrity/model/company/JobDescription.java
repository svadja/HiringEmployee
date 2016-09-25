package ua.com.integrity.model.company;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class JobDescription {

	private int id;
	private String position;
	private int positionId;
	private String unit;
	private String department;
	private Date workDate;
	private BigDecimal salary;

	public JobDescription() {
		super();
		// TODO Auto-generated constructor stub
	}

	public JobDescription(int id, String position, int positionId, String unit, String department, Date workDate,
			BigDecimal salary) {
		super();
		this.id = id;
		this.position = position;
		this.positionId = positionId;
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

	public int getPositionId() {
		return positionId;
	}

	public void setPositionId(int positionId) {
		this.positionId = positionId;
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

	public Date getWorkDate() {
		return workDate;
	}

	public void setWorkDate(Date workDate) {
		this.workDate = workDate;
	}

	public BigDecimal getSalary() {
		return salary;
	}

	public void setSalary(BigDecimal salary) {
		this.salary = salary;
	}

}
