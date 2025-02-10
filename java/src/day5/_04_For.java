package day5;

import java.nio.file.spi.FileSystemProvider;

public class _04_For {

	public static void main(String[] args) {
		/*
		 * for(초기값; 조건식; 증가/감소식){
		 * 		반복실행문
		 * }
		 * */
		
//		int i;
//		for(i = 1;i <= 100;i++) {
//			System.out.print(i + " ");
//		}
		
		// 1. 3의 배수의 합계
		// 2. 3의 배수가 몇개인지
		
		int i;
		int total = 0;
		int count = 0;
		
		for(i = 3;i <= 100; i += 3) {
			if(i % 2 != 0) {
				System.out.println(i + " ");
				total += i;
				count++;
			}
		}
		System.out.println("1 ~ 100 사이의 3의 배수의 합은 " + total + "입니다.");
		System.out.println("1 ~ 100 사이의 3의 배수의 개수는 " + count + "입니다.");
	}

}
