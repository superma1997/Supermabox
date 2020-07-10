package com.tc.dao;

import java.util.ArrayList;

import com.tc.pojo.LoginEmp;

public interface LoginDaoSH {

	boolean findUserByNameAndPassword(String strName, String strPwd);

}
