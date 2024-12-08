package sb.jpa.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import sb.jpa.entities.User;

@RestController
@RequestMapping("/user")
public class UserController {

	@GetMapping("/{id}")
	public String getData() {
		return "data";
	}

	@GetMapping("/")
	public List<User> getAll() {
		return List.of(new User(101, "Raj"), new User(102, "Raj"));
	}

}