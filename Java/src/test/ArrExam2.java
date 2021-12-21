package test;

import java.util.Scanner;

public class ArrExam2 {

	public static void main(String[] args) {
		//성적표 프로그램
		//스캐너로 값을 입력받기 int[] score = {76,45,34,89,100,50,90,92}
		//int[] scores=new int[8]
		//입력이 끝나면 합계, 평균, 성적순 출력하기
		//for문과 향상된 for문으로 출력하기
		//1.성적입력 | 2.통계(합/평균)출력 | 3.성적순 출력하기 | 4.종료
		//ch04 - 7번 참조.
		
		boolean run = true;
		
		int balance = 0;
		Scanner scanner = new Scanner(System.in);
		
		while(run) {
			System.out.println("---------------------------");
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
			System.out.println("----------------------------");
			System.out.print("선택>");
			int menu = scanner.nextInt();
			if(menu==1) {
				System.out.println("예금액>");
				balance+=scanner.nextInt();
			}else if(menu==2) {
				System.out.println("출금액>");
				balance-=scanner.nextInt();
			}else if(menu==3) {
				System.out.println("잔고>"+balance);
			}else if(menu==4) {
				run = !run;
			}else {
				System.out.println("메뉴 번호를 입력해주세요");
			}
		
		}
		System.out.println("프로그램 종료");

	}

}
