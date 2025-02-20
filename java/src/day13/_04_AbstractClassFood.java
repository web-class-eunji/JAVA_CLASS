package day13;

abstract class Food{
	abstract void cook();
}

class Pizza extends Food{
	@Override
	void cook() {
		System.out.println("오븐에서 피자굽기");
	}
}

class Ramen extends Food{
	@Override
	void cook() {
		System.out.println("보글보글 맛좋은라면");
	}
}

public class _04_AbstractClassFood {

	public static void main(String[] args) {
		/*
		 * 요리방법(추상메서드)이 들어있는 추상클래스 만들기
		 * 피자클래스 - 추상클래스 상속받기
		 * 라면클래스 - 추상클래스 상속받기
		 * 
		 * */
		
		Food myFood = new Pizza();
		myFood.cook();
		
		Food myFood1 = new Ramen();
		myFood1.cook();

	}

}
