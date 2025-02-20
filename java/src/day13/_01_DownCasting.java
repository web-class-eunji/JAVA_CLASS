package day13;

class Bike{ // 부모클래스
	String riderName;
	int wheel = 2;
	
	Bike(String riderName){ // 생성자 생성
		this.riderName = riderName;
	}
	
	void bikeInfo() {
		System.out.println(riderName + "의 자전거는 " + wheel + "발 자전거 입니다.");
	}
	
	void ride() {
		System.out.println("씽씽달리쟈~~~~");
	}
}

// 자식클래스(4발자전거) 만들어서 생성자 정의하기

class FourWheelBike extends Bike{
	FourWheelBike(String riderName){
		super(riderName);
	}
	
	@Override
	void bikeInfo() {
		super.bikeInfo();
	}

	
	void addWheel() {
		if(wheel == 2) {
			System.out.println(riderName + "의 자전거에 보조바퀴를 부착했습니다.");
		}else {
			System.out.println(riderName + "의 자전거에 이미 보조바퀴가 있습니다.");
		}
	}
}

public class _01_DownCasting {

	public static void main(String[] args) {
		// 부모클래스 -> 자식클래스 변환은 자동으로 변환되지 않아서 강제변환해야함!
		
		Bike b = new FourWheelBike("은지");
		b.bikeInfo();
		b.ride();
		// b.addWheel(); //강제형변환 필요!
		//b는 FourWheelBike 객체를 가리키고 있지만, 부모클래스 타입이 되었기 때문에 FourWheelBike의 기능인
		// addWheel을 사용할 수 없다!
		
		FourWheelBike fwb = (FourWheelBike)b;
		// 다시 자식클래스 고유의 기능인addWheel을 사용하고 싶을 때 다운캐스팅한다.
		fwb.addWheel();
		fwb.bikeInfo();
		fwb.ride();
		
		/*
		 * 1. 업캐스팅 후에는 부모클래스 기능만 사용 가능 ( 자동형변환 )
		 * 2. 다운캐스팅 해야 자식클래스의 기능을 다시 사용 가능 ( 강제형변환 )
		 * */
		

	}

}
