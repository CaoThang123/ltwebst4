package vn.iotstar.sevices;

import vn.iotstar.models.UserModel2;

public interface IUserService1 {

	
	void insert(UserModel2 user);
	boolean register(String email, String password, String username, String 
	fullname, String phone);
	boolean checkExistEmail(String email);
	boolean checkExistUsername(String username);
	boolean checkExistPhone(String phone);
}
