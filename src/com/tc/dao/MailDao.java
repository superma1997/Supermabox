package com.tc.dao;

import java.util.ArrayList;
import java.util.List;

import com.tc.pojo.Email;

public interface MailDao {

//发送邮件
public boolean SendEmail(Email email);

//保存草稿箱
public boolean SaveEmail(Email email);

//查询全部邮件
public ArrayList<Email> SelectEmail();

//彻底删除邮件
public boolean DeleteEmail(String id,String name);

//发件箱查询
public ArrayList<Email> fajianEmail(String sname);

//收件箱查询
public ArrayList<Email> ShoujianEmail(String rname);

//草稿箱查询
public ArrayList<Email> CaogaoEmail(String sname);

//垃圾箱查询
public ArrayList<Email> LajiEmail(String name);

//发件箱删除邮件
public boolean SendDeleteEmail(String id);

//收件箱删除邮件
public boolean ReciveDeleteEmail(String id);

//垃圾箱还原
public boolean HuanyuanEmail(String id,String name);


//修改状态
public boolean StateEmail(String id);
}
