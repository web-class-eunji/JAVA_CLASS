package day13;

abstract class Appliance{ //객체 생성 불가
	String brand;
	
	void powerOn() {
		System.out.println("전원이 켜졌습니다.");
	}
	
	void powerOff() {
		System.out.println("전원이 꺼졌습니다.");
	}
	
	// 각 제품마다 다른 기능 -> 추상메서드(미완성!)
	abstract void operate();
}


class WashingMachine extends Appliance {
	@Override
	void operate() {
		System.out.println("세탁기가 빨래를 시작합니다.");
	}
}

class Refrigerator extends Appliance {
	@Override
	void operate() {
		System.out.println("냉장고가 음식을 냉장보관합니다.");
	}
}

class Tv extends Appliance {
	@Override
	void operate() {
		System.out.println("TV가 방송을 재생합니다.");
	}
}

public class _02_Abstract {

	public static void main(String[] args) {
		//추상클래스 : 공통적인 특징을 묶어놓은 설계도
		// 여러개의 클래스가 공통으로 가져야 할 속성과 기능을 정의하는 클래스
		// 완성되지 않은 미완성 메서드를 포함할 수 있다.
		
		WashingMachine wm = new WashingMachine();
		Refrigerator fridge = new Refrigerator();
		Tv tv = new Tv();
		
		wm.powerOn();
		wm.operate();
		wm.powerOff();
		System.out.println("----------------------------");
		
		fridge.powerOn();
		fridge.operate();
		fridge.powerOff();
		System.out.println("----------------------------");
		
		tv.powerOn();
		tv.operate();
		tv.powerOff();
		System.out.println("----------------------------");
		/*
		 * 1. 공통 기능을 한 곳에 모아서 관리한다.
		 * 2. 각 클래스가 가져야 할 필수 기능을 강제할 수 있다.
		 * 3. 추상클래스 : 미완성(추상)메서드를 포함할 수 있는 클래스
		 * 4. 추상메서드 : 선언만 있고 구현(내용)이 없는 메서드
		 * 5. 추상클래스를 상속받은 클래스 : 추상클래스에 있는 추상 메서드를 반드시 구현해야한다.
		 * */
	}

}
