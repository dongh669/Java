package test;

import java.util.Scanner;

public class ArrayExam {

	public static void main(String[] args) {
		//성적표 프로그램
		//스캐너로 값을 입력받기 int[] score = {76,45,34,89,100,50,90,92}
		//int[] scores=new int[8]
		//입력이 끝나면 합계, 평균, 성적순 출력하기
		//for문과 향상된 for문으로 출력하기
		//1.성적입력 | 2.통계(합/평균)출력 | 3.성적순 출력하기 | 4.종료
		//ch04 - 7번 참조.
		
		//키보드로 부터 정수를 입력받기 위한 scaaner객체 생성
		Scanner scanner = new Scanner(System.in);
		int[] scores=new int[8];
		boolean run = true;
		while(run) {
			System.out.println("-------------------------------------------");
			System.out.println("1.성적입력|2.통계(합/평균)출력|3.성적순 출력하기|4.종료");
			System.out.println("-------------------------------------------");
			System.out.println("입력>");
			
			int menu=scanner.nextInt();
			
			switch(menu){
			case 1: System.out.println("성적입력>");
					for(int i=0;i<scores.length;i++) {
						scores[i]=scanner.nextInt();
					}
					break;
			case 2: System.out.println("통계출력>");
					int sum=0;
					for(int i=0;i<scores.length;i++) {
						sum+=scores[i];
					}
					System.out.println("합계="+sum);
					System.out.println("평균값="+(sum/(double)scores.length));
					//double avg=sum/(double)scores.length;
					//System.out.println("평균값="+avg);
					
			break;
			case 3: System.out.println("성적순 출력>");
					for(int i=0;i<scores.length;i++) {
						for(int j=i+1;j<scores.length;j++) { 
							if(scores[i]>scores[j]) { //오름차순은 큰값이 뒤로 가야하는데 큰값이 앞에 있으면 뒤로 이동시킴
							int temp=scores[i]; //temp에 i값을 임시로 저장
							scores[i]=scores[j];//뒤의 값을 앞으로 이동
							scores[j]=temp;		//앞의 값을 뒤로 이동
							}
						}//안쪽 for문
					}//바깥쪽 for문
					for(int i=0;i<scores.length;i++) { //오름차순
						System.out.println(scores[i]);
					}
					for(int i=(scores.length-1);i>=0;i--) { //내림차순
						System.out.println(scores[i]);
					}
			break;
			case 4: run = !run;
			}
			}//while끝
		System.out.println("종료");
	}

}
