package com.tc.imp;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.tc.dao.SignDelectDao;
import com.tc.pojo.SignTCcheckwork;
import com.tc.tool.DBUtil;

public class SignDelectImp implements SignDelectDao{
	Connection con=DBUtil.getConnection();
	@Override
	public boolean delect(String pid) {
		boolean flag=false;
		String sql="delete from TCcheckwork where Pid= ?";
		try {
			PreparedStatement pstmt=con.prepareStatement(sql);
			pstmt.setString(1,pid);
		int	a=pstmt.executeUpdate();
			if(a!=0){
				flag=true;
			}else{
		
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return flag ;
	}

}
