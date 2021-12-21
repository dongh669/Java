package test;

import java.util.Scanner;

public class ArrExam {

	public static void main(String[] args) {
		boolean run = true;
		
		int balance =0;
		Scanner scanner = new Scanner(System.in);
		
		while(run){
			System.out.println("-------------------------------");
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
			System.out.println("------------------------------");
			System.out.println("선택>");
			
			int menu = scanner.nextInt();
			if(menu==1) {
				System.out.println("예금>");
				balance = balance+ scanner.nextInt();
			}else if(menu==2) {
				System.out.println("출금>");
				balance = balance- scanner.nextInt();
			}else if(menu==3) {
				System.out.println("잔고>"+balance);
			}else if(menu==4) {
				run = !run;
			}else {
				System.out.println("메뉴 번호를 입력하세요");
			}
		}
			System.out.println("프로그램 종료");
	}

}
