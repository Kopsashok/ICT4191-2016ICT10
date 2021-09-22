package lk.ac.vau.Repo;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

//import lk.ac.vau.Model.PrimaryId;
import lk.ac.vau.Model.Lecturar;

public class LecturarRepo extends Repo<Long, Lecturar>{
	Map<Long,Lecturar> map=new HashMap<Long,Lecturar>();
		
	public Collection<Lecturar> getAll(){
		return map.values();
	}

	public Lecturar get(Long id) {
		return map.get(id);
	}
	
	public void add(Lecturar ele) {
		map.put(ele.getId(),  ele);
	}
	
	public void update(Long id,Lecturar ele) {
		map.put(id,  ele);
	}
	
	public void delete(Long id) {
		map.remove(id);
	}	
}
