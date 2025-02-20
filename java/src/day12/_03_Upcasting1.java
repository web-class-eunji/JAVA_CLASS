package day12;

class Parent1{

}

class Child extends Parent1{
	
}

public class _03_Upcasting1 {

	public static void main(String[] args) {
		Parent1 p1 = new Parent1();
		Child c1 = new Child();
		
		Parent1 p2 = new Child(); //자동타입변환
		Parent1 p3 = c1; //자동타입변환
//		Child c2 = new Parent1(); //업캐스팅 안됨
//		Child c3 = p1;
		
		if(p3 == c1) {
			System.out.println("p3과c1은 같은 객체를 참조한다");
		}
		/*
		 * 업캐스팅이란 부모요소(클래스)만 자식요소(클래스)로 변환이 가능하다.
		 * 자식요소를 부모요소로 변환하는 것은 자동변환(업캐스팅)안 됨
		 * 업캐스팅이 된 자식 클래스는 부모클래스의 기능만 사용할 수 있음 ( 자식클래스의 기능은 숨겨짐)
		 * 
		 * 타입변환이 사용되는 때
		 * 부모타입 하나로 여러 자식 객체를 관리하거나, 자식 클래스의 기능을 다시 사용하고 싶을 때 사용
		 * 자식 -> 부모 : 자동변환(업캐스팅)
		 * 부모 -> 자식 : 강제변환(다운캐스팅)
		 * */

	}

}
