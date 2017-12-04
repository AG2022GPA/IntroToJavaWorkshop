package day2;

import org.jointheleague.graphical.robot.Robot;

public class RobotGraffiti {
	public static void main(String[] args) {
		// 1.  Create a new Robot
		Robot Ryan = new Robot();
		// 2. Make the Robot draw the first letter of your name
		Ryan.penDown();
		Ryan.setRandomPenColor();
		Ryan.setSpeed(100);
		
		Ryan.move(100);
		Ryan.turn(90);
		Ryan.move(50);
		Ryan.turn(90);
		Ryan.move(100);
		Ryan.turn(-180);
		Ryan.move(50);
		Ryan.turn(-90);
		Ryan.move(100);
	}

}
