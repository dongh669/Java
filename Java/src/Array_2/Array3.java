package Array_2;

public class Array3 {
	
	public static void main(String[] args){
		int[][] arr1 = new int[3][3];
		arr1[0][0]=1; arr1[0][1]=1; arr1[0][2]=1;
		arr1[1][0]=1; arr1[1][1]=1; 
		arr1[2][0]=1; arr1[2][1]=1; arr1[2][2]=1;
		
		for(int i=0;i<arr1.length;i++) {
			for(int j=0;j<arr1[i].length;j++) {
				System.out.println(arr1[i][j]);
			}
		}
		System.out.println("==================================");
		int[][] arr2 = {{1,2,3},{11,22},{21,32,33}};
		for(int i=0;i<arr2.length;i++) {
			for(int j=0;j<arr2[i].length;j++) {
				System.out.println(arr2[i][j]);
			}
		}
		
		//참조타입배열의 각 요소의 초기값
		String[] strArr= new String[3];
		for(int i=0;i<strArr.length;i++) {
			System.out.println(strArr[i]);
		}
	}
}