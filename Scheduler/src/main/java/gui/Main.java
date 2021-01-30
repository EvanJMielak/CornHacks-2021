package gui;

import backend.WeekCalendar;

public class Main {
	

	public static void main(String[] args) {
		 WeekCalendar calendar = new WeekCalendar();
		 calendar.initiateListOfDays();
		 EventHandler question = new EventHandler();
		 question.createQuestion();
	}
	


}

