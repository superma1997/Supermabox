package com.tc.service;

import java.util.List;

import com.tc.dao.ScheduleDao;
import com.tc.imp.ScheduleDaoImp;
import com.tc.pojo.PersonalSchedule;



public class ScheduleServer {
	ScheduleDao  scd= new ScheduleDaoImp();
	//��ѯ����
	public List<PersonalSchedule> selectAllPersons(){
		return scd.getAllPersons();
	}
	public static void main(String[] args){
		ScheduleDao  scd= new ScheduleDaoImp();
		System.out.println(scd.getAllPersons());
	}
//ɾ��ָ����¼
	public boolean removePersonById(String id){
		 
		return  scd.deletePersonById(id);
	}
	//��ѯ���޸ĵ������
	public PersonalSchedule selectPersById(String strId) {
		
		return scd.selectPersonById(strId);
	}
	//�޸ĵ�ǰ���
	public boolean updateSchedule(PersonalSchedule psc){
		
		return scd.updatePersons(psc);
		
	}

}

