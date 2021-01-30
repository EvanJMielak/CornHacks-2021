package backend;

import enums.ClassType;

public class Timeslot {
	
	ClassType classtype;
	int startHour;
	int startDay;
	int startMinute;
	int endHour;
	int endDay;
	int endMinute;
	
	protected ClassType getClasstype() {
		return classtype;
	}
	protected void setClasstype(ClassType classtype) {
		this.classtype = classtype;
	}
	protected int getStartHour() {
		return startHour;
	}
	protected void setStartHour(int startHour) {
		this.startHour = startHour;
	}
	protected int getStartDay() {
		return startDay;
	}
	protected void setStartDay(int startDay) {
		this.startDay = startDay;
	}
	protected int getStartMinute() {
		return startMinute;
	}
	protected void setStartMinute(int startMinute) {
		this.startMinute = startMinute;
	}
	protected int getEndHour() {
		return endHour;
	}
	protected void setEndHour(int endHour) {
		this.endHour = endHour;
	}
	protected int getEndDay() {
		return endDay;
	}
	protected void setEndDay(int endDay) {
		this.endDay = endDay;
	}
	protected int getEndMinute() {
		return endMinute;
	}
	protected void setEndMinute(int endMinute) {
		this.endMinute = endMinute;
	}
	
	protected void addTimeSlot() {
		
	}
	
	
	

}
