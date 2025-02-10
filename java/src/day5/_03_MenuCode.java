package day5;

import java.util.Scanner;

public class _03_MenuCode {

	public static void main(String[] args) {
		// f나 F를 입력했다면 File Menu 출력
		// h나 H를 입력했다면 help Menu 출력
		// e나 E를 입력했다면 Edit Menu 출력
		// 변수.next().charAt(0);
		
		System.out.println("코드 입력 (f,h,e) : ");
		Scanner codeInput = new Scanner(System.in);
		char menu = codeInput.next().charAt(0);
//		if(menu == 'f' || menu == 'F') {
//			System.out.println("File Menu");
//		}else if(menu == 'h' || menu == 'H') {
//			System.out.println("help Menu");
//		}else if(menu == 'e' || menu == 'E') {
//			System.out.println("Edit Menu");
//		}else {
//			System.out.println("Error");
//		}
		
		switch(menu) {
		case 'f':
		case 'F':
			System.out.println("File Menu");
			break;
		case 'h':
		case 'H':
			System.out.println("Help Menu");
			break;
		case 'e':
		case 'E':
			System.out.println("Edit Menu");
			break;
		default:
			System.out.println("Error");
		}
		
	}

}
