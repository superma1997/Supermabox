package com.tc.imp;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.tc.dao.SignUpdateDao;
import com.tc.pojo.SignTCcheckwork;
import com.tc.tool.DBUtil;


public class SignUpdateImp implements SignUpdateDao{

	@Override
	public boolean updateTCcheckwork(SignTCcheckwork tcw) {
		String sql="update TCcheckwork set mstate=? where id=?";
		Connection con=DBUtil.getConnection();
		int suc=0;
		try {
			PreparedStatement pstmt=con.prepareStatement(sql);
			
			pstmt.setString(1, tcw.getMstate());
			
			pstmt.setDouble(2, tcw.getId());//ÊÇ·ñ¿ÉÒÔ
		    suc=pstmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return suc>0?true:false;
	}


}
