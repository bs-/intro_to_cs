/* Section Handout #2
 * 1. The Fibonacci sequence
 * Displays the Fibonacci sequence
 */

import acm.program.*;

public class Fibonacci extends ConsoleProgram {

	private static final int MAX_TERM_VALUE = 10000;
	
	public void run() {
		println("This program lists the Fibonacci sequence.");

		int fib0 = 0;
		int fib1 = 1;

		while (fib0 < MAX_TERM_VALUE) {
			println(fib0);
			int sum = fib1;
			fib1 += fib0;
			fib0 = sum;
		}
	}
}
