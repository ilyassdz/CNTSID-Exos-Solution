package charik;

import java.util.Scanner;

public class CalculateLipYear {

	public static void p(Object o) {
		System.out.print(o);
		
	}
	public static void main(String[] args) {


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
			if (year % 100 == 0) {
				if (year % 400 == 0) {
					System.out.println(" is a leap year");
				} else {
					System.out.println(" is NOT a leap year");
				}
			} else {
				System.out.println(" is a leap year");
			}
		} else {
			System.out.println(" is NOT a leap year");
		}

	}}

}
