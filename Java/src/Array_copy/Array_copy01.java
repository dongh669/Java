package Array_copy;

public class Array_copy01 {

	public static void main(String[] args) {
	//1차원 배열의 복사
		int[] intArr1 = {1,2,3,4,5};
		System.out.println(intArr1.length);
		for(int i=0;i<intArr1.length;i++) {
			System.out.print(intArr1[i]+" ");
		}
		System.out.println("intArr1의 요소");
		
		
		System.out.println("=========================================");
		
		//intArr1배열에 6을추가하려면
		//새로운 배열을 만들어서 기존의 각 요소들의 값은 새로운 배열로 복사하면됨
		
		int[] intArr2 = new int[6];//새로운배열 생성
		System.out.println(intArr2.length);
		//int 타입의 배열 [0][0][0][0][0][0]
		//해당타입의 기본값으로 초기화
		for(int i=0;i<intArr2.length;i++) {
			System.out.print(intArr2[i]+" ");
		}
		System.out.println("intArr2의 요소");

		//intArr1 기존배열  [1][2][3][4][5]
		
		//먼저 intArr1배열의 내용을 복사한 후에
		for(int i=0;i<intArr1.length;i++) {//intArr2 새로운 배열 [1][2][3][4][5][0] 
			intArr2[i]=intArr1[i];
		}
		
		for(int i=0;i<intArr2.length;i++) {
			System.out.print(intArr2[i]+"  ");
		}
		System.out.println("intArr1을 intArr2에 복사한 결과");
		System.out.println();
		System.out.println("==============================================");
		//intArr2의 마지막에 해당값을 저장
		intArr2[intArr2.length-1]=6; //-1을하는이유는 인덱스값은 0부터시작하기때문에
		intArr2[5]=6; 				
		
		for(int i:intArr2) {
			System.out.print(i+"  ");
		}
		System.out.println();
		
		//배열내의 특정 인덱스번호에 새로운 값을 저장
		intArr2[3]=10;
		for(int i:intArr2) {
		System.out.print(i+"  ");}
		System.out.println();
		for(int s:intArr1) {
		System.out.print(s+"  ");}
		System.out.println();
		System.out.println("==============================================");
		int[] intArr3 = new int[7];
		System.out.println(intArr3.length);//intArr3의 길이
		
		for(int i=0;i<intArr2.length;i++) { //intArr3에 intArr2를 복사
			intArr3[i]=intArr2[i];
		}
		for(int i=0;i<intArr3.length;i++) {
			System.out.print(intArr3[i]+"  ");
		}
		System.out.println();
		//intArr3 마지막에 해당값 저장
		intArr3[intArr3.length-1]=7;
	    
		for(int i=0;i<intArr3.length;i++) {
			System.out.print(intArr3[i]+"  ");
		}
		System.out.println();
		System.out.println("==========================================");
		int[] intArr4 = new int[8];
		System.out.println(intArr4.length);//intArr4의 길이

		for(int i=0;i<intArr4.length;i++) {
			System.out.print(intArr4[i]+"  ");
		}
		System.out.println();
		for(int i=0;i<intArr3.length;i++) { //intArr4에 intArr3을 복사
			intArr4[i]=intArr3[i];
		}
		
		for(int i=0;i<intArr4.length;i++) {
			System.out.print(intArr4[i]+" ");
		}
		System.out.println();
		//intArr4 마지막에 해당값 저장
		intArr4[intArr4.length-1]=8;
		
		for(int i=0;i<intArr4.length;i++) {
			System.out.print(intArr4[i]+" ");
		}
	}

}
