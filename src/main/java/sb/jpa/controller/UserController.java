package sb.jpa.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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
	public String getAll() {
		System.out.println("New changes 1");
		System.out.println("New changes 2");
		System.out.println("New changes 3");
		return "All";
	}

}