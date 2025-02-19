package day12;

class Parent1{

}

class Child extends Parent1{
	
}

public class _03_Upcasting1 {

	public static void main(String[] args) {
		Parent1 p1 = new Parent1();
		Child c1 = new Child();
		
		Parent1 p2 = new Child();
		Parent1 p3 = c1;
//		Child c2 = new Parent1();
//		Child c3 = p1;

	}

}
