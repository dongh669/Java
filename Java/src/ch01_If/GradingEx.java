package ch01_If;

import java.util.Scanner;

public class GradingEx {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("점수를 입력하세요(0~100)");
		int score = scanner.nextInt();
		String grade="A";
		//점수 >=90 // 점수<95 A-  // 95== A0 // 점수<95 A+
		if(score>=90) {
			grade="A";//90이상
		if(score>95)grade="A+"; // 96이상
		else if(score==95)grade="A0"; //95는 "A0"
		else grade="A-"; //90~94
		}
		if(score>=80) {
			grade="B";
		if(score>85)grade="B+";
		else if(score==85)grade="B0";
		else grade="B-"; 
		}
		if(score>=70) {
			grade="C";
		if(score>75)grade="C+";
		else if(score==85)grade="C0";
		else grade="C-"; 
		}
		if(score>=60) {
			grade="D";
		if(score>65)grade="D+";
		else if(score==65)grade="D0";
		else grade="D-"; 
		}
		else grade="F";
		
		System.out.println("점수는 :"+score+"학점은 :"+grade);
	}
}