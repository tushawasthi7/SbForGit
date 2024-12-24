package git_test.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/user")
public class UserController {


@GetMapping("/addJobs")
public String addJobs() {
	return "employer/addJobs";
}



}
