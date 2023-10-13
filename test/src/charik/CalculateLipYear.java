package charik;

import java.util.Scanner;

public class CalculateLipYear {

	public static void p(Object o) {
		System.out.print(o);
		
	}
	public static void test() {


		Scanner s = new Scanner(System.in);
		while(true) {
		p("entre a year \n");
		int year = s.nextInt();
		p(year) ;
		/*if(year%4 == 0 && year% 100==0 && year%400==0) {
			p( " is a leap year");
		}
		else p(" is NOT a leap year");
		
		*/
		
		if (year % 4 == 0) {
			// Check if the year is divisible by 4, which is the first condition for a leap year.
			
			if (year % 100 == 0) {
				// If it's divisible by 100, we further check if it's divisible by 400.
				// Most leap years are divisible by 4 and not by 100, but there is an exception for years divisible by 100.
				
				if (year % 400 == 0) {
					// If it's divisible by 400, it's a leap year.
					System.out.println(" is a leap year");
				} else {
					// If it's divisible by 100 but not by 400, it's not a leap year.
					System.out.println(" is NOT a leap year");
				}
			} else {
				// If it's divisible by 4 but not by 100, it's a leap year.
				System.out.println(" is a leap year");
			}
		} else {
			// If it's not divisible by 4, it's not a leap year.
			System.out.println(" is NOT a leap year");
		}
		
/*
 * Explanation:

The code uses nested if statements to check whether a given year is a leap year.

It starts by checking if the year is divisible by 4, which is the first condition for a year to be a leap year.

If the year is divisible by 4, it proceeds to check if the year is divisible by 100.

If it's divisible by 100, it goes on to check if the year is divisible by 400.

If the year is divisible by 400, it's considered a leap year, and the code prints " is a leap year."

If the year is divisible by 100 but not by 400, it's not a leap year, and the code prints " is NOT a leap year."

If the year is divisible by 4 but not by 100, it's a leap year, and the code prints " is a leap year."

If the year is not divisible by 4, it's not a leap year, and the code prints " is NOT a leap year."

This code correctly identifies leap years according to the rules for determining leap years in the Gregorian calendar.





 */
	}}

}
