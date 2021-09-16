package Control;

import java.util.Scanner;

public class Parktaejoon {

	public static void main(String[] args) {
//		if 구문과 for/while 구문을 사용하여 문제 생성

		int num = 0;
		System.out.println("제가 좋아하는 수는 무엇일까요?");
		Scanner scn = new Scanner(System.in);
		do {
			num = scn.nextInt();
			if (num < 72) {
				System.out.println(num + "보다 큰 수입니다.");
			}
			if (num > 72) {
				System.out.println(num + "보다 작은 수입니다.");
			}
		} while (num != 72);
		System.out.println("정답입니다.");
	}
}
