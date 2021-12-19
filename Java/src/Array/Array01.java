package Array;

public class Array01 {

	public static void main(String[] args) {
		int[][] arr = new int[2][3];
		int k = 10;
		for (int i = 0; i < arr.length; i++) {//length=배열의 길이(배열이 저장할수 있는 공간의 개수)
		    for (int j = 0; j < arr[i].length; j++) {
		        arr[i][j] = k; // 인덱스를 이용한 초기화
		        k += 10;
		   }
		} 
		for (int i = 0; i < arr.length; i++) {
		    for (int j = 0; j < arr[i].length; j++) {
		        System.out.print(arr[i][j] + " ");
		    }
		    System.out.println();
		}
	}
}
