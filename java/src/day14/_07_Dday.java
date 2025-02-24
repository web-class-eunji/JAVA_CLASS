package day14;

import java.util.Calendar;
import java.util.Scanner;


public class _07_Dday {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Calendar today = Calendar.getInstance();
		Calendar targetDay = Calendar.getInstance();
//		Calendar targetDay = new Calendar;
		
		System.out.print("목표 연도 입력 : ");
		int year = scan.nextInt();
		System.out.print("목표 월 입력 : ");
		int month = scan.nextInt();
		System.out.print("목표 일 입력 : ");
		int day = scan.nextInt();
		
		targetDay.set(year, month-1,day);
		long diffMillis = targetDay.getTimeInMillis() - today.getTimeInMillis();
		//  targetDay.getTimeInMillis() : 목표날짜를 밀리초 단위로 변환
		// 	today.getTimeInMillis(); : 현재 날짜를 밀리초 단위로 변환
		// 두 날짜의 차이를 구해서 몇 밀리초 차이가 나는지 알 수있다.
		System.out.println(diffMillis); // 두 날짜의 밀리초 차이 : 259200007 / (1000*60*60*24) = 86,400,000
		long dDay = diffMillis / (1000*60*60*24);
		
		if(dDay > 0) {
			System.out.println("D-" + dDay + "일 남았습니다.");
		}else if(dDay == 0) {
			System.out.println("오늘이 D-day 입니다!!!!!!");
		}else {
			System.out.println("이미" + Math.abs(dDay) + "일 지났습니다!");
			//Math.abs(dDay) : dDay의 절대값을 반환
			// Math.abs(5) -> 5
			//Math.abs(-5) -> 5
		}
		scan.close();

	}

}
