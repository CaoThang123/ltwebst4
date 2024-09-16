package vn.iotstar.dao.impl1;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import vn.iotstar.configs.DBConnectSQL;
import vn.iotstar.dao.IUserDao1;
import vn.iotstar.models.UserModel2;

public class UserDaoImpl1 implements IUserDao1 {
	public Connection conn = null;
	public PreparedStatement ps = null;
	public ResultSet rs = null;
	
	@Override
	
	public void insert(UserModel2 user) {
	    String sql = "INSERT INTO users (email, username, fullname, password, avatar, roleid, phone, createddate) "
	               + "VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
	    try {
	        // Kết nối đến cơ sở dữ liệu
	        conn = new DBConnectSQL().getConnection();
	        
	        // Chuẩn bị câu lệnh SQL
	        ps = conn.prepareStatement(sql);
	        
	        // Thiết lập các giá trị cho câu lệnh SQL
	        ps.setString(1, user.getEmail());
	        ps.setString(2, user.getUserName());
	        ps.setString(3, user.getFullName());
	        ps.setString(4, user.getPassWord());
	        ps.setString(5, user.getImages());
	        ps.setInt(6, user.getRoleid());
	        ps.setString(7, user.getPhone());
	        ps.setDate(8, user.getCreatedDate());

	        // Thực thi câu lệnh
	        ps.executeUpdate();
	        
	    } catch (Exception e) {
	        e.printStackTrace();
	    } finally {
	        // Đảm bảo đóng PreparedStatement và Connection
	        try {
	            if (ps != null) ps.close();
	            if (conn != null) conn.close();
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
	    }
	}


	@Override
	public boolean checkExistEmail(String email) {
		boolean duplicate = false;
		String query = "select * from [user] where email = ?";
		try {
		conn = new DBConnectSQL().getConnection();
		ps = conn.prepareStatement(query);
		ps.setString(1, email);
		rs = ps.executeQuery();
		if (rs.next()) {
		duplicate = true;
		}
		ps.close();
		conn.close();
		} catch (Exception ex) {}
		return duplicate;
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
