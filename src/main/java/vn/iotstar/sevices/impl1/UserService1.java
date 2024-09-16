package vn.iotstar.sevices.impl1;

import vn.iotstar.dao.IUserDao1;
import vn.iotstar.dao.impl1.UserDaoImpl1;
import vn.iotstar.models.UserModel2;
import vn.iotstar.sevices.IUserService1;

public class UserService1 implements IUserService1{
  IUserDao1 userDao = new UserDaoImpl1();
	@Override
	public void insert(UserModel2 user) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean register(String email, String password, String username, String fullname, String phone) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean checkExistEmail(String email) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean checkExistUsername(String username) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean checkExistPhone(String phone) {
		// TODO Auto-generated method stub
		return false;
	}

}
