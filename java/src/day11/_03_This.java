package day11;

class Person{
	String name;
	int age;
	
	Person(String name, int age){
		this.name = name;
		this.age = age;
	}
	
	void introduce() {
		System.out.println("안녕하세요 저는 " + this.name + "이며 나이는" + this.age + "살 입니다!");
	}
}

public class _03_This {

	public static void main(String[] args) {
		/*
		 * 1. this : 현재 객체 자기 자신을 가리키는 키워드
		 * 			필드와 생성자의 매개변수 이름이 같을 때 구별하는 용도로 사용한다
		 * 2. this() : 현재 클래스의 다른 생성자를 호출하는 기능
		 * 				생성자의 기본(매개변수)값을 설정!
		 * 				한 개의 생성자에서 한 개의 this() 기본값 사용가능
		 * */
		
		Person p1 = new Person("영희",20);
		p1.introduce();
		
		
		Person p2 = new Person("고영희",3);
		p2.introduce();
	}

}
