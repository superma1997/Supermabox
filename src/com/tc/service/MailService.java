package com.tc.service;

import java.util.ArrayList;

import com.tc.dao.MailDao;
import com.tc.dao.MailDaoimp;
import com.tc.pojo.Email;

public class MailService {
 MailDao dao=new MailDaoimp();
//发送邮件
public boolean SendEmail(Email email){
		return dao.SendEmail(email);}
	
//保存邮件草稿箱
public boolean SaveEmail(Email email){
		return dao.SaveEmail(email);}

//查询全部邮件
public ArrayList<Email> SelectEmail(){
	return dao.SelectEmail();}

//彻底删除邮件
public boolean DeleteEmail(String id,String name){
	return dao.DeleteEmail(id,name);}

//发件箱删除邮件
public boolean SendDeleteEmail(String id){
	return dao.SendDeleteEmail(id);}


//收件箱删除邮件
public boolean ReciveDeleteEmail(String id) {
	return dao.ReciveDeleteEmail(id);}


//发件箱查询
public ArrayList<Email> FajianEmail(String sname){
	return dao.fajianEmail(sname);}

//收件箱查询
public ArrayList<Email> ShoujianEmail(String rname){
	return dao.ShoujianEmail(rname);}



//草稿箱查询
public ArrayList<Email> CaogaoEmail(String sname){
return  dao.CaogaoEmail(sname);}


//垃圾箱查询
public  ArrayList<Email> LajiEmail(String name){
return dao.LajiEmail(name);}


//垃圾箱还原
public boolean HuanyuanEmail(String id,String name) {
	return dao.HuanyuanEmail(id,name);}


//修改已读未读状态
public  boolean StatementEmail(String id) {
	return dao.StateEmail(id);}
	





}
