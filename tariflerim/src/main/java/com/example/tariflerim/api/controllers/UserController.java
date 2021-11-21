package com.example.tariflerim.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.tariflerim.business.abstracts.UserService;
import com.example.tariflerim.core.utilities.result.DataResult;
import com.example.tariflerim.core.utilities.result.Result;
import com.example.tariflerim.core.utilities.result.SuccessResult;
import com.example.tariflerim.entites.concoretes.User;

@CrossOrigin
@RestController
@RequestMapping("/api/users")
public class UserController {

	private UserService userService;

	@Autowired
	public UserController(UserService userService) {
		super();
		this.userService = userService;
	}
	
	@GetMapping("/getAll")
	public DataResult<List<User>> getAll() {
		return userService.getAll();
	}

	@GetMapping("/getByUserId")
	public DataResult<User> getByUserId(int userId) {
		return userService.getByUserId(userId);
	}

	@GetMapping("/getByUserEmailAndPassword")
	public DataResult<User> getByEmailAndPassword(String email, String password) {
		return userService.getByEmailAndPassword(email, password);
	}	
	
	@PostMapping("/add")
	public Result add(@RequestBody User user) {
		userService.add(user);
		return new SuccessResult("kullanıcı eklendi");
	}
}
