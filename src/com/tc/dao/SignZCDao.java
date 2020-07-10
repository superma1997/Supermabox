package com.tc.dao;

import java.util.ArrayList;
import java.util.List;

import com.tc.pojo.SignTCcheckwork;

public interface SignZCDao {
	public boolean findtxtNameAndDate(int id,String txtName,String mdate,String mstate);
	public ArrayList<SignTCcheckwork> selectAll();
}
