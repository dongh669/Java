package Array_copy;

public class Array_copy5 {

	public static void main(String[] args) {
	//참조타입(String) 1차원 배열 선언
		String[] snake= {"구렁이","팔렁이","칠렁이","육렁이","오렁이"};
		
		for(int i=0;i<snake.length;i++) {
			System.out.print(snake[i]+" ");
		}
		System.out.println();
		
		for(int i=snake.length-1;i>=0;i--) {
			System.out.print(snake[i]+" ");
		}
		System.out.println();
		for(String a:snake) {
			System.out.print(a+" ");
		}
		System.out.println();
		}
}