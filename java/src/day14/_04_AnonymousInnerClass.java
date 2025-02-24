package day14;

abstract class Button{
	abstract void press();
}

class StartButton extends Button {
	@Override
	void press() {
		System.out.println("시동 켜기");
	}
}

public class _04_AnonymousInnerClass {
	//익명클래스는 이름이 없는 일회용 클래스이며 보통 인터페이스나 추상클래스에서 즉석에서 구현할 때 사용한다

	public static void main(String[] args) {
		
		Button startButton = new Button() {
			@Override
			void press() {
				System.out.println("시동 켜기");
			}
		};
		startButton.press();
		
		Button startButton1 = new StartButton();
		
		/*
		 * 1. Object
		 * 		clone / equals / hashCode / toString
		 * 2. String메서드
		 * */
	}

}
