package com.tc.service;


import com.tc.dao.SignUpdateDao;
import com.tc.imp.SignUpdateImp;
import com.tc.pojo.SignTCcheckwork;


public class SignUpdateService {
	SignUpdateDao dao=new SignUpdateImp();
	public boolean UpdateTCcheckwork(SignTCcheckwork tck){
   	 return dao.updateTCcheckwork(tck);
    }
}
