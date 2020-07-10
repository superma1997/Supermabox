package com.tc.imp;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import com.tc.dao.SignSelectMyDao;
import com.tc.pojo.SignTCcheckwork;
import com.tc.tool.DBUtil;

public class SignSelectMyImp implements SignSelectMyDao{
	Connection con=DBUtil.getConnection();
	@Override
	public ArrayList<SignTCcheckwork> selectMy(int id) {
		ArrayList<SignTCcheckwork> alist=new ArrayList<SignTCcheckwork>();
		
		String sql="select * from TCcheckwork where id=?";
		try {
			PreparedStatement pstmt=con.prepareStatement(sql);
			pstmt.setInt(1, id);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return alist;
	}
	
	
}
