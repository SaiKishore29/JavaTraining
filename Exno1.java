package day4;
import java.io.*;
public class Exno1 {

	public static void main(String[] args)throws Exception{
		Exceptions exp=new Exceptions();
		exp.method();

	}

}
class Exceptions{
	public void method() throws Exception{
		throw new IOException();
		
	}
}
