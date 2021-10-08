package lk.ac.vau.Model;

import java.io.Serializable;

import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

public class Assignment implements Serializable{
	@Id
	@ManyToOne
	@JoinColumn(name="Workerid",referencedColumnName="Worker_Id")
	private Worker worker;
	@Id
	@ManyToOne
	@JoinColumn(name="Buldingid",referencedColumnName="Building_Id")
	private Building building;
	private String StartDate;
	private int No_of_days;
	
	public Assignment() {
		
	}

	public Assignment(Worker worker, Building building, String startDate, int no_of_days) {
		super();
		this.worker = worker;
		this.building = building;
		StartDate = startDate;
		No_of_days = no_of_days;
	}

	public Worker getWorker() {
		return worker;
	}

	public void setWorker(Worker worker) {
		this.worker = worker;
	}

	public Building getBuilding() {
		return building;
	}

	public void setBuilding(Building building) {
		this.building = building;
	}

	public String getStartDate() {
		return StartDate;
	}

	public void setStartDate(String startDate) {
		StartDate = startDate;
	}

	public int getNo_of_days() {
		return No_of_days;
	}

	public void setNo_of_days(int no_of_days) {
		No_of_days = no_of_days;
	}
}
