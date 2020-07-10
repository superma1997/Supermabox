package com.tc.pojo;

public class Email {
		  private int id;
		  private String sName;
		  private String time;
		  private String rName;
		  private String state;
		  private String title;
		  private String text;
		  private String position;
		  
		  
		  public Email(){
			  
		  }


		public Email(int id, String sName, String time, String rName, String state, String title, String text,
				String position) {
			
			this.id = id;
			this.sName = sName;
			this.time = time;
			this.rName = rName;
			this.state = state;
			this.title = title;
			this.text = text;
			this.position = position;
		}


		public int getId() {
			return id;
		}


		public void setId(int id) {
			this.id = id;
		}


		public String getsName() {
			return sName;
		}


		public void setsName(String sName) {
			this.sName = sName;
		}


		public String getTime() {
			return time;
		}


		public void setTime(String time) {
			this.time = time;
		}


		public String getrName() {
			return rName;
		}


		public void setrName(String rName) {
			this.rName = rName;
		}


		public String getState() {
			return state;
		}


		public void setState(String state) {
			this.state = state;
		}


		public String getTitle() {
			return title;
		}


		public void setTitle(String title) {
			this.title = title;
		}


		public String getText() {
			return text;
		}


		public void setText(String text) {
			this.text = text;
		}


		public String getPosition() {
			return position;
		}


		public void setPosition(String position) {
			this.position = position;
		}
		  


		}


