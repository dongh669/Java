package test;

public class work1 {

	public static void main(String[] args) {
		
		final double ST1 = 1.10;
		final double ST2 = 128;
		final double ST3 = 100;
		
		int height = 175;
		int weight = 75;
		
		//�����淮 ���
		double result = ST1 * weight - ST2 * ((weight*weight) / (double)(height*height)); 
		System.out.println(result);
		
		//ü���淮 ���
		double result2 = weight - result;
		System.out.println(result2);
		
		//ü����� ���
		double result3 = result2 * (ST3 / weight);
		System.out.println(result3);
		
		
	}

}
