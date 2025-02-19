package day11;

class Album {
	String title;
	String artist;
	int trackCount;
	boolean member;
	
	Album(){
		this("제목","가수",0,false);
	}
	
	
	//생성자
	Album(String title, String artist, int trackCount, boolean member){
		this.title = title;
		this.artist = artist;
		this.trackCount = trackCount;
		this.member = member;
	}
	
	void albumInfo() {
		System.out.println("🎧 앨범 정보 🎧");
		System.out.println("앨범제목 : " + this.title);
		System.out.println("가수 : " + this.artist);
		System.out.println("수록곡 개수 : " + this.trackCount);
		System.out.println("지니뮤직 회원인가요? : " + this.member);
		System.out.println("---------------------");
	}
}

public class _05_Album {

	public static void main(String[] args) {
		/*
		 * 앨범의 제목, 가수, 수록곡 개수를 필드로 만들고
		 * this를 사용한 생성자를 활용해서 객체를 생성한 뒤 정보 출력하기
		 * 앨범 제목 : 
		 * 가수 : 
		 * 수록곡 개수 : **곡
		 * */
		Album album1 = new Album("블루밍","아이유",3,true);
		Album album2 = new Album("too good to say goodbye","Bruno mars",8,true);
		Album album3 = new Album();
		
		album1.albumInfo();
		album2.albumInfo();
		album3.albumInfo();
		
		
	}

}
