package Array_copy;

public class Array_copy3 {

	public static void main(String[] args) {
	//배열의 얕은 복사와 깊은 복사
	//1.얕은복사 - 배열객체 한개만 생성
		int[] intArr1= {1,2,3,4,5};
		int[]intArr2=intArr1;//참조하는 변수의 주소값을 넘겨서 생성
		for(int i=0;i<intArr1.length;i++) {
			System.out.print(intArr1[i]+" ");
		}
		System.out.println();
		for(int i=0;i<intArr2.length;i++) {
			System.out.print(intArr2[i]+" ");
		}
		System.out.println();
		System.out.println(intArr1.hashCode()); //hashCode() 주소값
		System.out.println(intArr2.hashCode());
		System.out.println("--------------------");
		
		
		//2.깊은 복사- 배열객체 2개 생성
		int[] intArr3 = {1,2,3,4,5};
		int[] intArr4 = new int[5];//새로운 배열 객체 생성
		
		for(int i=0;i<intArr3.length;i++) {
				intArr4[i]=intArr3[i];
		}
		
		for(int i=0;i<intArr3.length;i++) {
			System.out.print(intArr3[i]+" ");
		}
		System.out.println();
		for(int i=0;i<intArr4.length;i++) {
			System.out.print(intArr4[i]+" ");
		}
		System.out.println();
		System.out.println(intArr3.hashCode());
		System.out.println(intArr4.hashCode());
		
		int[] intArr5 = {1,2,3,4,5};
		int[] intArr6 = new int[5];
			
		for(int i=0;i<intArr5.length;i++) {
			intArr6[i]=intArr5[i];
		}
		
		for(int i=0;i<intArr5.length;i++) {
			System.out.print(intArr5[i]+" ");
		}
		System.out.println();
		for(int i=0;i<intArr6.length;i++) {
			System.out.print(intArr6[i]+" ");
		}
		System.out.println();
		
		intArr5[3]=10;
		
		for(int i=0;i<intArr5.length;i++) {
			System.out.print(intArr5[i]+" ");
		}
		System.out.println();
		
		
}
}