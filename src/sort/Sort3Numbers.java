/**
 * Sort 3 Numbers
 * 
 * This program prompts users to enter 3 numbers (integers) , sorts the numbers in non-descending order, and 
 * displays the numbers in sorted order.
 * 
 *  For example:  
  	Enter an Integer:10
	Enter an Integer:5
	Enter an Integer:20
	Output:5,10,20
 
 *  Testing program checks all your output.  
 *  Your prompts and output format must be same as the example above.
 * 
 * @author anwar mamat
 * 
 */

package sort;
import java.util.Scanner;

public class Sort3Numbers {
	public static void main(String[] args) {

		Scanner keyboard = new Scanner(System.in);

		int n1, n2, n3, temp;

		System.out.print("Enter an integer:");
		n1 = keyboard.nextInt();
		System.out.print("Enter an integer:");
		n2 = keyboard.nextInt();
		System.out.print("Enter an integer:");
		n3 = keyboard.nextInt();

//		if (n1 <= n2 && n1 <= n3) {
//			small = n1;
//		} else if (n2 <= n1 && n2 <= n3) {
//			small = n2;
//		} else {
//			small = n3;
//		}
//
//		if ((n1 >= n2 && n1 <= n3) || (n1 >= n3 && n1 <= n2)) {
//			middle = n1;
//		} else if ((n2 >= n1 && n2 <= n3) || (n2 >= n3 && n2 <= n1)) {
//			middle = n2;
//		} else {
//			middle = n3;
//		}
//
//		if (n3 >= n2 && n3 >= n1) {
//			large = n3;
//		} else if (n2 >= n3 && n2 >= n1) {
//			large = n2;
//		} else {
//			large = n1;
//		}
		
		if (n1 > n2) { //4>3
			temp = n2; //temp=3 n2
			n2 = n1;   //n2=4
			n1 = temp; //n1=3 3>4
		}
		if (n1 > n3) { //3>5 false
			temp = n3; //temp=5;
			n3 = n1;   //n3=3;
			n1 = temp; //n1=5 5>3
		}
	
		if (n2 > n3) { //4>5
			temp = n3; //temp=5;
			n3 = n2;   //n3=4;
			n2 = temp; //n2=5 5>4
		}

		System.out.println("Output:" + n1 + "," + n2 + "," + n3);
	}
}
