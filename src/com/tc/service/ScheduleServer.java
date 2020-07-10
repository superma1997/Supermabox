package com.tc.service;

import java.util.List;

import com.tc.dao.ScheduleDao;
import com.tc.imp.ScheduleDaoImp;
import com.tc.pojo.PersonalSchedule;



public class ScheduleServer {
	ScheduleDao  scd= new ScheduleDaoImp();
	//查询所有
	public List<PersonalSchedule> selectAllPersons(){
		return scd.getAllPersons();
	}
	public static void main(String[] args){
		ScheduleDao  scd= new ScheduleDaoImp();
		System.out.println(scd.getAllPersons());
	}
//删除指定记录
	public boolean removePersonById(String id){
		 
		return  scd.deletePersonById(id);
	}
	//查询并修改单条便笺
	public PersonalSchedule selectPersById(String strId) {
		
		return scd.selectPersonById(strId);
	}
	//修改当前便笺
	public boolean updateSchedule(PersonalSchedule psc){
		
		return scd.updatePersons(psc);
		
	}

}

