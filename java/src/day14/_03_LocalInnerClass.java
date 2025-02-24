package day14;

class Restaurant {
	void todayMenu() {
		class Menu{
			void showMenu() {
				System.out.println("오늘의 점심특선 : 갈치구이와 쭈꾸미삼겹살");
			}
		}
		
		Menu menu = new Menu();//메서드 안에서만 사용 가능
		menu.showMenu();
	}
}

public class _03_LocalInnerClass {

	public static void main(String[] args) {
		Restaurant myRestaurant = new Restaurant(); // 식당 객체 생성
		myRestaurant.todayMenu();

	}

}
