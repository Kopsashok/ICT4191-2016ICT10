package lk.ac.vau.Model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Building {
	@Id
	private String Bid;
	private String address;
	private int noOfFloors;
	@OneToMany(mappedBy = "building")
	private List<WorkerBuilding>workers;
	
	public Building() {
		
	}

	public Building(String bid, String address, int noOfFloors, List<WorkerBuilding> workers) {
		super();
		Bid = bid;
		this.address = address;
		this.noOfFloors = noOfFloors;
		this.workers = workers;
	}

	public String getBid() {
		return Bid;
	}

	public void setBid(String bid) {
		Bid = bid;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getNoOfFloors() {
		return noOfFloors;
	}

	public void setNoOfFloors(int noOfFloors) {
		this.noOfFloors = noOfFloors;
	}

	public List<WorkerBuilding> getWorkers() {
		return workers;
	}

	public void setWorkers(List<WorkerBuilding> workers) {
		this.workers = workers;
	}
}
