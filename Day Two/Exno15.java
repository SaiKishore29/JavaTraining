package day2;

public class Exno15 {

	public static void main(String[] args) {
		House house=new House();
		house.calculateCost(50,70);

	}

}
class House{
	Door door=new Door();
	Window window=new Window();
	void calculateCost(int areaOfDoor,int areaOfWindow) {
		System.out.println("Cost of Constructing Door: "+door.costOfDoor(areaOfDoor));
		System.out.println("Cost of Constructing Window: "+window.costOfWindow(areaOfWindow));
		
	}
}
class Door{
	int costOfDoor(int areaOfDoor) {
		int costOfperSquare=150;
		return costOfperSquare*areaOfDoor;
	}
	
}
class Window{
	int costOfWindow(int areaOfWindow) {
		int costOfperSquare=100;
		return costOfperSquare*areaOfWindow;
	}
	
}