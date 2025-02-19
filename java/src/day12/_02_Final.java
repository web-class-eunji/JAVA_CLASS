package day12;

final class Parent{
	void printText() {
		System.out.println("파이널 클래스");
	}
}

//class Child extends Parent{
//	
//}

class Book{
	String title;
	String author;
	
	Book(String title,String author){
		this.title = title;
		this.author = author;
	}
	
	final void infoTitle() {
		System.out.println("책 제목 : " + title);
	}
	
	void infoAuthor() {
		System.out.println("책의 저자는 " + author + " 입니다.");
	}
}

class Comic extends Book{
	boolean isColor;
	
	Comic(String title,String author,boolean isColor){
		super(title,author);
		this.isColor = isColor;
	}
		
//	void infoTitle() {
//		System.out.println("이 만화책의 제목은 " + title + "입니다.");
//	}
	
	@Override
	void infoAuthor() {
		System.out.println("엮은이는 아는데요..");
	}
	
	void infoColor() {
		if(isColor) {
			System.out.println("이 만화책은 컬러입니다.");
		}else {
			System.out.println("이 만화책은 흑백입니다.");
		}
	}
	
	
	
}


public class _02_Final {

	public static void main(String[] args) {
		/*
		 * 파이널
		 * 1. 파이널 키워드는 클래스,메서드,변수에 사용할 수 있다.
		 * 2. 한 번 정하면 변경 불가! (상수개념)
		 * 3. 파이널 키워드로 클래스를 만들면 어떤 클래스도 파이널 클래스의 자식클래스가 될 수 없다.
		 * */
		
		Comic comicBook = new Comic("명탐정 코난","아오야마고쇼",true);
		comicBook.infoTitle();
		comicBook.infoAuthor();
		comicBook.infoColor();
	}

}
