package com.learn.myapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class MyappApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyappApplication.class, args);
	}

	@GetMapping("/hello")
	public String sayHello() {
		return "أول API بتاعتي شغّالة! 🚀";
	}

	// @GetMapping("/name/{username}")
	// public String getName(@PathVariable String username) {
	// return "HI, " + username + "! 👋";
	// }

	// @GetMapping("/name/{username}/age/{age}")
	// public String getNameAndAge(@PathVariable String username, @PathVariable int
	// age) {
	// return "HI, " + username + "! You are " + age + " years old. 👋";
	// }

	@GetMapping("/search")
	public String getNameAndAge(@RequestParam String username, @RequestParam int age) {
		return "HI, " + username + "! You are " + age + " years old. 👋";
	}

	@GetMapping("/mydata")
	public String getMyData(@RequestParam String name, @RequestParam int age, @RequestParam String university) {
		return "Data for " + name + ", age " + age + ", university " + university;
	}

	@GetMapping("/student/{name}")
	public String getStudentData(@PathVariable String name, @RequestParam int grade) {
		return "Student " + name + " has grade " + grade;
	}

	@GetMapping("course/{name}")
	public String getCourseData(@PathVariable String name, @RequestParam int hours) {
		return "Course " + name + " has " + hours + " hours";
	}
}