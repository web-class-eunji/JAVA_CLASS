package day4;

import java.util.Scanner;

public class _02_Arithmetic {

	public static void main(String[] args) {
		/*
		 * 분을 정수로 입력받아서 몇시간 몇분 으로 환산하는 프로그램 만들기
		 * 
		 * */
		
		Scanner Input = new Scanner(System.in);
		System.out.print("분 입력 : ");
		int inMinute = Input.nextInt();
		Input.close();
		
		int hour = inMinute / 60;
		int minute = inMinute % 60;
		System.out.printf("%d분은 %d시간 %d분 입니다",inMinute,hour,minute);
	}

}
