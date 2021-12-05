package java;

public class CompareExample {

	public static void main(String[] args) {
		System.out.println(3<5);
		System.out.println(3>5);
		System.out.println(1<=0);
		System.out.println(10>=10);
		System.out.println(1==3);
		System.out.println(1!=3);
		
		System.out.println(!(3<5));
		System.out.println((3<5)^(1==1));
		System.out.println((3>5)||(1==1)); //모두 false인 경우에만 false
		System.out.println((3<5)&&(1==1)); //모두 true인 경우에만 true

	}

}
