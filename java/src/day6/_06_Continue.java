package day6;

public class _06_Continue {

	public static void main(String[] args) {
		// continue : 뒤에 오는 코드를 무시하고 반복문을 실행
		int sum = 0;
		for(int i = 0;i <= 100;i++) {
			if(i % 2 != 0) { // 홀수라면
				continue;
			}
			sum += i;
		}
		System.out.println("짝수의 합 : " + sum);

	}

}
