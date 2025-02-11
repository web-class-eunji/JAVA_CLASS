package day6;

public class _01_NestingFor {

	public static void main(String[] args) {
		/*
		 
		 ***
		 ***
		 ***
		 ***
		 ***
		  
		 * */
		
//		System.out.println("***");
//		System.out.println("***");
//		System.out.println("***");
//		System.out.println("***");
//		System.out.println("***");
		
		
		for(int i = 0; i < 5;i++) { // 행
			for(int j = 0; j < 3; j++) { // 행 안에 요소 반복
				System.out.print("*");
			}
			System.out.println();
		}
		
		// 0시 0분부터 23시 59분까지 출력해보기
		
		for(int k = 0; k <= 23;k++) {
			for(int l = 0; l <= 59;l++) {
				System.out.printf("%d시 %d분 \n",k,l);
			}
			System.out.println();
		}
		

	}

}
