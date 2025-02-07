package day4;

import java.util.Scanner;

public class _04_IfElse {

	public static void main(String[] args) {
		int a = 10;
		
		if(a > 15) {
			System.out.println("조건을 충족합니다.");
		}else {
			System.out.println("조건을 충족하지 않습니다.");
		}
		
		/*
		 * 국영수 점수를 입력받아서 각 과목이 60점 이상이면 합격
		 * 한 과목이라도 60점 미만이라면 불합격
		 * */
		
		Scanner Input = new Scanner(System.in);
		System.out.println("국어 영어 수학 점수를 입력하세요 ( 공백구분 ): ");
		int kor,en,math;
		kor = Input.nextInt();
		en = Input.nextInt();
		math = Input.nextInt();
		Input.close();
		
//		if(kor >= 60 && en >= 60 && math >= 60) {
//			System.out.println("모든 점수가 60점 이상으로 합격입니다.");
//		}else {
//			System.out.println("한 과목 이상 60점 미만이라 불합격 입니다.");
//		}
		
		if(kor < 60 || en < 60 || math < 60) {
			System.out.println("한 과목 이상 60점 미만으로 불합격 입니다.");
		}else {
			System.out.println("모든 점수가 60점 이상으로 합격입니다");
		}
		
	}

}
