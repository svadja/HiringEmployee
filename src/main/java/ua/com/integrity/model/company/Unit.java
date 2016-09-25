package ua.com.integrity.model.company;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "unit")
public class Unit {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String name;
	private String manager;
	
    @ManyToOne
    @JoinColumn(name="department_id", referencedColumnName="id")
	private Department rootDepatment;
	
	public Unit() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Unit(String name, String manager, Department rootDepatment) {
		super();
		this.name = name;
		this.manager = manager;
		this.rootDepatment = rootDepatment;
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
	public String getManager() {
		return manager;
	}
	public void setManager(String manager) {
		this.manager = manager;
	}
	
	public Department getRootDepatment() {
		return rootDepatment;
	}
	public void setRootDepatment(Department rootDepatment) {
		this.rootDepatment = rootDepatment;
	}
}
