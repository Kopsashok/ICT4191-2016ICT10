package lk.ac.vau.Model;

public class course extends PrimaryId<String>{
	private String Name;
	private String Duration;
	
	public course() {
		
	}

	public course(String id,String name, String duration) {
		super(id);
		Name = name;
		Duration = duration;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getDuration() {
		return Duration;
	}

	public void setDuration(String duration) {
		Duration = duration;
	}
	
	
}
