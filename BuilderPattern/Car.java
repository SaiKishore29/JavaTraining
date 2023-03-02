package BuilderPattern;

import BuilderPattern.Car.BuildCar;
import BuilderPattern.Car.MechanicShed;

class Car{
	class MechanicShed{
		String tire, engine, model, brand;
		public MechanicShed(String brand,String model,String engine,String tire) {
			this.tire=tire;
			this.engine=engine;
			this.model=model;
			this.brand=brand;
		}
		@Override
		public String toString() {
			// TODO Auto-generated method stub
			return "MechanicShed[Brand="+brand+",Model="+model+",Engine="+engine+",Tire="+tire+"]";
		}
	}
	MechanicShed mechanicShed;
	public Car(BuildCar buildCar) {
		mechanicShed=new MechanicShed(buildCar.brand,buildCar.model,buildCar.engine,buildCar.tire);
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Car[mechanicShed="+mechanicShed+"]";
	}

	interface Build{
		Build setBrand(String brand);
		Build setModel(String Model);
		Build setEngine(String Engine);
		Build setTire(String tire);
	}
	
	static class BuildCar implements Build{
		String brand,model,engine,tire;
		public BuildCar setBrand(String brand) {
			this.brand=brand;
			return this;
		}
		public BuildCar setModel(String model) {
			this.model=model;
			return this;
		}
		public BuildCar setEngine(String engine) {
			this.engine=engine;
			return this;
		}
		
		public BuildCar setTire(String tire) {
			this.tire=tire;
			return this;
		}
		public Car build() {
			return new Car(this);
		}
	}
}
