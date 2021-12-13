package Class;

public class Class01 {

	public static void main(String[] args) {
		//리터럴 문자열 생성
		String strA = "홍길동";
		String strB = "홍길동";
		if(strA==strB) {
			System.out.println("같은 문자열을 참조한다.");
		}else {
			System.out.println("다른 문자열을 참조한다");
		}
		//new String() - 생성자로 문자열 생성
		String str1 = new String("홍길동");
		String str2 = new String("홍길동");
		if(str1==str2) {
			System.out.println("같은 문자열을 참조한다");
		}else {
			System.out.println("다른 문자열을 참조한다");
		}

	}

}
