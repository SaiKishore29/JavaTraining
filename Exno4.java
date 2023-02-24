package day4;

public class Exno4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			throw new UserDefinedException();
		}
		catch(Exception e) {
			e.printStackTrace();
		}

	}

}
class UserDefinedException extends Exception{
	
	
}

	