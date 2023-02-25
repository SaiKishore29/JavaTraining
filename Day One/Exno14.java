package Day1;
import java.util.Scanner;
public class Exno14 {
	/*
	 * @author Sai Kishore
	 * */

	public static void main(String[] args) {
		/**
		* This is the main method
		* which is very important for
		* execution for a java program.
		*/

		int x, y;
		Scanner scan = new Scanner(System.in);
		/**
		* Declared two variables x and y.
		* And taking input from the user
		* by using Scanner class.
		*
		*/

		x = scan.nextInt();
		y = scan.nextInt();
		scan.close();
		/**
		* Storing the result in variable sum
		* which is of the integer type.
		*/
		int sum = x + y;

		/**
		* Using standard output stream
		* for giving the output.
		* @return null
		*/
		System.out.println("Sum is: " + sum);

	}

}
