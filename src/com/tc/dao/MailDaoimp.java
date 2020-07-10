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

	
//�����ʼ�
@Override
    public boolean SendEmail(Email email) {
		boolean flag=false;
		String sql="insert into email values(tcemail.nextval,?,?,?,'δ��',?,?,'�շ�����','��','��','��','��')";
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

	









//����ݸ���
	@Override
	public boolean SaveEmail(Email email) {
		boolean flag=false;
		String sql="insert into email values(tcemail.nextval,?,?,?,'δ��',?,?,'�ݸ���','��','��','��','��')";
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
	
    
	
	
	
	
	
	
	
	
	
	
	
	//��ѯȫ���ʼ�
	@Override
	public ArrayList<Email>  SelectEmail(){
		ArrayList<Email> alist=new ArrayList<Email>();
		Connection con=DBUtil.getConnection();
String sql="select * from email and position='�շ�����'";
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

    
	
	
	
	
	
	
	
	
	
	
	//����ɾ���ʼ�
	@Override
	public boolean DeleteEmail(String id,String name){
		String sql="update email set lsdelete='��' where  id=? and sname=? and sdelete='��'";
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
		 String sql2="update email set lrdelete='��' where id=? and rname=? and rdelete='��'";
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
		String sql3="update email set lsdelete='��' where id=? and position='�ݸ���'";
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


    
	
	
	
	
	
	
	
	
	
	
	
	//�������ѯ
	@Override
	public ArrayList<Email> fajianEmail(String sname) {
		ArrayList<Email> alist=new ArrayList<Email>();
		Connection con=DBUtil.getConnection();
String sql="select * from email where sName=? and position='�շ�����' and sdelete='��'";
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

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	//�ռ����ѯ
	@Override
	public ArrayList<Email> ShoujianEmail(String rname) {
		ArrayList<Email> alist=new ArrayList<Email>();
		Connection con=DBUtil.getConnection();
String sql="select * from email where rName=? and position='�շ�����' and rdelete='��'";
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



	
	
	
	
	
	
	
	
	//�ݸ����ѯ
	@Override
	public ArrayList<Email> CaogaoEmail(String sname) {
		ArrayList<Email> alist=new ArrayList<Email>();
		Connection con=DBUtil.getConnection();
String sql="select * from email where sName=? and position='�ݸ���' and lsdelete='��'";
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


	
	
	

	
	
	
	
	
	
	
	
	
	//�������ѯ
	@Override
	public ArrayList<Email> LajiEmail(String name) {
		ArrayList<Email> alist=new ArrayList<Email>();
		Connection con=DBUtil.getConnection();
String sql="select * from email where sdelete='��' and sname=? and lsdelete='��' ";
String sql2="select * from email where rdelete='��' and rname=? and lrdelete='��' ";
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


	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	//������ɾ���ʼ�
	@Override
	public boolean SendDeleteEmail(String id) {
			String sql="update email set sdelete='��' where id=?";
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


    
	
	
	
	
	
	
	
	
	
	
	//�ռ���ɾ���ʼ�
	@Override
	public boolean ReciveDeleteEmail(String id) {
		String sql="update email set rdelete='��' where id=?";
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


	
	
	
	
	
	
	
	//�����仹ԭ
	@Override
	public boolean HuanyuanEmail(String id, String name) {
		String sql="update email set sdelete='��' where  id=? and sname=? and sdelete='��'";
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
		 String sql2="update email set rdelete='��' where id=? and rname=? and rdelete='��'";
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

	
	
	
	
	
	
	

	
	//�޸�״̬
	@Override
	public boolean StateEmail(String id) {
		String sql="update email set state='�Ѷ�' where id=?";
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


