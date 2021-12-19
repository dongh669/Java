package Array;

public class Array6 {
	public static void main(String[] args) {
	double[] scores= {72.5, 32.4, 48.5, 99.8, 55.4};
	
	//향상된 for문을 이용하여
	//합과 평균 출력
	
	double total=0;
	double avg;
	for(double i:scores) {
		total+=i;
	}
	System.out.printf("총합:%.2f\n",total);
	
	avg = total/scores.length;
	System.out.printf("평균값:%.2f",avg);
	}
}