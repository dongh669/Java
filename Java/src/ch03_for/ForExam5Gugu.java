package ch03_for;

import java.util.Scanner;

public class ForExam5Gugu {

	public static void main(String[] args) {
		for(int i=2;i<=9;i++) {
			System.out.println(i+"단");
			for(int j=i;j<=9;j++) {
				System.out.println(i+"*"+j+"="+i*j);
			}
		}
	}

}
