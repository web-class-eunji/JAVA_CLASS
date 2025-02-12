package day7;

import java.util.Scanner;

public class _01_UpDownGame {

	public static void main(String[] args) {
		/*
		 * 1~50 의 난수를 생성할것
		 * 숫자를 입력하세요 ( 잔여횟수 : 5) : 
		 * 정답을 맞췄다면 종료됨 ( 반복문을 종료시키는 제어문 )
		 * 업 / 다운
		 * 5번의 기회를 모두 소진하면 실패!
		 * */
		
		int randomNum = (int)(Math.random()*50) +1;
		Scanner numInput = new Scanner(System.in);
		boolean match = false;
		
		for(int i = 5; i >= 1; i--) {
			System.out.print("숫자를 입력하세요 ( 잔여횟수 : "+ i +") : ");
			int userNumInput = numInput.nextInt();
			
			if(userNumInput == randomNum) {
				match = true;
				System.out.println("정답입니당");
				break;
			}else if(userNumInput > randomNum) {
				System.out.println("다운");
			}else if(userNumInput < randomNum) {
				System.out.println("업");
			}
		}
		
		if(!match) {
			System.out.println("기회를 다 소진했삼!! 실패");
		}
		// 123 -> if,switch에 대한 자세한 내용
		// 142 -> for, while 정리
	}

}
