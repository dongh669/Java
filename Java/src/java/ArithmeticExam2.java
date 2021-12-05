package java;

import java.util.Scanner;

public class ArithmeticExam2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int input;
		System.out.println("정수를 입력하세요");
		
		input =scanner.nextInt();
		
		if(input %2==0) {
			System.out.println("짝수");
		}else {
			System.out.println("홀수");
		}
		
	}

}
