package Control;

public class WhileExe {
	public static void main(String[] args) {

// while 구문을 사용하여 1 ~ 10 까지 출력
		int num1 = 0;
		while(num1 < 10) {
			num1 ++;
			System.out.println(num1);
		}
		System.out.println("문제1 끝");
		
//		while 구문을 사용하여 짝수 출력
		int num2 = 0;
		while(num2 < 10) {
			num2 ++;
			if (num2 % 2 == 0) {
				System.out.println(num2);
			}
		}
		System.out.println("문제2 끝");
		
//		while 구문을 사용하여 홀수 출력
		int num3 = 0;
		while(num3 < 10) {
			num3 ++;
			if (num3 % 2 == 1) {
				System.out.println(num3);
			}
		}
		System.out.println("문제3 끝");
		
//		while 구문을 이용하여 1 ~ 10 까지의 합 출력
		int num4 = 0;
		int sum1 = 0;
		while(num4 <= 10) {
			sum1 = sum1 + num4;
			num4 ++;
		}
		System.out.println("합계: " + sum1);
		System.out.println("문제4 끝");
		
		
	}
}
