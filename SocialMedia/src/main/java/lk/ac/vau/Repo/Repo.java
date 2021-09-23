package lk.ac.vau.Repo;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import lk.ac.vau.Model.PrimaryKeyId;

public class Repo<K,V extends PrimaryKeyId<K>> {
	Map<K, V> map=new HashMap<K,V>();
	
	public Collection<V> getAll(){
		return map.values();
	}
	
	public V get(K id) {
		return map.get(id);
	}
	
	public void add (V ele) {
		map.put(ele.getId(), ele);
	}
	
	public void update(K id,V ele) {
		map.put(id, ele);
	}
	
	public void delete(K id) {
		map.remove(id);
	}

}
