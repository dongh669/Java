package Array;

public class Array3 {
public static void main(String[] args) {
	byte[] arrB = new byte[5];
	for(int i=0;i<arrB.length;i++) {
		System.out.print(arrB[i]+"\t");
	}
	System.out.println();
	char[] charA = new char[5];
	for(int i=0;i<charA.length;i++) {
		System.out.print(charA[i]+"\t");
	}
	System.out.println();
	short[] shortA = new short[5];
	for(int i=0;i<shortA.length;i++) {
		System.out.print(shortA[i]+"\t");
	}
	System.out.println();
	int[] intA = new int[5];
	for(int i=0;i<intA.length;i++) {
		System.out.print(intA[i]+"\t");
	}
	System.out.println();
	long[] longA = new long[5];
	for(int i=0;i<longA.length;i++) {
		System.out.print(longA[i]+"\t");
	}
	System.out.println();
	float[] floatA = new float[5];
	for(int i=0;i<floatA.length;i++) {
		System.out.print(floatA[i]+"\t");
	}
	System.out.println();
	double[] doubleA = new double[5];
	for(int i=0;i<doubleA.length;i++) {
		System.out.print(doubleA[i]+"\t");
	}
	System.out.println();
	//참조타입은 배열 생성시 각 요소의 값이 null로 되어있음
	//각욧에 해당하는 객체를 참조하지 않고 있는 것
	//각 요소에 접근시 nullPointerExecption발생
	//null이 아닌 다른 값으로 초기화를 해주어야함
	String[] StringA = new String[5];
	StringA[0]="a";
	StringA[1]="b";
	StringA[2]="c";
	StringA[3]="d";
	StringA[4]="e";
	for(int i=0;i<StringA.length;i++) {
		System.out.print(StringA[i]+"\t");
	}
	System.out.println();
}
}