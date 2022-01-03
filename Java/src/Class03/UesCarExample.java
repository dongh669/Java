package Class03;

public class UesCarExample {
	public static void main(String[] args) {
		//Car타입 변수 = new Car();
		Car car = new Car();
		System.out.println(car.model);
		car.run();
		//Truck객체 생성
		Truck truck = new Truck();
		System.out.println(truck.model);
		truck.run();
		//Bus객체 생성
		Bus bus = new Bus();
		System.out.println(bus.model);
		bus.run();
		
	}

}
