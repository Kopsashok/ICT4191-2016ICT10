package lk.ac.vau.Model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Department {
	@Id
	private long DepartmentId;
	private String Name;
	private double budget;
	private String StartDate;
	
	@ManyToOne
	@JoinColumn(name="InstructorId",referencedColumnName="Id")
	private Instructor instructor;
	
	@OneToMany(mappedBy = "department")
	private List<Course>courses;
	
	public Department() {
		
	}

	public Department(long departmentId, String name, double budget, String startDate, Instructor instructor) {
		super();
		DepartmentId = departmentId;
		Name = name;
		this.budget = budget;
		StartDate = startDate;
		this.instructor = instructor;
	}

	public long getDepartmentId() {
		return DepartmentId;
	}

	public void setDepartmentId(long departmentId) {
		DepartmentId = departmentId;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public double getBudget() {
		return budget;
	}

	public void setBudget(double budget) {
		this.budget = budget;
	}

	public String getStartDate() {
		return StartDate;
	}

	public void setStartDate(String startDate) {
		StartDate = startDate;
	}

	public Instructor getInstructor() {
		return instructor;
	}

	public void setInstructor(Instructor instructor) {
		this.instructor = instructor;
	}
	
}
