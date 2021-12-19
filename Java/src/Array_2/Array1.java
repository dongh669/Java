package Array_2;

public class Array1 {
	/*
	 * 2행 3열의 2차원 배열 생성 
	 * 1,2,4,5,6
	 * 1,2,
	 * 4,5,6
	 */
	public static void main(String[] args) {
		//초기값으로 2차원 배열 생성, 1차원 배열 두개로 2차원 배열 하나 생성
		int[][] scores = new int[][] {{1,2},{4,5,6}};
		
		//2차원에서 lenght의 값은 1차원 배열의 갯수 의미
		System.out.println("1차원배열의 갯수:"+scores.length);
		
		System.out.println("각 1차원배열의 요소의수:"+scores[0].length);
		System.out.println("각 1차원배열의 요소의수:"+scores[1].length);
		
		//출력
		for(int i=0;i<scores.length;i++) { //i는 scores.length로 1차원배열의 갯수
			for(int j=0;j<scores[i].length;j++) {//j는 각 행의 1차원배열의 요소수
				System.out.print(scores[i][j]+" ");
			}
			System.out.println();
		}		
		}
	}
