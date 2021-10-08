package lk.ac.vau.Model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Building {
	@Id
	private String Building_Id;
	private String Building_address;
	enum BuildingType{
		Office,
		Retail,
		Residence,
		WareHouse;
	}
	private BuildingType Type_of_bldg;
	private int Qty_level;
	private int status;

	@OneToMany(mappedBy = "building")
	private List<Assignment>buildAssignment;
	
	public Building() {
		
	}

	public Building(String building_Id, String building_address, BuildingType type_of_bldg, int qty_level, int status,
			List<Assignment> buildAssignment) {
		super();
		Building_Id = building_Id;
		Building_address = building_address;
		Type_of_bldg = type_of_bldg;
		Qty_level = qty_level;
		this.status = status;
		this.buildAssignment = buildAssignment;
	}

	public String getBuilding_Id() {
		return Building_Id;
	}

	public void setBuilding_Id(String building_Id) {
		Building_Id = building_Id;
	}

	public String getBuilding_address() {
		return Building_address;
	}

	public void setBuilding_address(String building_address) {
		Building_address = building_address;
	}

	public BuildingType getType_of_bldg() {
		return Type_of_bldg;
	}

	public void setType_of_bldg(BuildingType type_of_bldg) {
		Type_of_bldg = type_of_bldg;
	}

	public int getQty_level() {
		return Qty_level;
	}

	public void setQty_level(int qty_level) {
		Qty_level = qty_level;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public List<Assignment> getBuildAssignment() {
		return buildAssignment;
	}

	public void setBuildAssignment(List<Assignment> buildAssignment) {
		this.buildAssignment = buildAssignment;
	}
}
