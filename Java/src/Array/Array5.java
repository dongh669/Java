package Array;

public class Array5 {
	public static void main(String[] args) {
	int[]n = {12,20,67,567,21};
	System.out.println("배열의갯수:"+n.length);
	
	for(int i=0;i<n.length;i++) {
		System.out.println(n[i]);
	}
	//향상된 for문 
	for(int k:n) {
	System.out.println(k);
	}
	
	int[] score= {78,98,54,76,87};
	System.out.println("배열의 갯수:"+score.length);
	
	//총점
	int total=0;
	for(int i=0;i<score.length;i++) {
		total=total+score[i];
	}
	System.out.println("총점:"+total);
	//평균
	double avg = total/(double)score.length;
	System.out.println("평균:"+avg);
	
	System.out.println("==================================");
	total=0;
	//향상된 for문
	for(int j:score) {
		total+=j;
	}
	System.out.println(total);
	//평균
	avg = total/(double)score.length;
	System.out.println("평균:"+avg);
}
}