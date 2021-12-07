package 별찍기;

public class test01 {

	public static void main(String[] args) {
		for(int i=0;i<10;i++){
			System.out.println("!");   //층수
			for(int j=10;j>i;j--){
				System.out.print("#"); //공백
			}
			for(int k=0;k<i*2+1;k++){  //별
				System.out.print("*");
			}				
		} 

	}

}
