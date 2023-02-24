package day4;
import java.io.*;
public class Exno6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BaseClass b=new DriverClass();

	}

}
class BaseClass{
	BaseClass(){
		int a=1/0;
	}
}
class DriverClass extends BaseClass{
	DriverClass(){
		try {
			BaseClass bc=new BaseClass();
		}
		catch(Exception e) {
			System.out.println(e);
		}
		
	}
	
}
