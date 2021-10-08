package lk.ac.vau.Model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Instructor {
	@Id
	private long Id;
	private String LastName;
	private String FirstMidName;
	private String HireDate;
	
	@OneToOne(mappedBy = "instructor")
	private OfficeAssignment officeAssignment;
	
	@OneToMany(mappedBy = "instructor")
	private List<Department>departments;
	
	@ManyToMany
	@JoinTable(name="Instructor_Course",joinColumns= {@JoinColumn(name="Instructor_id",referencedColumnName = "Id")},
	inverseJoinColumns = {@JoinColumn(name="course_id",referencedColumnName = "CourseId" )})
	private List<Course> courses;
	
	public Instructor() {
		
	}

	public Instructor(long id, OfficeAssignment officeAssignment, String lastName, String firstMidName, String hireDate,
			List<Department> departments, List<Course> courses) {
		super();
		Id = id;
		this.officeAssignment = officeAssignment;
		LastName = lastName;
		FirstMidName = firstMidName;
		HireDate = hireDate;
		this.departments = departments;
		this.courses = courses;
	}

	public long getId() {
		return Id;
	}

	public void setId(long id) {
		Id = id;
	}

	public OfficeAssignment getOfficeAssignment() {
		return officeAssignment;
	}

	public void setOfficeAssignment(OfficeAssignment officeAssignment) {
		this.officeAssignment = officeAssignment;
	}

	public String getLastName() {
		return LastName;
	}

	public void setLastName(String lastName) {
		LastName = lastName;
	}

	public String getFirstMidName() {
		return FirstMidName;
	}

	public void setFirstMidName(String firstMidName) {
		FirstMidName = firstMidName;
	}

	public String getHireDate() {
		return HireDate;
	}

	public void setHireDate(String hireDate) {
		HireDate = hireDate;
	}

	public List<Department> getDepartments() {
		return departments;
	}

	public void setDepartments(List<Department> departments) {
		this.departments = departments;
	}

	public List<Course> getCourses() {
		return courses;
	}

	public void setCourses(List<Course> courses) {
		this.courses = courses;
	}
}
