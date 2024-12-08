package sb.jpa.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {
	
	@GetMapping("/{id}")
	public String getData() {
		return "data";
	}
	
	@GetMapping("/")
	public String getAll() {
		System.out.println("New changes 1");
		System.out.println("New changes 2");
		System.out.println("New changes 3");
		return "All";
	}

}