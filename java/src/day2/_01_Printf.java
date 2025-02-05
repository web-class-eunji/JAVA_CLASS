package day2;

public class _01_Printf {

	public static void main(String[] args) {
		// printf : f (format (서식))
		/*
		 * 1. %d(decimal) : 10진 정수
		 * 2. %f(float) : 실수 (고정소수점 이하 6자리)
		 * 3. %c(character) : 문자
		 * 4. %s(string) : 문자열
		 * */
		
		System.out.printf("덧셈 결과는 %d 입니다. \n",7+1234);
		System.out.printf("%d + %d = %d \n",3,5,3+5);
		System.out.printf("실수는 %f입니다. \n",3.1234);
		System.out.printf("소수점 2자리 출력 : %.2f \n",3.1264);
		System.out.printf("소수점 3자리 출력 : %.3f \n",3.1289);
		System.out.printf("문자 : %c \n",'T');
		System.out.printf("문자열 : %s \n","Java Class");
	}
	

}
