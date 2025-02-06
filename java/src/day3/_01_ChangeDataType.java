package day3;

public class _01_ChangeDataType {

	public static void main(String[] args) {
		int i1 = 10;
		byte b1 = (byte)i1;
		System.out.println(b1);
		
		int i2 = 128;
		byte b2 = (byte)i2;
		System.out.println(b2);
		
		double d1 = 1.0e100;
		float f1 = (float)d1;
		System.out.println(f1);
		
		double d2 = 1.0e-50;
		float f2 = (float)d2;
		double d3 = (double)f2;
		System.out.println(d3);
		
		// 자동형변환
		// 1. 저장공간의 크기가 커질 때 
		// 2. 타입호환성
		
		int number1 = 14;
		double number2 = 3.14;
		
		double number1Change = number1;
		System.out.println(number1Change);
		System.out.println(number1);
		
		int number2Change = (int)number2;
		System.out.println(number2Change);
		
		
		int num = 10;
		byte numByte = (byte)num;
		System.out.println("[int -> byte] num의 값 : " + num + ", numByte의 값 : " + numByte);
		
		int num2 = 1000;
		byte numByte2 = (byte)num2;
		System.out.println("[int -> byte] num2의 값 : " + num2 + ", numByte2의 값 : " + numByte2);
		
		// 자동형변환이란 ? 작은 데이터 자료형에서 큰 자료형으로 변경할 때 알아서 자동으로 형변환이 됨
		// 강제형변환이란 ? 큰 데이터 타입에서 작은 데이터 타입으로 변경할 땐 오류가 발생하므로 (자료형)변수 <- 이렇게 작성해야함
		
	}

}
