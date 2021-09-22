package lk.ac.vau.Controller;

import java.util.Collection;

import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lk.ac.vau.Model.Lecturar;
import lk.ac.vau.Repo.Repo;

@RestController
@RequestMapping("lecturar")
@Produces(MediaType.APPLICATION_XML)
@Consumes(MediaType.APPLICATION_XML)
public class LecturarController {

private Repo<Long,Lecturar> lcr=new Repo<Long,Lecturar>();
	
	@GetMapping
	public Collection<Lecturar> getAll() {
		// add();
		return lcr.getAll();
	}

	@GetMapping("/{id}")
	public Lecturar get(@PathVariable("id") Long id) {
		// add();
		return lcr.get(id);
	}

	@PostMapping 
	public void add(@RequestBody Lecturar c) {
		lcr.add(c);
	}
	
	@DeleteMapping("/{id}")
	public void delete(@PathVariable("id") Long id) {
		lcr.delete(id);
	}

	@PutMapping("/{id}")
	public void update(@PathVariable("id") Long id,@RequestBody Lecturar c) {
		lcr.update(id, c);
	}
}
