package day2;

import org.jointheleague.graphical.robot.Robot;

public class Spiral {

	public static void main(String[] args) {
		// 1. Create a new Robot
		Robot Ryan = new Robot();
		// 5. Set your robot's pen to the down position
		Ryan.penDown();
		// 3. Set the robot to go at max speed (100)
		Ryan.setSpeed(100);
		// 4. Do the following (steps 6-8) 75 times
		int x = 0;
		while(x<75){
			System.out.print("x");
		
			
		
			// 7. Change the pen color to random
		Ryan.setRandomPenColor();
			// 6. Move the robot 5 times the current line number you are drawing (5*i)
			Ryan.move(5*x);
			// 2. Turn the robot 1/7 of 360 degrees to the right
		Ryan.turn(360/7);
			// 8. Set the pen width to i
Ryan.setPenWidth(x);
		x = x+1;
		}
	}
}
