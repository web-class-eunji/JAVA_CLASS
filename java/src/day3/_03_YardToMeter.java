package day3;

import java.util.Scanner;

public class _03_YardToMeter {

	public static void main(String[] args) {
		final double ONE_YARD = 0.9144;
		
		System.out.print("야드 입력 : ");
		Scanner YardIn = new Scanner(System.in);
		double yard = YardIn.nextDouble();
		YardIn.close();
		
		double meter = yard * ONE_YARD;
		System.out.println(yard + "yard는 " + meter + " meter 입니다.");
	}

}
