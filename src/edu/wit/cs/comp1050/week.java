/**
 * 
 */
package edu.wit.cs.comp1050;

import java.util.Scanner;

/**
 * 
 */
public class week {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello");
		System.out.print("What's your favorite day of the week: ");
		Scanner scan = new Scanner(System.in);
		String dayOftheWeek="";
		dayOftheWeek += scan.nextLine();

		System.out.println(dayOftheWeek + " is a great choice!");
	}

}
