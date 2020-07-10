package com.tc.service;

import java.util.ArrayList;

import com.tc.dao.SignSelectMyDao;
import com.tc.dao.SignZCDao;
import com.tc.imp.SignSelectMyImp;
import com.tc.imp.SignZCImp;
import com.tc.pojo.SignTCcheckwork;



public class SignSelectMyService {
	SignSelectMyDao dao=new SignSelectMyImp();
	 public ArrayList<SignTCcheckwork> selectMy(int id){
		 return dao.selectMy(id);
	 }
}
