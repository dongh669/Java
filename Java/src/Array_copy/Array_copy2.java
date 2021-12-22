package Array_copy;

public class Array_copy2 {

	public static void main(String[] args) {
		//배열의 얕은 복사
		//1차원 배열의 복사
		int[] intArr1 = {1,2,3,4,5};
		//새로운 참조변수 선언 intArr1의 배열의 내용을 복사
		//방법: intArr이 참조하는 주소값을 전달하여 복사
		
		//새로운 배열객체를 생성하는것이 아닌 
		//같은 배열을 참조
		int[] intArr2=intArr1;//intArr2에는 intArr1의 주소값이 전달됨.
		
		for(int i=0;i<intArr1.length;i++) {
			System.out.print(intArr1[i]+" ");
		}
		System.out.println();
		
		for(int i=0;i<intArr2.length;i++) {
			System.out.print(intArr2[i]+" "); 
		}
		System.out.println();
		System.out.println("======================================");
		//intArr2의 index번호 3에 해당하는 위치의 값 변경
		intArr2[3]=10;
		
		for(int i=0;i<intArr2.length;i++) {
			System.out.print(intArr2[i]+" ");
		}
		System.out.println();
		
		for(int i=0;i<intArr1.length;i++) {
			System.out.print(intArr1[i]+" ");
		}
		System.out.println();
	}
}
