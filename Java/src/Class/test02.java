package Class;

/*참조 변수 선언시 선언만하고 객체 생성을 하지 않으면
  NullPointerException예외가 발생*/
public class test02 {

	public static void main(String[] args) {
	int[] intArray = null; //객체 참조 변수 선언만 하고 실제 객체는 생성하지않음
	intArray = new int[10]; // 배열 객체 생성
	intArray[0] = 10; //프로그램 실행중 예외 발생 - runtime Exception
	
	String str=null; //객체 참조 변수 선언만 하고 실제 객체는 생성하지 않음.
	 str="hello"; // "hello"문자열 객체 생성
	System.out.println("총 문자수:"+str.length());
	}
}
