package lk.ac.vau.Model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Course {
	@Id
	private String CourseId;
	private String Title;
	private int Credits;
	
	@ManyToMany(mappedBy = "courses")
	private List<Instructor> instructors;
	
	@OneToMany(mappedBy = "course")
	private List<Enrollment>enrollments;
	
	@ManyToOne
	@JoinColumn(name="departmentId",referencedColumnName="DepartmentId")
	private Department department;
	
	public Course() {
		
	}

	public Course(String courseId, String title, int credits, List<Instructor> instructors,
			List<Enrollment> enrollments, Department department) {
		super();
		CourseId = courseId;
		Title = title;
		Credits = credits;
		this.instructors = instructors;
		this.enrollments = enrollments;
		this.department = department;
	}

	public String getCourseId() {
		return CourseId;
	}

	public void setCourseId(String courseId) {
		CourseId = courseId;
	}

	public String getTitle() {
		return Title;
	}

	public void setTitle(String title) {
		Title = title;
	}

	public int getCredits() {
		return Credits;
	}

	public void setCredits(int credits) {
		Credits = credits;
	}

	public List<Instructor> getInstructors() {
		return instructors;
	}

	public void setInstructors(List<Instructor> instructors) {
		this.instructors = instructors;
	}

	public List<Enrollment> getEnrollments() {
		return enrollments;
	}

	public void setEnrollments(List<Enrollment> enrollments) {
		this.enrollments = enrollments;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}
}
