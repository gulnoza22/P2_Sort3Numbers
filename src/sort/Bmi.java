package sort;

import java.util.Scanner;

public class Bmi {

	public static void main(String[] args) {



	  Scanner keyboard = new Scanner(System.in);

		double weight = 64.0;
		double height = 1.74;
		double bmi = weight / (height * height);
		System.out.println("Your BMI is: " + bmi);
		if (bmi < 18.5) {
			System.out.print("Underweight");
		} else if (bmi >= 18.5 && bmi < 25) {
			System.out.print("Normal");
		} else if (bmi >= 25 && bmi < 30) {
			System.out.print("Overweight");
		} else if (bmi >= 30) {
			System.out.print("Obese");
		}

	}

}
