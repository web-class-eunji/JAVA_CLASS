package day3;

import java.util.Scanner;

public class _04_trapezoid {

	public static void main(String[] args) {
		// 윗변,밑변,높이를 입력받아서 윗,밑,높이를 가지고 너비를 구하는 코드를 작성
		// 실수형
		// 사다리꼴의 넓이를 구하는 공식 : (윗변 + 아랫변) * 높이 / 2
		
		double base,top,height;
		
		Scanner in = new Scanner(System.in);
		System.out.print("윗변, 밑변, 높이를 연속으로 입력하세요(공백으로 구분) :");
		top = in.nextDouble();
		base = in.nextDouble();
		height = in.nextDouble();
		in.close();
		
//		Scanner in = new Scanner(System.in);
//		System.out.print("윗변 : ");
//		top = in.nextDouble();
//		
//		System.out.print("밑변 : ");
//		base = in.nextDouble();
//		
//		System.out.print("높이 : ");
//		height = in.nextDouble();
	
		
		double area = (top + base) * height / 2;
		System.out.println("사다리꼴의 넓이는 : " + area);
	}

}
