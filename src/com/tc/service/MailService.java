package com.tc.service;

import java.util.ArrayList;

import com.tc.dao.MailDao;
import com.tc.dao.MailDaoimp;
import com.tc.pojo.Email;

public class MailService {
 MailDao dao=new MailDaoimp();
//�����ʼ�
public boolean SendEmail(Email email){
		return dao.SendEmail(email);}
	
//�����ʼ��ݸ���
public boolean SaveEmail(Email email){
		return dao.SaveEmail(email);}

//��ѯȫ���ʼ�
public ArrayList<Email> SelectEmail(){
	return dao.SelectEmail();}

//����ɾ���ʼ�
public boolean DeleteEmail(String id,String name){
	return dao.DeleteEmail(id,name);}

//������ɾ���ʼ�
public boolean SendDeleteEmail(String id){
	return dao.SendDeleteEmail(id);}


//�ռ���ɾ���ʼ�
public boolean ReciveDeleteEmail(String id) {
	return dao.ReciveDeleteEmail(id);}


//�������ѯ
public ArrayList<Email> FajianEmail(String sname){
	return dao.fajianEmail(sname);}

//�ռ����ѯ
public ArrayList<Email> ShoujianEmail(String rname){
	return dao.ShoujianEmail(rname);}



//�ݸ����ѯ
public ArrayList<Email> CaogaoEmail(String sname){
return  dao.CaogaoEmail(sname);}


//�������ѯ
public  ArrayList<Email> LajiEmail(String name){
return dao.LajiEmail(name);}


//�����仹ԭ
public boolean HuanyuanEmail(String id,String name) {
	return dao.HuanyuanEmail(id,name);}


//�޸��Ѷ�δ��״̬
public  boolean StatementEmail(String id) {
	return dao.StateEmail(id);}
	





}
