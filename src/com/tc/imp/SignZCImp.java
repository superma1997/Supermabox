package com.tc.imp;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.tc.dao.SignZCDao;
import com.tc.pojo.SignTCcheckwork;
import com.tc.tool.DBUtil;




public class SignZCImp implements SignZCDao{
	Connection con=DBUtil.getConnection();
	@Override
	
	public boolean findtxtNameAndDate(int id,String txtName,String mdate,String mstate) {
		
		String sql="insert into tccheckwork(id,name,mdate,mstate,pid) values(?,?,?,?,CHECKWORK.nextval)";
		boolean x=false;
		try {
			PreparedStatement pstmt=con.prepareStatement(sql);
			pstmt.setInt(1, id);
			pstmt.setString(2, txtName);
			pstmt.setString(3, mdate);
			pstmt.setString(4,mstate );
			int ii=pstmt.executeUpdate();
			if(ii==1){
				x=true;//找到这个人为true
		}else{
				x=false;
		}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return true;
	}
	@Override
	public ArrayList<SignTCcheckwork> selectAll() {
		ArrayList<SignTCcheckwork> alist=new ArrayList<SignTCcheckwork>();
		Connection conn=DBUtil.getConnection();
		String sql="select * from TCcheckwork";
		try {
			Statement stmt=conn.createStatement();
			ResultSet rs=stmt.executeQuery(sql);
			while(rs.next()){
				SignTCcheckwork e=new SignTCcheckwork();
				e.setId(rs.getInt("Id"));
				e.setName(rs.getString("name"));
				e.setMdate(rs.getString("mdate"));
				e.setMstate(rs.getString("mstate"));
				e.setPid(rs.getInt("pid"));
				alist.add(e);
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return alist;
	}
}
