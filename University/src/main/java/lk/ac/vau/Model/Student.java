package lk.ac.vau.Model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Student {
	@Id
	private String Id;
	private String LastName;
	private String FirstMidName;
	private String EnrollmentDate;
	
	@OneToMany(mappedBy = "student")
	private List<Enrollment>enrollments;
	
	
	public Student() {
		super();
	}


	public Student(String id, String lastName, String firstMidName, String enrollmentDate,
			List<Enrollment> enrollments) {
		super();
		Id = id;
		LastName = lastName;
		FirstMidName = firstMidName;
		EnrollmentDate = enrollmentDate;
		this.enrollments = enrollments;
	}


	public String getId() {
		return Id;
	}


	public void setId(String id) {
		Id = id;
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


	public String getEnrollmentDate() {
		return EnrollmentDate;
	}


	public void setEnrollmentDate(String enrollmentDate) {
		EnrollmentDate = enrollmentDate;
	}


	public List<Enrollment> getEnrollments() {
		return enrollments;
	}


	public void setEnrollments(List<Enrollment> enrollments) {
		this.enrollments = enrollments;
	}
}
