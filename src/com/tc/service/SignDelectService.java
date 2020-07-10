package com.tc.service;

import com.tc.dao.SignDelectDao;
import com.tc.imp.SignDelectImp;
import com.tc.pojo.SignTCcheckwork;

public class SignDelectService {
	SignDelectDao dd=new SignDelectImp();
	public boolean delect(String mdate){
		return dd.delect(mdate);
	}
}
