package spring.ProductController;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
//@Controller indicates that a particular class serves the role of a controller 
public class MainController {
	@RequestMapping("/")
	//this annotation maps HTTP requests to handler methods of MVC and REST controllers
public String home() {
	return "index";
}
	@GetMapping("/add")
	//this annotation maps HTTP GET requests onto specific handler methods
public String homeAdd() {
	return "index";
}
	@PostMapping("/sub")
	//this annotation maps HTTP POST requests onto specific handler methods
	public String homeSub() {
		return "index";
	}
	@DeleteMapping("/del")
	//this annotation maps HTTP DELETE requests onto specific handler methods
	public String homeDelete() {
		return "index";
	}
}
