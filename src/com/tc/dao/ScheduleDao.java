package com.tc.dao;

import java.util.List;

import com.tc.pojo.PersonalSchedule;

public interface ScheduleDao {
	public List<PersonalSchedule> getAllPersons();
	
	public PersonalSchedule selectPersonById(String pid);

	public boolean deletePersonById(String pid);

	public boolean updatePersons(PersonalSchedule psc);

}
