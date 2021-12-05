package ch02_switch;

import java.util.Random;
import java.util.Scanner;

public class SwitchExample3 {

	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("요일을 입력해주세요(ex:월요일)");
		int weekDay = (int)(Math.random()*7); // 0<= 7
		
		
		switch(weekDay) {
		case 1:
		case 2: 
		case 3: 
		case 4:  System.out.println("열심히 공부를 합니다");
		break;
		case 5: System.out.println("쇼핑을 합니다.");
		break;
		case 6: case 0: System.out.println("레저를 즐깁니다.");
		break;
		}
		scanner.close();
	}

}