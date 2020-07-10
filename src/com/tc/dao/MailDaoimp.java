package com.tc.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;


import com.tc.pojo.Email;
import com.tc.tool.DBUtil;

public class MailDaoimp implements MailDao{

	
//发送邮件
@Override
    public boolean SendEmail(Email email) {
		boolean flag=false;
		String sql="insert into email values(tcemail.nextval,?,?,?,'未读',?,?,'收发件箱','否','否','否','否')";
		Connection con=DBUtil.getConnection();
		try {
			PreparedStatement pre=con.prepareStatement(sql);
			pre.setString(1, email.getsName());
			System.out.println(email.getsName());
			pre.setString(2, email.getTime());
			pre.setString(3, email.getrName());
			pre.setString(4, email.getTitle());
			pre.setString(5, email.getText());
			int a=pre.executeUpdate();
			if(a!=0){
				flag=true;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return flag;
	}

	









//保存草稿箱
	@Override
	public boolean SaveEmail(Email email) {
		boolean flag=false;
		String sql="insert into email values(tcemail.nextval,?,?,?,'未读',?,?,'草稿箱','否','否','否','否')";
		Connection con=DBUtil.getConnection();
		try {
			PreparedStatement pre=con.prepareStatement(sql);
			pre.setString(1, email.getsName());
			pre.setString(2, email.getTime());
			pre.setString(3, email.getrName());
			pre.setString(4, email.getTitle());
			pre.setString(5, email.getText());
			int a=pre.executeUpdate();
			if(a!=0){
				flag=true;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return flag;}
	
    
	
	
	
	
	
	
	
	
	
	
	
	//查询全部邮件
	@Override
	public ArrayList<Email>  SelectEmail(){
		ArrayList<Email> alist=new ArrayList<Email>();
		Connection con=DBUtil.getConnection();
String sql="select * from email and position='收发件箱'";
try {
	Statement sta=con.createStatement();
	ResultSet res=sta.executeQuery(sql);
	while(res.next()){
		Email email=new Email();
		email.setId(res.getInt("id"));
		email.setsName(res.getString("sname"));
		email.setrName(res.getString("rname"));
		email.setTime(res.getString("time"));
		email.setTitle(res.getString("title"));
		email.setText(res.getString("text"));
		alist.add(email);
	}
} catch (SQLException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
		return alist;
	}

    
	
	
	
	
	
	
	
	
	
	
	//彻底删除邮件
	@Override
	public boolean DeleteEmail(String id,String name){
		String sql="update email set lsdelete='是' where  id=? and sname=? and sdelete='是'";
		 boolean flag=false;
		 Connection con=DBUtil.getConnection();
		 try {
			PreparedStatement pstmt=con.prepareStatement(sql);
		    pstmt.setString(1,id);
		    pstmt.setString(2,name);
			flag=pstmt.executeUpdate()>0?true:false;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 String sql2="update email set lrdelete='是' where id=? and rname=? and rdelete='是'";
		 boolean flag2=false;
		 try {
			PreparedStatement pstmt=con.prepareStatement(sql2);
		    pstmt.setString(1, id);
		    pstmt.setString(2,name);
			flag2=pstmt.executeUpdate()>0?true:false;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String sql3="update email set lsdelete='是' where id=? and position='草稿箱'";
		 boolean flag3=false;
		 try {
			PreparedStatement pstmt=con.prepareStatement(sql3);
		    pstmt.setString(1, id);
			flag3=pstmt.executeUpdate()>0?true:false;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}if(flag||flag2||flag3){
			flag=true;
		}else{
			flag=false;
		}
		 
		return flag;
	}


    
	
	
	
	
	
	
	
	
	
	
	
	//发件箱查询
	@Override
	public ArrayList<Email> fajianEmail(String sname) {
		ArrayList<Email> alist=new ArrayList<Email>();
		Connection con=DBUtil.getConnection();
String sql="select * from email where sName=? and position='收发件箱' and sdelete='否'";
try {
	PreparedStatement pstmt=con.prepareStatement(sql);
    pstmt.setString(1, sname);
	ResultSet res=pstmt.executeQuery();
	while(res.next()){
		Email email=new Email();
		email.setId(res.getInt("id"));
		email.setsName(res.getString("sname"));
		email.setrName(res.getString("rname"));
		email.setTime(res.getString("time"));
		email.setTitle(res.getString("title"));
		email.setText(res.getString("text"));
		alist.add(email);
	}
} catch (SQLException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
		return alist;
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	//收件箱查询
	@Override
	public ArrayList<Email> ShoujianEmail(String rname) {
		ArrayList<Email> alist=new ArrayList<Email>();
		Connection con=DBUtil.getConnection();
String sql="select * from email where rName=? and position='收发件箱' and rdelete='否'";
try {
	PreparedStatement pstmt=con.prepareStatement(sql);
    pstmt.setString(1, rname);
	ResultSet res=pstmt.executeQuery();
	while(res.next()){
		Email email=new Email();
		email.setId(res.getInt("id"));
		email.setsName(res.getString("sname"));
		email.setrName(res.getString("rname"));
		email.setTime(res.getString("time"));
		email.setState(res.getString("state"));
		email.setTitle(res.getString("title"));
		email.setText(res.getString("text"));
		alist.add(email);
	}
} catch (SQLException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
		return alist;
	}



	
	
	
	
	
	
	
	
	//草稿箱查询
	@Override
	public ArrayList<Email> CaogaoEmail(String sname) {
		ArrayList<Email> alist=new ArrayList<Email>();
		Connection con=DBUtil.getConnection();
String sql="select * from email where sName=? and position='草稿箱' and lsdelete='否'";
try {
	PreparedStatement pstmt=con.prepareStatement(sql);
    pstmt.setString(1, sname);
	ResultSet res=pstmt.executeQuery();
	while(res.next()){
		Email email=new Email();
		email.setId(res.getInt("id"));
		email.setsName(res.getString("sname"));
		email.setrName(res.getString("rname"));
		email.setTime(res.getString("time"));
		email.setTitle(res.getString("title"));
		email.setText(res.getString("text"));
		alist.add(email);
	}
} catch (SQLException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
		return alist;
	}


	
	
	

	
	
	
	
	
	
	
	
	
	//垃圾箱查询
	@Override
	public ArrayList<Email> LajiEmail(String name) {
		ArrayList<Email> alist=new ArrayList<Email>();
		Connection con=DBUtil.getConnection();
String sql="select * from email where sdelete='是' and sname=? and lsdelete='否' ";
String sql2="select * from email where rdelete='是' and rname=? and lrdelete='否' ";
try {
	PreparedStatement pre=con.prepareStatement(sql);
	pre.setString(1, name);
    ResultSet res=pre.executeQuery();
	while(res.next()){
		Email email=new Email();
		email.setId(res.getInt("id"));
		email.setsName(res.getString("sname"));
		email.setrName(res.getString("rname"));
		email.setTime(res.getString("time"));
		email.setTitle(res.getString("title"));
		email.setText(res.getString("text"));
		alist.add(email);
	}
} catch (SQLException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}try {
	PreparedStatement pre=con.prepareStatement(sql2);
	pre.setString(1, name);
    ResultSet res=pre.executeQuery();
	while(res.next()){
		Email email=new Email();
		email.setId(res.getInt("id"));
		email.setsName(res.getString("sname"));
		email.setrName(res.getString("rname"));
		email.setTime(res.getString("time"));
		email.setTitle(res.getString("title"));
		email.setText(res.getString("text"));
		alist.add(email);
	}
} catch (SQLException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}return alist;
	}


	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	//发件箱删除邮件
	@Override
	public boolean SendDeleteEmail(String id) {
			String sql="update email set sdelete='是' where id=?";
			 boolean flag=false;
			 Connection con=DBUtil.getConnection();
			 try {
				PreparedStatement pstmt=con.prepareStatement(sql);
			    pstmt.setString(1, id);
				flag=pstmt.executeUpdate()>0?true:false;
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			 
			return flag;
		}


    
	
	
	
	
	
	
	
	
	
	
	//收件箱删除邮件
	@Override
	public boolean ReciveDeleteEmail(String id) {
		String sql="update email set rdelete='是' where id=?";
		 boolean flag=false;
		 Connection con=DBUtil.getConnection();
		 try {
			PreparedStatement pstmt=con.prepareStatement(sql);
		    pstmt.setString(1, id);
			flag=pstmt.executeUpdate()>0?true:false;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
		return flag;
	}


	
	
	
	
	
	
	
	//垃圾箱还原
	@Override
	public boolean HuanyuanEmail(String id, String name) {
		String sql="update email set sdelete='否' where  id=? and sname=? and sdelete='是'";
		 boolean flag=false;
		 Connection con=DBUtil.getConnection();
		 try {
			PreparedStatement pstmt=con.prepareStatement(sql);
		    pstmt.setString(1,id);
		    pstmt.setString(2,name);
			flag=pstmt.executeUpdate()>0?true:false;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 String sql2="update email set rdelete='否' where id=? and rname=? and rdelete='是'";
		 boolean flag2=false;
		 try {
			PreparedStatement pstmt=con.prepareStatement(sql2);
		    pstmt.setString(1, id);
		    pstmt.setString(2,name);
			flag2=pstmt.executeUpdate()>0?true:false;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}if(flag||flag2){
			flag=true;
		}else{
			flag=false;
		}
		 
		return flag;
	}

	
	
	
	
	
	
	

	
	//修改状态
	@Override
	public boolean StateEmail(String id) {
		String sql="update email set state='已读' where id=?";
		 boolean flag=false;
		 Connection con=DBUtil.getConnection();
		 try {
			PreparedStatement pstmt=con.prepareStatement(sql);
		    pstmt.setString(1, id);
			flag=pstmt.executeUpdate()>0?true:false;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
		return flag;
	}
	}


