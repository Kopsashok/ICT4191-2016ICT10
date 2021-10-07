package lk.ac.vau.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class WorkerBuilding {
	//m to 1 - join column
	@Id
	@GeneratedValue
	private long id; 
	@ManyToOne
	@JoinColumn(name="W_id",referencedColumnName="Wid")
	private Worker worker;
	@ManyToOne
	@JoinColumn(name="B_id",referencedColumnName="Bid")
	private Building building;
	private int workinghours;
	private double payment;
	
	public WorkerBuilding() {
		
	}

	public WorkerBuilding(Worker worker, Building building, int workinghours, double payment) {
		super();
		this.worker = worker;
		this.building = building;
		this.workinghours = workinghours;
		this.payment = payment;
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

	public int getWorkinghours() {
		return workinghours;
	}

	public void setWorkinghours(int workinghours) {
		this.workinghours = workinghours;
	}

	public double getPayment() {
		return payment;
	}

	public void setPayment(double payment) {
		this.payment = payment;
	}
}
