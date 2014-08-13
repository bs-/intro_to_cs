/*
 * File: Target.java
 * Name: 
 * Section Leader: 
 * -----------------
 * This file is the starter file for the Target problem.
 */

import acm.graphics.*;
import acm.program.*;
import java.awt.*;

public class Target extends GraphicsProgram {
	public void run() {
		double xMidpoint = getWidth() / 2;
		double yMidpoint = getHeight() / 2;
		int radius = 72;

		for (int i = 0; i < 3; i++) {
			GOval oval = new GOval(xMidpoint - radius/2, yMidpoint - radius/2,
					radius, radius);
			oval.setFilled(true);
			if (i % 2 == 0) {
				oval.setFillColor(Color.RED);
			} else {
				oval.setFillColor(Color.WHITE);
			}
			add(oval);
			radius -= 25.2;
		}
	}
}
