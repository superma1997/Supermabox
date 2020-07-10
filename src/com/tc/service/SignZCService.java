package com.tc.service;

import java.util.ArrayList;

import com.tc.dao.SignZCDao;
import com.tc.imp.SignZCImp;
import com.tc.pojo.SignTCcheckwork;

public class SignZCService {
	SignZCDao dao=new SignZCImp();
 public boolean Qiandao(int id,String txtName,String mdate,String mstate){
	return dao.findtxtNameAndDate(id, txtName, mdate, mstate);
  }
 public ArrayList<SignTCcheckwork> selectAll(){
	 return dao.selectAll();
 }
}
