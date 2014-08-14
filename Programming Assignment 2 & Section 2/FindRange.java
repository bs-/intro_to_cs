/*
 * File: FindRange.java
 * Name: 
 * Section Leader: 
 * --------------------
 * This file is the starter file for the FindRange problem.
 */

import acm.program.*;

public class FindRange extends ConsoleProgram {

	private static final int SENTINEL = 0;

	public void run() {
		println("This program finds the largest and smallest numbers.");
		int x = readInt("? ");

		if (x != SENTINEL) {
			int max = x;
			int min = x;
			
			while (true) {
				x = readInt("? ");
				if (x == SENTINEL) {
					break;
				}
				if (x > max) {
					max = x;
				}
				if (x < min) {
					min = x;
				}
			}
			println("smallest: " + min);
			println("largest:  " + max);
		} else {
			println("No numbers entered.");
		}
	}
}
