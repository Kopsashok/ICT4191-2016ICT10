package lk.ac.vau.Controller;

//import java.util.ArrayList;
import java.util.Collection;
//import java.util.HashMap;
//import java.util.List;
//import java.util.Map;

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

import lk.ac.vau.Model.Student;
//import lk.ac.vau.Repo.Repo;
import lk.ac.vau.Repo.StudentRepo;

@RestController
@RequestMapping("student")
@Produces(MediaType.APPLICATION_XML)
@Consumes(MediaType.APPLICATION_XML)
public class StudentController {
	
	private StudentRepo students=new StudentRepo();
	/*
	 * List<Student> students=new ArrayList<Student>(); public void add() { Student
	 * james=new Student("2016-ICT-10","James",24,"BSc in IT",3.78); Student
	 * ravi=new Student("2016-ICT-02","ravi",24,"BSc in IT",3.0); Student
	 * jamjackSparrow=new
	 * Student("2016-ICT-67","jamjackSparrow",29,"BSc in IT",2.7);
	 * students.add(james); students.add(ravi); students.add(jamjackSparrow); }
	 * 
	 * @GetMapping public List<Student>getAll(){ add(); return students; }
	 * 
	 * @GetMapping("/{id}") public Student get(@PathVariable("id") String id) {
	 * add(); for (Student student:students) { if(student.getId().equals(id)) {
	 * return student; } } return null; }
	 */
//	Map<String, Student> students = new HashMap<String, Student>();
//
//	public StudentController() {
//		Student james=new Student("2016-ICT-10","James",24,"BSc in IT",3.78);
//		Student ravi=new Student("2016-ICT-02","ravi",24,"BSc in IT",3.0);
//		Student jamjackSparrow=new Student("2016-ICT-67","jamjackSparrow",29,"BSc in IT",2.7);
//		students.put(james.getId(),james);
//		students.put(ravi.getId(),ravi);
//		students.put(jamjackSparrow.getId(),jamjackSparrow );
//	}
	@GetMapping
	public Collection<Student> getAll() {
		// add();
		return students.getAll();
	}

	@GetMapping("/{id}")
	public Student get(@PathVariable("id") String id) {
		// add();
		return students.get(id);
	}

	@PostMapping 
	public void add(@RequestBody Student student) {
		students.add(student);
	}
	
	@DeleteMapping("/{id}")
	public void delete(@PathVariable("id") String id) {
		students.delete(id);
	}

	@PutMapping("/{id}")
	public void update(@PathVariable("id") String id,@RequestBody Student student) {
		students.update(id, student);
	}
	//Update
	//Delete 
}
