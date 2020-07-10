package com.tc.imp;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import com.tc.dao.LoginDaoSH;
import com.tc.pojo.LoginEmp;
import com.tc.tool.DBUtil;

public class LoginDaoImpSH implements LoginDaoSH{
		Connection con=DBUtil.getConnection();
	@Override
	public boolean findUserByNameAndPassword(String strName, String strPwd) {
		String sql="select * from tcemp where name=? and password=?";
	//	System.out.println(strName);
		boolean flag=false;
		try {
			PreparedStatement pstmt=con.prepareStatement(sql);
			pstmt.setString(1,strName);
			pstmt.setString(2,strPwd);
			ResultSet rs=pstmt.executeQuery();
			if(rs.next()){
				flag=true;
			}else{
				flag=false;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return flag;
	}
	

}
