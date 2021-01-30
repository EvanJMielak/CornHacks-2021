package backend;

import enums.ClassType;

public class Minute {
	ClassType classType;

	public Minute() {
		this.classType = ClassType.AVAILABLETIME;
	}

	public ClassType getClassType() {
		return classType;
	}

	public void setClassType(ClassType classType) {
		this.classType = classType;
	}

}
