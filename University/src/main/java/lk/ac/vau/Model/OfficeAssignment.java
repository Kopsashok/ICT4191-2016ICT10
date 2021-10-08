package lk.ac.vau.Model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class OfficeAssignment {
	@Id
	@GeneratedValue
	private long id;
	private String Location;
	
	@OneToOne
	@JoinColumn(name="InstructorId",referencedColumnName="Id")
	private Instructor instructor;

	public OfficeAssignment() {
		
	}

	public OfficeAssignment(Instructor instructorId, String location, Instructor instructor) {
		super();
		Location = location;
		this.instructor = instructor;
	}

	public String getLocation() {
		return Location;
	}

	public void setLocation(String location) {
		Location = location;
	}

	public Instructor getInstructor() {
		return instructor;
	}

	public void setInstructor(Instructor instructor) {
		this.instructor = instructor;
	}
}
