package com.tc.pojo;

public class PersonalSchedule {
	private Integer pid;
	private String date;
	private String title;
	private String ptype;
	private String notes;
	public PersonalSchedule(){
		
	}
	public PersonalSchedule(Integer pid, String date, String title, String ptype, String notes) {
		
		this.pid = pid;
		this.date = date;
		this.title = title;
		this.ptype = ptype;
		this.notes = notes;
	}
	public Integer getPid() {
		return pid;
	}
	public void setPid(Integer pid) {
		this.pid = pid;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getPtype() {
		return ptype;
	}
	public void setPtype(String ptype) {
		this.ptype = ptype;
	}
	public String getNotes() {
		return notes;
	}
	public void setNotes(String notes) {
		this.notes = notes;
	}

	
	
}
