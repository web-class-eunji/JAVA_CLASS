package day9;

class Cat { //고양이틀
	String name;
	int age;
	
	public void meow() {
		System.out.println("제 이름은 " + name + "이고 나이는 " + age + "살 입니다!");
	}	
	public void sleep() {
		System.out.println("저는 하루에 10시간 자요");
	}	
}

public class _03_Class { // 실행용 클래스
	
	/*
	 * 1. 실행용 클래스
	 * 2. 라이브러리용 클래스  ( 다른 클래스에서 이용할 목적으로 선언되는 클래스 )
	 * 
	 * class : class를 선언한다
	 * 클래스 이름
	 * 1. 영어 대소문자를 사용한다. ( 첫글자는 대문자를 사용 )
	 * 2. 클래스 이름 규칙 = 변수이름 규칙
	 * 3. 숫자 사용 가능하나 첫글자로는 불가
	 * 4. 특수문자 사용 : $ _
	 * 5. 자바 예약어 사용 X
	 * 6. 클래스는 main 메서드 밖에 선언
	 * 
	 * 클래스 구성요소
	 * 			* 접근제한자
	 * 1. 필드 : 객체가 생성될 때 가져야 할 데이터 상태를 저장하는 변수인데 필드라고 부름!
	 * 			객체가 생성될 때 함께 생성되어야 함
	 * 2. 메서드 : 객체의 기능을 정의하는 부분
	 * 3. 생성자 : 메서드 중에서 객체를 생성할 때 반드시 호출해야하는 메서드
	 * */
	
	public static void main(String[] args) {
		/*
		 * 객체 : 클래스를 토대로 만들어진다! 실생활에 존재하는 모든 것! ( 상태를 표현할 수 있다 )
		 * 클래스 : 객체를 생성하기 위한 설계도! 
		 * */
		
		Cat myCat = new Cat();
		myCat.name = "오레오";
		myCat.age = 2;
		myCat.meow();
		
		Cat yourCat = new Cat();
		yourCat.name = "도토리";
		yourCat.age = 7;
		yourCat.sleep();
		


	}

}
