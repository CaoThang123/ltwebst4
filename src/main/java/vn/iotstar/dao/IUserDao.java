package vn.iotstar.dao;

import java.util.List;

import vn.iotstar.models.UserModel1;

public interface IUserDao {
	List<UserModel1> findAll();
	
	UserModel1 findById(int id);
	
	void insert(UserModel1 user);
	
	UserModel1 findByUserName(String username);
	
}
