package day4;

import java.util.Scanner;

public class _03_If {

	public static void main(String[] args) {
		/*
		 * if(조건식){
		 * 		조건식이 참이라면 실행할 코드
		 * }
		 * 		
		 * */
		
		int a = 5;
		if(a > 1) {
			System.out.println("조건이 참입니다.");
		}
		
		/*
		 * 정수를 입력받아서 음의 정수라면 양의 정수로 바꿔서 출력하는 프로그램
		 * */
		
		Scanner Input = new Scanner(System.in);
		System.out.print("정수를 입력해주세요 : ");
		int num;
		num = Input.nextInt();
		Input.close();
		
		if(num < 0) {
//			num = num *-1;
			num *= -1;
			System.out.println("음의 정수를 양의 정수로 변환했습니다");
		}
		System.out.println("결과는" + num + "입니다.");
	}

}
