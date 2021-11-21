package com.example.tariflerim.business.concoretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.tariflerim.business.abstracts.UserService;
import com.example.tariflerim.core.utilities.result.DataResult;
import com.example.tariflerim.core.utilities.result.Result;
import com.example.tariflerim.core.utilities.result.SuccessDataResult;
import com.example.tariflerim.core.utilities.result.SuccessResult;
import com.example.tariflerim.dataAccess.abstracts.UserDao;
import com.example.tariflerim.entites.concoretes.User;

@Service
public class UserManager implements UserService{

	private UserDao userDao;

	@Autowired
	public UserManager(UserDao userDao) {
		super();
		this.userDao = userDao;
	}

	@Override
	public DataResult<List<User>> getAll() {
		return new SuccessDataResult<List<User>>(userDao.findAll(), "Kullanıcılar listelendi");
	}

	@Override
	public DataResult<User> getByUserId(int userId) {
		return new SuccessDataResult<User>(userDao.getByUserId(userId), "Kullanıcı getirildi");
	}

	@Override
	public DataResult<User> getByEmailAndPassword(String email, String password) {
		return new SuccessDataResult<User>(userDao.getByEmailAndPassword(email, password), "");
	}
	
	@Override
	public Result add(User user) {
		userDao.save(user);
		return new SuccessResult("Kullanıcı eklendi.");
	}
}
