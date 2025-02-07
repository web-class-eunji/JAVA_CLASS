package day4;

public class _01_Operator {

	public static void main(String[] args) {
		/*
		 * 1. 산술연산자
		 * 		+ 더하기
		 * 		- 빼기
		 * 		/ 나누기 : 나눗셈을 한 몫을 반환
		 * 		% 나머지 : 10을 3으로 나눈 나머지 1 ( 정수에서만 사용 가능 )
		 * 
		 * 2. 증감연산자
		 * 		- 감소연산자
		 * 			변수--; 또는 --변수;
		 * 		- 증가연산자
		 * 			변수++; 또는 ++변수;
		 * 		++변수 와 변수++ 의 차이
		 * 		변수++ : 먼저 a의 값이 대입된 후에 ++증가가 실행됨 ( 후치연산 )
		 * 		++변수 : a의 값이 먼저 증가한 후에 대입됨 ( 전치연산 )
		 * 
		 * 	3. 대입연산자
		 * 		a = b : b의 값을 a에 대입
		 * 		복합대입연산자
		 * 		a += b : a = a + b
		 * 		a -= b : a = a - b
		 * 		a *= b : a = a * b
		 * 		a /= b : a = a / b
		 * 		a %= b : a = a % b
		 * 
		 * 4. 비교연산자 : true 라면 1 / false 라면 0
		 * 		a < b : a 가 b 보다 작다
		 * 		a > b : a 가 b 보다 크다
		 * 		a <= b : a 가 b 보다 작거나 같다
		 * 		a >= b : a 가 b 보다 크거나 같다
		 * 		a == b : a 와 b 는 같다
		 * 		a != b : a 와 b 는 다르다
		 * 
		 * 5. 논리연산자
		 * 		&&(and) : 그리고~ 라는뜻으로 조건식이 모두 참일때만 참을 반환
		 * 		||(or) : 조건식 중 하나라도 참이면 참을 반환
		 * 		!(not) : 결과값의 반대를 출력함 ( 값이 true 라면 false 를 출력함 ) 
		 * 
		 * 6. 삼항조건연산자
		 * 		조건식이 true 라면 식1을 실행 / false 라면 식2를 실행
		 * 		조건식 ? 식1 : 식2;
		 * */
		
		// 기본산술연산자
		int a,b;
		a = 10;
		b = 20;
		System.out.println(a + b);
		System.out.println(a - b);
		System.out.println(a * b);
		System.out.println(b / a);
		System.out.println(7 % 4);
		
		
		
		System.out.println();
		// 증감연산자
		int x = a++;
		System.out.println(x);
		
		int z = ++a;
		System.out.println(z);
		
		
		
		System.out.println();
		// 대입연산자 
		int y = b;
		System.out.println(y);
		
		y += 5; // y = y + 5
		System.out.println(y);
		
		y -= 5;
		System.out.println(y);
		
		y *= 5;
		System.out.println(y);
		
		y /= 5;
		System.out.println(y);
		
		y %= 3;
		System.out.println(y);
		
		
		
		System.out.println();
		//비교연산자
		int num1,num2;
		num1 = 150;
		num2 = 200;
		System.out.println(num1 > num2);
		System.out.println(num1 < num2);
		System.out.println(num1 >= num2);
		System.out.println(num1 <= num2);
		System.out.println(num1 == num2);
		int num3 = 200;
		System.out.println(num2 == num3);
		
		
		
		System.out.println();
		//논리연산자
		int height = 130;
		int age = 10;
		boolean result = height >= 100 && age >= 10;
		System.out.println(result);
		
		int age2 = 8;
		boolean result2 = height >= 100 || age2 >= 10;
		System.out.println(result2);
		
		boolean homework = false;
		System.out.println(!homework);
		
		
		
		System.out.println();
		// 삼항조건연산자
		int seven = 4;
		String result3 = seven % 2 == 0 ? "짝수" : "홀수";
		System.out.println("해당 숫자는 " + result3 + "입니다");
	}

}
