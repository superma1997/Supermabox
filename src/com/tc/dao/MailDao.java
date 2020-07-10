package com.tc.dao;

import java.util.ArrayList;
import java.util.List;

import com.tc.pojo.Email;

public interface MailDao {

//�����ʼ�
public boolean SendEmail(Email email);

//����ݸ���
public boolean SaveEmail(Email email);

//��ѯȫ���ʼ�
public ArrayList<Email> SelectEmail();

//����ɾ���ʼ�
public boolean DeleteEmail(String id,String name);

//�������ѯ
public ArrayList<Email> fajianEmail(String sname);

//�ռ����ѯ
public ArrayList<Email> ShoujianEmail(String rname);

//�ݸ����ѯ
public ArrayList<Email> CaogaoEmail(String sname);

//�������ѯ
public ArrayList<Email> LajiEmail(String name);

//������ɾ���ʼ�
public boolean SendDeleteEmail(String id);

//�ռ���ɾ���ʼ�
public boolean ReciveDeleteEmail(String id);

//�����仹ԭ
public boolean HuanyuanEmail(String id,String name);


//�޸�״̬
public boolean StateEmail(String id);
}
