package ch01_If;

import java.util.Scanner;

public class MultipleOfThreeExam {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("수를 입력하시오");
		int number = scanner.nextInt();
		if(number % 3==0) {
			System.out.println("3의 배수 입니다");
		}else {
			System.out.println("3의 배수가 아닙니다");
		}
		
		System.out.println(number % 3==0?"3의배수입니다":"3의 배수가 아닙니다");

	}

}
