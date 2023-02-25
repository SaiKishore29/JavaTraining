package day3;

public class Exno2 {
	public static void main(String[] args) {
		square s=new square(5);
		Cube c=new Cube(10);
		s.area();
		c.volume();
	}

}
interface CalcArea{
	void area();
	
}
interface CalcVolume{
	void volume();
	
}
class square implements CalcArea{
	int n,a;
	square(int n){
		this.n=n;
	}
	@Override
	public void area() {
		// TODO Auto-generated method stub
		a=n*n;
		System.out.println("Area of the square="+a);
		
	}
}
class Cube implements CalcVolume{
	int n,a;
	Cube(int n){
		this.n=n;
	}
	@Override
	public void volume() {
		// TODO Auto-generated method stub
		a=n*n*n;
		System.out.println("Volume of Cube="+a);
		
	}
}
