package Class02;

public class Person {
	//속성
	Car car = new Car();//사용관계
	//기능
	void calc() {
		//Calculator의 add()메소드에 10과 20을 전달하여 신호전송
		int result = Calculator.add(99,20);
		System.out.println(result);
	}
}
