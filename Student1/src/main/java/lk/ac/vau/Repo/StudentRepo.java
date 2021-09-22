package lk.ac.vau.Repo;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

//import lk.ac.vau.Model.PrimaryId;
import lk.ac.vau.Model.Student;

public class StudentRepo extends Repo<String, Student>{
	Map<String,Student> map=new HashMap<String,Student>();
	
	public Collection<Student> getAll(){
		return map.values();
	}
	
	public Student get(String id) {
		return map.get(id);
	}
	
	public void add(Student ele) {
		map.put(ele.getId(),  ele);
	}
	
	public void update(String id,Student ele) {
		map.put(id,  ele);
	}
	
	public void delete(String id) {
		map.remove(id);
	}	
}
