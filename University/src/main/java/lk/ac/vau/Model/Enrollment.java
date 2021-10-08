package lk.ac.vau.Model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Enrollment {
	@Id
	private String EnrollmentId;
	private String Grade;
	
	@ManyToOne
	@JoinColumn(name="courseId",referencedColumnName="CourseId")
	private Course course;
	
	@ManyToOne
	@JoinColumn(name="studentId",referencedColumnName="Id")	
	private Student student;
	
	public Enrollment() {
		
	}

	public Enrollment(String enrollmentId, Course course, Student student, String grade) {
		super();
		EnrollmentId = enrollmentId;
		this.course = course;
		this.student = student;
		Grade = grade;
	}

	public String getEnrollmentId() {
		return EnrollmentId;
	}

	public void setEnrollmentId(String enrollmentId) {
		EnrollmentId = enrollmentId;
	}

	public Course getCourse() {
		return course;
	}

	public void setCourse(Course course) {
		this.course = course;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	public String getGrade() {
		return Grade;
	}

	public void setGrade(String grade) {
		Grade = grade;
	}
	
}
