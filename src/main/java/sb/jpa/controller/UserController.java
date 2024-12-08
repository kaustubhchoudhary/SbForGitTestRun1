package sb.jpa.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.PathVariable;

import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import sb.jpa.entities.User;

@RestController
@RequestMapping("/user")
public class UserController {

	@GetMapping("/{id}")
	public User getData(@PathVariable int id) {
		return new User(id, "Umesh");
	}

	@GetMapping("/")
	public List<User> getAll() {
		return List.of(new User(101, "Raj"), new User(102, "Raj"));
	}
	
	@PutMapping("/update")
	public User updateUser(@RequestBody User user) {
		return new User(101, "ajay");
	}

}