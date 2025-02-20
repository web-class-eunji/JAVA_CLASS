package day13;

interface RemoteControl{
	// 인터페이스로 만들었으니 추상메서드만 들어감
	void trunOn();
	void trunOff();
	void volumeUp();
	void volumeDown();
}

class Television implements RemoteControl{
	@Override
	public void trunOn() {
		System.out.println("Tv 를 켭니다.");
	}
	
	@Override
	public void trunOff() {
		System.out.println("Tv 를 끕니다.");
	}
	
	@Override
	public void volumeUp() {
		System.out.println("볼륨을 올립니다");
	}
	
	@Override
	public void volumeDown() {
		System.out.println("볼륨을 내립니다.");
	}
}

public class _03_Interface {

	public static void main(String[] args) {
		/*
		 * 인터페이스 : 설계도 역할을 하는 완전한 추상클래스
		 * 인터페이스 클래스에 들어가는 모든 메서드들은 추상메서드로 구현해야함
		 * 해당 기능들을 반드시 구현해야한다고 알려주며 강제하는 역할
		 * */
		RemoteControl tv = new Television();//자동타입변환됨
		tv.trunOn();
		tv.volumeUp();
		tv.volumeDown();
		tv.trunOff();
		/*
		 * 1. 코드의 표준화
		 * 2. 유지보수가* 쉬움
		 * 3. 다형성에 굿 : 여러개의 클래스가 같은 방식으로 동작하게 만들 수 있다.
		 * */
		
		/*
		 * 추상클래스와 인터페이스 차이
		 * 둘 다 객체생성은 불가능
		 * 상속방법 : 추상클래스(extends) / 인터페이스(implements)
		 * 추상메서드 : 추상클래스(포함가능) / 인터페이스(기본적으로 모두 추상메서드)
		 * 변수 : 추상클래스(일반변수, 상수 가능) / 인터페이스(static final 변수만 가능)
		 * 공통 기능도 제공하고 일부만 강제할거면 추상클래스
		 * 다 강제할거면 인터페이스
		 * */
	}

}
