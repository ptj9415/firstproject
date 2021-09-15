package Control;

public class ForExe {

	public static void main(String[] args) {
//		문제 1) 1 ~ 10 출력
		for (int i = 1; i <= 10; i++) {
			System.out.println(i + " ");
		}
		System.out.println("문제1 끝\n");

//		문제 2) 1 ~ 10 중 짝수만 출력
		for (int i = 1; i <= 10; i++) {
			if (i % 2 == 0) {
				System.out.println(i);
			}
		}
		System.out.println("문제2 끝\n");

//		문제3) 1 ~ 10 중 홀수만 출력
		for (int i = 1; i <= 10; i++) {
			if (i % 2 == 1) {
				System.out.println(i);
			}
		}
		System.out.println("문제3 끝\n");

//		문제4) 1 ~ 10의 합 출력
		int sum1 = 0;
		for (int i = 1; i <= 10; i++) {
			sum1 = sum1 + i;
		}
		System.out.printf("1부터 10까지의 합은 %s 입니다.\n", sum1);
		System.out.println("문제4 끝");
	}

}
