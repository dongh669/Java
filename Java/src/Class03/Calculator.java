package Class03;

//public 키워드는 외부에서 접근가능한 접근 제어자임.
public class Calculator {
	//model명은 외부에서 접근가능, 수정되면 안됨
	public final String model="00001";
	//result값은 getCalc에 의해서 처리된 값만 받음,외부에서 접근불가
	private double result=0;
	//같은 클래스내의 메소드들끼리는 상호 호출 가능
	public void getCalc(String op, int x, int y) {
			switch(op) {
			case "+": result=add(x,y);
					System.out.println(result); break;
			case "-": result=sub(x,y);
					System.out.println(result); break;
			case "x": result = mul(x,y);
					System.out.println(result); break;
			case "/": result= div(x,y);
					System.out.println(result); break;
			}
		}
		private int add(int x, int y) {return x+y;}
		private int sub(int x, int y) {return x-y;}
		private int mul(int x, int y) {return x*y;}
		private double div(int x, int y) {return x/(double)y;}
}
