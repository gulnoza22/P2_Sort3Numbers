package sort;
import java.util.Scanner;

public class NumbersVirginia {

	public static void main(String[] args) {

		Scanner keyboard = new Scanner(System.in);

		int n1, n2, n3, n4, temp;

		System.out.println("Enter first number: ");
		n1 = keyboard.nextInt();
		System.out.println("Enter second number: ");
		n2 = keyboard.nextInt();
		System.out.println("Enter third number: ");
		n3 = keyboard.nextInt();
		System.out.println("Enter fourth number: ");
		n4 = keyboard.nextInt();

		if (n1 > n2) {
			temp = n2;
			n2 = n1;
			n1 = temp;
		}
		if (n1 > n3) {
			temp = n3;
			n3 = n1;
			n1 = temp;
		}
		if (n1 > n4) {
			temp = n4;
			n4 = n1;
			n1 = temp;
		}
		if (n2 > n3) {
			temp = n3;
			n3 = n2;
			n2 = temp;
		}
		if (n2 > n4) {
			temp = n4;
			n4 = n2;
			n2 = temp;
		}
		if (n3 > n4) {
			temp = n4;
			n4 = n3;
			n3 = temp;
		}
		System.out.println("Outpu: "+n1 + "--" + n2 + "--" + n3 + "--" + n4);
	}
}