package lk.ac.vau.Model;

public class Lecturar extends PrimaryId<Long>{
	public String name;
	public String Department;
	
	public Lecturar() {
		
	}

	public Lecturar(Long id,String name, String department) {
		super(id);
		this.name = name;
		Department = department;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDepartment() {
		return Department;
	}

	public void setDepartment(String department) {
		Department = department;
	}
	
}
