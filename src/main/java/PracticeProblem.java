/**
		* File: Lesson 1.6 - Booleans
		* Author: Nithin.A
		* Date Created: February 13, 2023
		* Date Last Modified: February 20, 2026
		*/


import java.util.Scanner;
public class PracticeProblem {

	public static void main(String args[]) {
		q1();
		q2();
		q3();
		q4();
		q5();
		q6();
	}

	public static void q1() {
		//Write question 1 code here
		Scanner inputQ1 = new Scanner(System.in);
		System.out.print("Input a boolean: ");
		boolean bool = inputQ1.nextBoolean();
		System.out.println(bool);

	}

	public static void q2() {
		//Write question 2 code here
		Scanner inputQ2 = new Scanner(System.in);
		System.out.print("Input an integer: ");
		int num = inputQ2.nextInt();
		int five = 5;
		System.out.println(five < num);


	}

	public static void q3() {
		//Write question 3 code here
		Scanner inputQ3 = new Scanner(System.in);
		String pizza = "pizza";
		System.out.print("Input pizza: ");
		String word = inputQ3.nextLine();
		System.out.println(word.equals("pizza"));

	}

	public static void q4() {
		//Write question 4 code here
		Scanner inputQ4 = new Scanner(System.in);
		System.out.print("Input a number: ");
		double numQ4 = inputQ4.nextDouble();
		System.out.println(numQ4 == 0);


	}

	public static void q5() {
		//Write question 5 code here
		Scanner inputQ5 = new Scanner(System.in);
		System.out.print("Input an integer: ");
		int numQ5 = inputQ5.nextInt();
		System.out.println(numQ5 != 0);
	}

	public static void q6() {
		Scanner inputQ6 = new Scanner(System.in);
		System.out.print("Input a word earlier than google: ");
		String wordQ6 = inputQ6.nextLine();
		boolean boolQ6 = 0 > wordQ6.compareTo("google");
		System.out.println(boolQ6);

	}

}
