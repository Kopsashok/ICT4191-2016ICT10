package lk.ac.vau.Model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Course {
	@Id
	private String CourseId;
	private String Name;
	private int duration;
	@ManyToMany(fetch = FetchType.LAZY,mappedBy = "course")
	private List<Student> stu=new ArrayList<Student>();
	
	public Course() {
		
	}

	public String getCourseId() {
		return CourseId;
	}

	public void setCourseId(String courseId) {
		CourseId = courseId;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

	public List<Student> getStu() {
		return stu;
	}

	public void setStu(List<Student> stu) {
		this.stu = stu;
	}

	public Course(String courseId, String name, int duration, List<Student> stu) {
		super();
		CourseId = courseId;
		Name = name;
		this.duration = duration;
		this.stu = stu;
	}
}
