package introductiontooop;

public class MotorBike {
	// state
	private int speed; // member variable and can only be read in this file class
	// method = inputs - int speed; outputs - void(no return); name -
	// setSpeed:setter

	void setSpeed(int speed) { // int speed is a local variable
		this.speed = speed; // this. access the member variable
	}

	int getSpeed() {
		return this.speed;
	}

	void start() {
		System.out.println("Bike Started");
	}

}
