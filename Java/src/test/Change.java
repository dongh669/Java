package test;

public class Change {

	public static void main(String[] args) {
		/* 객이 물건을 사고 준 돈을 계산하니 거스름돈이 498,000원이었다.
		 *  이것을 50,000원, 10,000원, 5,000원, 1,000원권
		 * 지폐로 내 줄때 몇 장씩 주어야 하는지를 출력하는 프로그램을 작성하시오.*/
		int money= 498000;
		
		int a = money / 50000;
		int b = money % 50000 / 10000;
		int c = money % 50000 % 10000 / 5000; 
		int d = money % 50000 % 10000 % 5000 / 1000;
		
		System.out.println("5만원"+a+"장\n"+"1만원"+b+"장\n"+"5천원"+c+"장\n"+"1천원"+d+"장\n");
	}
}
