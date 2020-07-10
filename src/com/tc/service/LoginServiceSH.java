package com.tc.service;


import com.tc.dao.LoginDaoSH;
import com.tc.imp.LoginDaoImpSH;

public class LoginServiceSH {
	LoginDaoSH ldao=new LoginDaoImpSH();
	public boolean selectUserByNameAndPassword(String username, String pwd) {
		if(username!=null||!username.equals("")){
			return ldao.findUserByNameAndPassword(username,pwd);
		}
		return false;
	}

}
