package sort;

import java.util.Scanner;

public class Ifelse {

	public static void main(String[] args) {

		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Enter your age");
		int age = keyboard.nextInt();

		if (age > 18) {
			System.out.println("hello world");

		} else if (age <= 18 && age >= 12) {
			System.out.println("tean");

		} else if (age <= 12 && age > 6) {

			System.out.println("child");

		} else

			System.out.println("not at school age");

	}

}
