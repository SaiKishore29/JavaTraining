package Day1;
import java.util.Scanner;
public class Exno21 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		String month;
		System.out.println("Type first three letters of a Month(like jan): ");
		month=scan.next();
		switch(month) {
		case "jan": System.out.println("31 Days");
		break;
		case "feb": System.out.println("Enter the Year: ");
					int year=scan.nextInt();
					scan.close();
					if((year%4==0)&&(year%100!=0)||(year%400==0))
						System.out.println("29 days");
					else
						System.out.println("28 Days");
			break;
		case "mar": System.out.println("31 Days");
		break;
		case "apr": System.out.println("30 days");
		break;
		case "may": System.out.println("31 Days");
		break;
		case "jun": System.out.println("30 days");
		break;
		case "jul": System.out.println("31 Days");
		break;
		case "aug": System.out.println("31 Days");
		break;
		case "sep": System.out.println("30 days");
		break;
		case "oct": System.out.println("31 Days");
		break;
		case "nov": System.out.println("30 days");
		break;
		case "dec": System.out.println("31 Days");
		break;
		}
		

	}

}
