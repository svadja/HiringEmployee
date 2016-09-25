package ua.com.integrity.model.company;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "position")
public class Position {
	
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String name;
	
    @ManyToOne
    @JoinColumn(name="department_id", referencedColumnName="id")
	private Department rootDepatment;
    
    @ManyToOne
    @JoinColumn(name="unit_id", referencedColumnName="id")
	private Unit rootUnit;
	
	public Position() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Position(String name, Department rootDepatment, Unit rootUnit) {
		super();
		this.name = name;
		this.rootDepatment = rootDepatment;
		this.rootUnit = rootUnit;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Department getRootDepatment() {
		return rootDepatment;
	}
	public void setRootDepatment(Department rootDepatment) {
		this.rootDepatment = rootDepatment;
	}
	public Unit getRootUnit() {
		return rootUnit;
	}
	public void setRootUnit(Unit rootUnit) {
		this.rootUnit = rootUnit;
	}
	
	
}
