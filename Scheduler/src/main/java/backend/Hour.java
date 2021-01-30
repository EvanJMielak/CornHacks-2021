package backend;

import java.util.ArrayList;

public class Hour {
	ArrayList<Minute> minutes;

	public Hour() {
		minutes = new ArrayList<Minute>();
		for (int i = 0; i < 60 ; i++) {
			Minute minute = new Minute();
			minutes.add(minute);
		}
	}
	public ArrayList<Minute> getMinutes() {
		return minutes;
	}

	public void setMinutes(ArrayList<Minute> minutes) {
		this.minutes = minutes;
	}
	
	

}
