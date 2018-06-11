package sort;

import java.util.Scanner;

public class Sort4Numbers {

	public static void main(String[] args) {

		Scanner keyboard = new Scanner(System.in);

		int n1, n2, n3, n4;
		int small = 0;
		int middle = 0;
		int large = 0;
		int largest = 0;

		System.out.println("Enter first number: ");
		n1 = keyboard.nextInt();
		System.out.println("Enter second number: ");
		n2 = keyboard.nextInt();
		System.out.println("Enter third number: ");
		n3 = keyboard.nextInt();
		System.out.println("Enter fourth number: ");
		n4 = keyboard.nextInt();

		// n1
		if (n1 > n2 && n1 > n3 && n1 > n4) {
			largest = n1;
		} else if (n1 < n2 && n1 > n3 && n1 > n4) {
			large = n1;largest=n2;
		} else if (n1 < n2 && n1 < n3 && n1 < n4) {
			middle = n1; 
		} else {
			small = n1;
		}

		// n2
		if (n2 > n1 && n2 > n3 && n2 >n4) {
			largest = n2;
		} else if (n2 < n1 && n2 > n3 && n2 > n4) {
			large = n2;
		} else if (n2 < n1 && n2 < n3 && n2 > n4) {
			middle = n2;
		} else {
			small = n2;
		}

		// n3
		if (n3 > n1 && n3 > n2 && n3 > n4) {
			largest = n3;
		} else if (n3 < n1 && n3 > n2 && n3 > n4) {
			large = n3;
		} else if (n3 < n1 && n3 < n2 && n3 > n4) {
			middle = n3;
		} else  {
			small = n3;
		}

		// n4
		if (n4 > n1 && n4 > n2 && n4 > n3) {
			largest = n4;
		} else if (n4 < n1 && n4 > n2 && n4 > n3) {
			large = n4;
		} else if (n4 < n1 && n4 < n2 && n4 > n3) {
			middle = n4;
		} else {
			small = n4;
		}
		System.out.println("Output: " + small + "," + middle + "," + large + "," + largest);
	}
}
