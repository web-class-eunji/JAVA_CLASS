package day3;

import java.util.Scanner;

public class _02_Scanner {

	public static void main(String[] args) {
		int n;
		System.out.print("정수 입력 : ");
		
		Scanner input = new Scanner(System.in);
		n = input.nextInt();
		System.out.println("입력하신 숫자는" + n + "입니다.");
		// Scanner를 사용함 import해야함
		input.close();
	}

}
