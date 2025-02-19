package day11;

class Book {
	String title;
	int series;
	int page;
	
	//기본생성자
	Book(){
		title = "제목";
		series = 1;
		page = 250;
	}
	
	//이름만 바꾸는 생성자
	Book(String t){
		title = t;
		series = 1;
		page = 250;
	}
	
	//이름과 시리즈를 바꾸는 생성자
	Book(String t, int s){
		title = t;
		series = s;
		page = 250;
	}
	
	//이름과 시리즈 그리고 페이지를 바꾸는 생성자
	Book(String t, int s, int p){
		title = t;
		series = s;
		page = p;
	}
	
	void bookInfo() {
		System.out.println("제목 : " + title);
		System.out.println("시리즈 : " + series);
		System.out.println("페이지 수 : " + page);
	}
}

public class _02_OverLoading2 {

	public static void main(String[] args) {
		/*
		 * book이라는 클래스
		 * 제목, 시리즈, 페이지수
		 * 
		 * 기본생성자 만들고
		 * 각각의 값을 바꿀 수 있는 오버로딩 생성자들을 만들기
		 * 제목 :
		 * 시리즈 :
		 * 페이지수 :
		 * */
		
		Book bookBasic = new Book();
		bookBasic.bookInfo();
		
		System.out.println();
		
		Book book2 = new Book("트와일라잇");
		book2.bookInfo();
		
		System.out.println();
		
		Book book3 = new Book("뉴문",2);
		book3.bookInfo();
		
		System.out.println();
		
		Book book4 = new Book("이클립스",3,300);
		book4.bookInfo();
		
		System.out.println();
		
		Book book5 = new Book("브레이킹던 Part1",4,500);
		book5.bookInfo();
		
		System.out.println();
		
		Book book6 = new Book("브레이킹던 Part2",5,600);
		book6.bookInfo();

	}

}
