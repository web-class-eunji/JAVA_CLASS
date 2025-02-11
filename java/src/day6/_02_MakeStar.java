package day6;

public class _02_MakeStar {

	public static void main(String[] args) {
		/*
		 
		 *
		 **
		 ***
		 ****
		 ***** 
		  
		 * */
		
//		for(int i = 1; i <= 5;i++) {
//			for(int j = 1; j <= i;j++ ) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
//		
		
		for(int i = 0; i < 7; i++) { // 행
			for(int j = 0; j < 7 - i; j++) { // *앞에 공백 ( 현재 층에 공백이 몇개 필요한가? )
				System.out.print(" ");
			}
			for(int k = 0; k < (i*2)+1; k++) {
				//(i*2)+1 : 해당 층에서 출력할 별의 개수를 결정
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
