package lk.ac.vau.Model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Worker {
	@Id
	private int Worker_Id;
	private String Worker_Name;
	private double Hourly_Rate;
	enum SkillType{
		Electric,
		Plumbing,
		Roofing,
		Framing
	}
	@Enumerated(EnumType.STRING)
	private SkillType Skill_type;
	
	@ManyToOne
	@JoinColumn(name="supervisor_id",referencedColumnName = "worker_Id")
	private Worker Supervisor;
	
//	@OneToMany(mappedBy = "Supervisor")
//	private List<Worker>workers;
	
	@OneToMany(mappedBy = "worker")
	private List<Assignment>workAssignment;

	public Worker() {
		
	}

	public Worker(int worker_Id, String worker_Name, double hourly_Rate, SkillType skill_type, Worker supervisor,
			List<Assignment> workAssignment) {
		super();
		Worker_Id = worker_Id;
		Worker_Name = worker_Name;
		Hourly_Rate = hourly_Rate;
		Skill_type = skill_type;
		Supervisor = supervisor;
		this.workAssignment = workAssignment;
	}

	public int getWorker_Id() {
		return Worker_Id;
	}

	public void setWorker_Id(int worker_Id) {
		Worker_Id = worker_Id;
	}

	public String getWorker_Name() {
		return Worker_Name;
	}

	public void setWorker_Name(String worker_Name) {
		Worker_Name = worker_Name;
	}

	public double getHourly_Rate() {
		return Hourly_Rate;
	}

	public void setHourly_Rate(double hourly_Rate) {
		Hourly_Rate = hourly_Rate;
	}

	public SkillType getSkill_type() {
		return Skill_type;
	}

	public void setSkill_type(SkillType skill_type) {
		Skill_type = skill_type;
	}

	public Worker getSupervisor() {
		return Supervisor;
	}

	public void setSupervisor(Worker supervisor) {
		Supervisor = supervisor;
	}

	public List<Assignment> getWorkAssignment() {
		return workAssignment;
	}

	public void setWorkAssignment(List<Assignment> workAssignment) {
		this.workAssignment = workAssignment;
	}
}
