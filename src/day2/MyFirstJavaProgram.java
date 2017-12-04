package day2;

import java.awt.Color;
import org.jointheleague.graphical.robot.Robot;

public class MyFirstJavaProgram {

	public static void main(String[] args) {

		// START HERE

		Robot Pancho = new Robot();
		Pancho.penDown();
		Pancho.setSpeed(100);

		int x = 5;
		while (x < 10) {
			System.out.print("x");
			Pancho.move(150);
			Pancho.turn(90);
			x = x + 1;
		}

	}
}
