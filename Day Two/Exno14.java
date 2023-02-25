package day2;

public class Exno14 {

	public static void main(String[] args) {
		result res=new result();
		int result=res.calculate();
		System.out.println("Total marks="+result);

	}

}
class Student{
	String name="sai";
	String rollNo="19UECS1137";
	
}
class Exam extends Student{
	int m1=92;
	int m2=73;
	int m3=86;
	
}
class result extends Exam{
	int totalmarks;
	int calculate() {
		System.out.println("Result for the Student "+name);
		System.out.println("RollNumber="+rollNo);
		System.out.println("Marks\n"+m1+"\n"+m2+"\n"+m3);
		totalmarks=m1+m2+m3;
		return totalmarks;
	}
}