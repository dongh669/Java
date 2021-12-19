package Array;

public class Array2 {
public static void main(String[] args) {
	//배열 선언
	//타입[] 변수명=new [저장할요수갯수]
	int[] scores=new int[10];
	//동일타입의 값이 순서대로 연속해서 자장됨
	//배열의 index 시작은 0부터
	scores[0]=10;
	scores[1]=15;
	scores[2]=5;
	scores[3]=7;
	scores[4]=8;
	scores[5]=3;
	scores[6]=9;
	scores[7]=10;
	scores[8]=5;
	scores[9]=4; //배열의 마지막은 저장요소의 갯수 -1 번이 index번호
	
	System.out.println(scores.length); //배열의 길이(배열이 저장할수 있는 공간의 개수)
	//
	int sum=0;
	for(int i=0;i<scores.length;i++) {
		sum=sum+scores[i]; 
	}
	System.out.println(sum);
	
	double avg = sum/(double)scores.length;
	System.out.println(avg);
}
}