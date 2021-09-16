package reference;

public class ArrayExample2 {

	public static void main(String[] args) {
//		1 ~ 10까지 임의의 수 생성
//		학생 10명이 있다고 가정
//		배열변수 scores
		int scores[] = new int[10];
//		System.out.println(scores.length);
		for (int i = 0; i < scores.length; i++) {
			int temp = (int) (Math.random() * 10) + 1;
			System.out.println(scores[i] = temp);
		}
		System.out.println("끝");
		for (int i = 0, l = scores.length; i < l; i++) {
			System.out.printf("scores[%d] → %d\n", i, scores[i]);
		}
		System.out.println("끝");

		int sum = 0;
//		배열의 합계: 얼마입니다.
		for (int i = 0; i < scores.length; i++) {
			sum = sum + scores[i];
		}
		System.out.println("배열의 합계는 " + sum + "입니다.");
		System.out.println("끝");

		sum = 0;
		for (int i = 0; i < scores.length; i++) {
			if (scores[i] > 5) {
				sum = sum + scores[i];
			}
		}
		System.out.println("배열의 합계는 " + sum + "입니다.");
		System.out.println("끝");
		
		sum = 0;
		for (int i = 0; i < scores.length; i++ ) {
			if (i % 2 == 0 ) {
				sum = sum + scores[i];
			} else if (i == 0) {
				sum = sum + scores[i];
			}
		}
		System.out.println("짝수 배열의 합계는 " + sum + "입니다.");

	}

}
