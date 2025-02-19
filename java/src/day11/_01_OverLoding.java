package day11;

class Phone {
	String color;
	int storage;
	int price;
	/*
	 * 생성자 오버로딩 규칙 
	 * 1. 이름이 같아야 함 ( 생성자!!!!! )
	 * 2. 매개변수의 개수나 타입이 달라야 한다. -> 같은 매개변수를 가진 생성자 오버로딩이 생기면 오류남
	 * 3. 기본생성자와 함께 사용 가능
	 * 4. 필요한 정보만 전달해서 객체 생성 가능!
	 * */
	
	//기본생성자
	Phone(){
		color = "스페이스그레이";
		storage = 64;
		price = 1290000;
	}
	
	// 색상만 설정하는 생성자
	Phone(String c){
		color = c; // 객체 생성할 때 매개변수로 입력받을거임!
		storage = 64;
		price = 1290000;
	}
	
	//색상과 저장공간을 설정하는 생성자
	Phone(String c,int s){
		color = c;
		storage = s;
		price = 1290000;
	}
	
	// 색상, 저장공간, 가격까지 설정하는 생성자
	Phone(String c, int s, int p){
		color = c;
		storage = s;
		price = p;
	}
	
	//출력메서드
	void phoneInfo() {
		System.out.println("색상 : " + color + " / 저장공간 : " + storage + "GB / 가격 : " + price);
	}
	
}

public class _01_OverLoding {

	public static void main(String[] args) {
		// 기본모델
		Phone basic = new Phone();
		basic.phoneInfo();
		
		//색상만 변경 원하는 고객
		Phone colorChangePhone = new Phone("핑크색");
		colorChangePhone.phoneInfo();
		
		//색상과 저장공간 변경
		Phone colorStoragePhone = new Phone("화이트",128);
		colorStoragePhone.phoneInfo();
		
		//상위버전 구매하고싶은고객
		Phone premiumPhone = new Phone("골드",512,2560000);
		premiumPhone.phoneInfo();

	}

}
