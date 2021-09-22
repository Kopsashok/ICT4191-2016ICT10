package lk.ac.vau.Repo;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

//import lk.ac.vau.Model.PrimaryId;
import lk.ac.vau.Model.course;

public class courseRepo extends Repo<String, course>{
	Map<String,course> map=new HashMap<String,course>();
		
	public Collection<course> getAll(){
		return map.values();
	}

	public course get(String id) {
		return map.get(id);
	}
	
	public void add(course ele) {
		map.put(ele.getId(),  ele);
	}
	
	public void update(String id,course ele) {
		map.put(id,  ele);
	}
	
	public void delete(String id) {
		map.remove(id);
	}	
}
