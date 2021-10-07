package lk.ac.vau.Model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Worker {
	@Id
	private String Wid;
	private String Name;
	private int typeOfWork;
	
	@OneToMany(mappedBy = "worker")
	private List<WorkerBuilding>buildings;

	public Worker() {
		
	}

	public Worker(String wid, String name, int typeOfWork, List<WorkerBuilding> buildings) {
		super();
		Wid = wid;
		Name = name;
		this.typeOfWork = typeOfWork;
		this.buildings = buildings;
	}

	public String getWid() {
		return Wid;
	}

	public void setWid(String wid) {
		Wid = wid;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public int getTypeOfWork() {
		return typeOfWork;
	}

	public void setTypeOfWork(int typeOfWork) {
		this.typeOfWork = typeOfWork;
	}

	public List<WorkerBuilding> getBuildings() {
		return buildings;
	}

	public void setBuildings(List<WorkerBuilding> buildings) {
		this.buildings = buildings;
	}
}
