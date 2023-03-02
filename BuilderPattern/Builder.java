package BuilderPattern;

public class Builder {

	public static void main(String[] args) {
		Car myCar=new Car.BuildCar().setBrand("Hyundai").setModel("i10").setEngine("Petrol").setTire("MRF").build();
		System.out.println(myCar);
	}

}
