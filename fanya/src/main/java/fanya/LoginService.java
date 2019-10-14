package fanya;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import fanya.Jdbc;
import fanya.Login;


public class LoginService {
	private Connection cn;
	private PreparedStatement pstmt;

	public LoginService() {
		cn = new Jdbc().getCon();
	}

	public boolean valiUser(Login login) {
		try {
			pstmt = cn.prepareStatement("select * from user where name=? and password=?");
			pstmt.setString(1, login.getUsername());/* 设置是否能在数据库表中找到表单提交的login的值的位置 */
			pstmt.setString(2, login.getPassword());
			ResultSet rs = pstmt.executeQuery();/* 将pstmt执行请求后的结果存放在结果集当中 */
			if (rs.next()) {/* 如果结果集里面存在值 则返回true */
				return true;
			} else
				return false;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}
}