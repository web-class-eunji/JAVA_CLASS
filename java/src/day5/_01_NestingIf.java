package day5;

import java.util.Scanner;

public class _01_NestingIf {

	public static void main(String[] args) {
		/*
		 * 중첩 if : if문 안에 if문이 들어가는 구조
		 * 
		 * if(조건1){
		 * 		조건 1을 만족하면 실행할 코드
		 * 		if(조건2){
		 * 			조건 1,2 모두 만족하면 실행할 코드
		 * 		}else {
		 * 			조건 1을 만족하지만 조건 2는 만족하지 않음
		 * 		}
		 * }else{
		 * 		조건 1을 만족하지 않았을때 실행
		 * }
		 * */
		
//		if(10 > 20) {
//			System.out.println("20이 10보다 크다.");
//			if(50 < 30) {
//				System.out.println("50이 30보다 크다.");
//			}else {
//				System.out.println("30은 가장 크지 않다.");
//			}
//		}else {
//			System.out.println("뭔가 잘못됨!!");
//		}
//		// 1번째 if문의 조건이 만족해야만 안쪽 if문을 검사할 수 있는 기회가 주어짐
//		
//		
//		/*
//		 * 1. 놀이기구를 타려면 키가 120이 넘어야 하고
//		 * 2. 120이 넘더라도 나이가 10살 미만이라면 보호자 필수
//		 * */
//		
//		Scanner heightInput = new Scanner(System.in);
//		System.out.print("키를 입력하세요 : ");
//		double height = heightInput.nextDouble();
//		
//		if(height >= 120) {
//			System.out.print("나이를 입력하세요 : ");
//			Scanner ageInput = new Scanner(System.in);
//			int age = ageInput.nextInt();
//			ageInput.close();
//			heightInput.close();
//			
//			if(age < 10) {
//				System.out.println("10살 미만이라면 보호자 필수");
//			}else {
//				System.out.println("놀이기구 탑승 가능!");
//			}
//			
//		}else {
//			System.out.println("아쉽지만 키가 좀 더 커서 오세요");
//		}
		
		
		/*
		 * 학생출석 및 과제 제출 여부
		 * 1. 학생 출석 확인 (yes,no)
		 * 2. 과제 제출했는지 확인(yes,no)
		 * 3. 제출했다면 - 수업 참여 인정
		 * 4. 과제 제출 X - 50%출석인정
		 * 5. 출석평가에서 -3점 감점됨
		 * 
		 * String 변수명.next();
		 * 변수명.equalslgnoreCase("yes")
		 * */
		
		
		Scanner in = new Scanner(System.in);
		System.out.println("출석 여부 ( yes / no ) : ");
		String attendance = in.next();
		
		if(attendance.equalsIgnoreCase("yes")) {
			//equalsIgnoreCase 문자열 비교할 때 사용하는 메서드
			//equals()
			// if(attendance == "yes")
			System.out.println("과제를 제출했나요? (yes / no) : ");
			String submit = in.next();
			if(submit.equalsIgnoreCase("yes")) {
				System.out.println("과제 제출 완료! 수업 100 참여 인정");
			}else {
				System.out.println("과제를 제출하지 않아 50% 출석 인정");
			}
			
		}else {
			System.out.println("출석 평가 점수 -3 감점");
		}

	}

}
