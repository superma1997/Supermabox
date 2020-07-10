package com.tc.imp;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.tc.dao.ScheduleDao;
import com.tc.pojo.PersonalSchedule;
import com.tc.tool.DBUtil;

public class ScheduleDaoImp implements ScheduleDao{

//锟斤拷询锟斤拷锟斤拷
	@Override
	public List<PersonalSchedule> getAllPersons() {
		List<PersonalSchedule> alist=new ArrayList<PersonalSchedule>();
		
		String sql="select pid,stime,title,type,notes from personalschedule";
		try {
			Connection con=DBUtil.getConnection();
			Statement sta=con.createStatement();
		     ResultSet rs=sta.executeQuery(sql);
		   
			while(rs.next()){
				PersonalSchedule ps=new PersonalSchedule();
				ps.setPid(rs.getInt("pid"));
				ps.setDate(rs.getString("stime"));
				ps.setTitle(rs.getString("title"));
				ps.setPtype(rs.getString("type"));
				ps.setNotes(rs.getString("notes"));
				alist.add(ps);
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return alist;
	}
	
	@Override
	public boolean deletePersonById(String pid) {
		String sql="delete  from personalschedule where pid=?";
		Connection con=DBUtil.getConnection();
		int del=0;
		try {
			PreparedStatement pstmt=con.prepareStatement(sql);
			pstmt.setString(1, pid);
			del=pstmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return del>0?true:false;
	}
	//锟睫改诧拷锟斤拷
	@Override
	public boolean updatePersons(PersonalSchedule psc) {
			String sql="update personalschedule set pid=?,stime=?,title=?,type=?,notes=? where pid=?";
			Connection con=DBUtil.getConnection();
			int suc=0;
			try {
				PreparedStatement pstmt=con.prepareStatement(sql);
			
				pstmt.setInt(1, psc.getPid());
				pstmt.setString(2, psc.getDate());
				pstmt.setString(3, psc.getTitle());
				pstmt.setString(4, psc.getPtype());
				pstmt.setString(5, psc.getNotes());
				pstmt.setInt(6, psc.getPid());//锟角凤拷锟斤拷锟�
				suc= pstmt.executeUpdate();
				System.out.println(suc);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}//
			
			return suc>0?true:false;
		}
	@Override
	public PersonalSchedule selectPersonById(String pid){
		String sql="select pid,stime,title,type,notes from  personalschedule where pid=?";
		PersonalSchedule psc=new PersonalSchedule();//锟斤拷锟斤拷锟斤拷装锟斤拷询锟斤拷实锟斤拷
		try {
			Connection con=DBUtil.getConnection();
			System.out.println(666);
			PreparedStatement pstmt=con.prepareStatement(sql);
			ResultSet rs=pstmt.executeQuery();
			  System.out.println(555);
			 pstmt.setString(1, pid);//锟斤拷锟矫诧拷锟斤拷  锟窖诧拷锟斤拷值锟斤拷锟斤拷锟斤拷一锟斤拷锟绞猴拷
			if(rs.next()){//锟斤拷锟斤拷榈�,锟斤拷装锟斤拷实锟斤拷锟斤拷
				psc.setPid(rs.getInt("pid"));
				psc.setDate(rs.getString("stime"));
				psc.setTitle(rs.getString("title"));
				psc.setPtype(rs.getString("type"));
				psc.setNotes(rs.getString("notes"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return psc;
		
	}

}

