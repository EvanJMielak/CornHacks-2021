package backend;

import enums.ClassType;

public class Timeslot {
	
	ClassType classtype;
	int hour;
	int day;
	int minute;
	
	protected ClassType getClasstype() {
		return classtype;
	}
	protected void setClasstype(ClassType classtype) {
		this.classtype = classtype;
	}
	protected int getHour() {
		return hour;
	}
	protected void setHour(int hour) {
		this.hour = hour;
	}
	protected int getDay() {
		return day;
	}
	protected void setDay(int day) {
		this.day = day;
	}
	protected int getMinute() {
		return minute;
	}
	protected void setMinute(int minute) {
		this.minute = minute;
	}

}
