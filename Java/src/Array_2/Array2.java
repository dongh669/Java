package Array_2;

public class Array2 {
	/*
	 * 2행 3열의 2차원 배열 생성 
	 * 1,2,3,4,5,6
	 * 1,2,3
	 * 4,5,6
	 */
	public static void main(String[] args) {
		int[][] scores = new int[2][3];
		scores[0][0]=1; scores[0][1]=2; scores[0][2]=3;
		scores[1][0]=4; scores[1][1]=5; scores[1][2]=6;
		
		//2차원에서 lenght의 값은 1차원 배열의 갯수 의미
		System.out.println("1차원배열의 갯수:"+scores.length);
		
		System.out.println(scores[0].length);// 1,2,3
		System.out.println(scores[1].length);// 4,5,6
		
		//출력
		for(int i=0;i<scores.length;i++) {//1차원 행의 갯수
			for(int j=0;j<scores[i].length;j++) {//각 행의 1차원 배열의 요소수
				System.out.print(scores[i][j]+" ");
			}
			System.out.println();
		}
		

		//향상된 for문을 이용하여 2차원 배열의 요소들을 모두 출력하세요.
		for(int[] s1:scores) {
			for(int s:s1) {
				System.out.print(s+" ");
			} 
		System.out.println();
		}
	}

}
