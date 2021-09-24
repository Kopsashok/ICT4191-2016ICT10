package lk.ac.vau.Model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Entity
public class Student {
	@Id
	private long StudentId;
	private String Name;
	private String Institude;
	@ManyToMany
	@JoinTable(name="Student_course",joinColumns= {@JoinColumn(name="student_id",referencedColumnName = "StudentId" )},
	inverseJoinColumns = {@JoinColumn(name="course_id",referencedColumnName = "CourseId")})
	private List<Course> course=new ArrayList<Course>();
	
	public Student() {
		
	}

	public long getStudentId() {
		return StudentId;
	}

	public void setStudentId(long studentId) {
		StudentId = studentId;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getInstitudel() {
		return Institude;
	}

	public void setInstitudel(String institudel) {
		Institude = institudel;
	}

	public List<Course> getCourse() {
		return course;
	}

	public void setCourse(List<Course> course) {
		this.course = course;
	}

	public Student(long studentId, String name, String institudel, List<Course> course) {
		super();
		StudentId = studentId;
		Name = name;
		Institude = institudel;
		this.course = course;
	}
}
