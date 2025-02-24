package day14;

class WifiRouter {
	static int instanceVar = 10;
	static class signal{
		void connect() {
			System.out.println(instanceVar);
			System.out.println("wifi 신호 연결중");
		}
	}
}

public class _02_StaticInnerClass {

	public static void main(String[] args) {
		
		WifiRouter.signal wifi = new WifiRouter.signal();
		wifi.connect();
	}

}
