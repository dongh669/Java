package java;

import java.util.Scanner;

public class ArithmeticExam {

	public static void main(String[] args) {
		int time;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("시분초로 출력하기");
		time = scanner.nextInt();
		int second = time % 60;
		int minute = time/60 % 60;
		int hour = time/60/60;
				
		System.out.println(time + "초는");
		System.out.println(hour + "시간");
		System.out.println(minute + "분");
		System.out.println(second + "초 입니다");
		
	}

}
