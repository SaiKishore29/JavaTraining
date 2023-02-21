package Day1;
import java.util.*;
public class Exno13 {
	public static void main(String args[]) {
		int student[][]=new int[5][5];
		int sum=0;
		Scanner scan=new Scanner(System.in);
		for(int i=0;i<5;i++) {
			System.out.println("Enter Marks of Student"+(i+1));
			for(int j=0;j<5;j++) {
				System.out.println("Enter Subject"+(j+1)+" mark:");
				student[i][j]=scan.nextInt();
			}
		}
		scan.close();
		for(int i=0;i<5;i++) {
			sum=0;
			for(int j=0;j<5;j++) {
				sum+=student[i][j];
			}
			System.out.println("Total Marks of Student"+(i+1)+": "+sum);
	}
	}

}
