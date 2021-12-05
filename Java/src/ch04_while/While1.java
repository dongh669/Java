package ch04_while;

public class While1 {

	public static void main(String[] args) {
		int i= 2, j=2;
		System.out.println("구구단");
		while(i<=9) {
			while(j<=9) {
						System.out.printf("%d * %d =%d \t",j,i,(i*j));
						j++;//증감처리
			} 
			j=2; // j값 재 초기화, while문은 초기화를 별로도 해야함
			i++;
			System.out.println();
		}	
	}

}
