package day10;

class Greeter{
	public void hello() {
		System.out.println("리턴값 없는 안녕하세요");
	}
}

class Calculator{

	public int add(int a, int b) {
		return a + b;
	}
	
}

public class _01_Method {

	public static void main(String[] args) {
		/*
		 * 메서드 구성 요소
		 * 1. 리턴타입 : 메서드가 작업을 수행한 후 돌려주는 값의 타입
		 * 2. 메서드 이름 : 메서드의 이름은 보통 동사를 사용해서 동작을 명확하게 표현한다.
		 * 3. 매개변수(파라미터):메서드에 입력값을 전달하기 위해 사용하는 변수
		 * */
		
		Greeter greeter = new Greeter();
		greeter.hello();
		
		Calculator calculator = new Calculator();
		int result = calculator.add(5,3);
		System.out.println("결과 : " + result);

	}

}
