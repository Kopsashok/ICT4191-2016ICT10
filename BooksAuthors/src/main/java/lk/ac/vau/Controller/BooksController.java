package lk.ac.vau.Controller;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lk.ac.vau.Model.Books;
import lk.ac.vau.Repo.BooksRepoo;

@RestController
@RequestMapping("Bookss")
@Produces(MediaType.APPLICATION_XML)
@Consumes(MediaType.APPLICATION_XML)

public class BooksController {
	@Autowired
	private BooksRepoo book;
		
		@GetMapping
		public List<Books> getAll(){
			return book.findAll();
		}
		
		@GetMapping("/{id}")
		public Books get(@PathVariable("id") String id) {
			return book.findById(id).get();
		}
		@PostMapping
		public void add(@RequestBody Books c) {
			book.save(c);
		}
		
		@DeleteMapping("/{id}")
		public void delte(@PathVariable("id") String id) {
			book.deleteById(id);
		}
		
		@PutMapping
		public void update(@RequestBody Books c) {
			book.save(c);
		}
}
