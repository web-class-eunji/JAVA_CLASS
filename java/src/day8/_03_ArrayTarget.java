package day8;

import java.util.Scanner;

public class _03_ArrayTarget {

	public static void main(String[] args) {
		/*
		 * 숫자 5개가 들어간 배열
		 * 입력받은 숫자(target)가 배열에 들어있는지 확인
		 * 들어있다면 target(숫자)은 배열에 있습니다.
		 * 없다면 target(숫자)은 배열에 없습니다.
		 * 
		 * Tip : 입력받은 숫자를 찾았는지 못찾았는지 판단하는 변수를 만들어 놓으면 편함!
		 * 향상된 for문 사용!
		 * */
		
		int[] numbers = {10,20,30,40,50};
		int target;
		Scanner numInput = new Scanner(System.in);
		System.out.print("찾고싶은 숫자를 입력해!! : ");
		target = numInput.nextInt();
		numInput.close();
		boolean found = false;
		
		for(int num:numbers) {
			if(target == num) {
				found = true;
				break;
			}
		}
		
		if(found) {
			System.out.println(target + "은(는) 배열에 있습니다.");
		}else {
			System.out.println(target + "은(는) 배열에 없습니다.");
		}
		
	}

}
