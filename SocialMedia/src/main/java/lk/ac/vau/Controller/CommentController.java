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

import lk.ac.vau.Repo.CommentRepoo;
import lk.ac.vau.Model.Comment; 

@RestController
@RequestMapping("Comment")
@Produces(MediaType.APPLICATION_XML)
@Consumes(MediaType.APPLICATION_XML)

public class CommentController {

	@Autowired
	private CommentRepoo cmt;
		
		@GetMapping
		public List<Comment> getAll(){
			return cmt.findAll();
		}
		
		@GetMapping("/{id}")
		public Comment get(@PathVariable("id") Long id) {
			return cmt.findById(id).get();
		}
		@PostMapping
		public void add(@RequestBody Comment c) {
			cmt.save(c);
		}
		
		@DeleteMapping("/{id}")
		public void delte(@PathVariable("id") Long id) {
			cmt.deleteById(id);
		}
		
		@PutMapping
		public void update(@RequestBody Comment c) {
			cmt.save(c);
		}
}
