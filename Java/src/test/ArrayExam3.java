package test;

public class ArrayExam3 {

	public static void main(String[] args) {
		//2차원 배열 - 성적표 작성
		String title = "성적표";
		String[] head = {"이름","국어","영어","수학","총점","평균"};
		System.out.println("\t\t"+title);
		for(String h:head) {
			System.out.print(h+"\t");
		}
		System.out.println("\n==============================================");
		String[] name = {"홍길동","일지매","임꺽정","이순신"};
		int sum = 0;
		int[] tot = new int[4];	//각 행의 각 열의 값 누적해서 저장하기 위한 변수
		
		
		int[][] score = {{90, 80, 70 }, {76, 86, 89}, {90, 78, 70}, {80, 90, 30}};
		//
		for(int i =0; i<score.length;i++) {
			System.out.print(name[i]+"\t");
			for(int j=0;j<score[i].length;j++) {
				System.out.print(score[i][j] + "\t");
				sum+=score[i][j];
				tot[j]+=score[i][j]; //
				
			}
			System.out.println(sum+"\t"+sum/score[i].length);
			tot[tot.length-1]+=sum;
			sum=0;
		}
		System.out.println("====================================================");
		
		//각 과목별 합계 구하기
		System.out.print("합 계\t");
		for(int i=0;i<tot.length;i++) {
			System.out.print(tot[i]+"\t");
			sum+=tot[i];
		}
		System.out.println("\n====================================================");
	}

}
