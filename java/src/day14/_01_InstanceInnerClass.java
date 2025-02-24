package day14;

class House{
	class Room{
		void showRoom() {
			System.out.println("집 안에 방으로 들어왔다!!!");
		}
	}
}

public class _01_InstanceInnerClass {

	public static void main(String[] args) {
		House myHouse = new House(); // 집객체생성
		House.Room myRoom = myHouse.new Room();// 집 객체를 통한 방 객체 생성
		
		myRoom.showRoom();
		/*
		 * 인스턴스 내부클래스
		 * 외부클래스 객체(집,instance)이 있어야만 사용할 수 있는 클래
		 * */

	}

}
