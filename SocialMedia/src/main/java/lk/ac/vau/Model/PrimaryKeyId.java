package lk.ac.vau.Model;

public class PrimaryKeyId <U> {
	private U Id;
	
	public PrimaryKeyId() {
		
	}

	public PrimaryKeyId(U id) {
		super();
		Id = id;
	}

	public U getId() {
		return Id;
	}

	public void setId(U id) {
		Id = id;
	}

}
