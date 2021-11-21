package com.example.tariflerim.business.abstracts;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.tariflerim.core.utilities.result.DataResult;
import com.example.tariflerim.core.utilities.result.Result;
import com.example.tariflerim.entites.concoretes.User;

@Service
public interface UserService {

	DataResult<List<User>> getAll();
	
	DataResult<User> getByUserId(int userId);
	
	DataResult<User> getByEmailAndPassword(String email, String password);

	Result add(User user);
}
