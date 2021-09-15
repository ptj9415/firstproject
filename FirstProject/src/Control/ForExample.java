package Control;

public class ForExample {
	public static void main(String[] args) {
		int cnt = 0;
		
		cnt += 1;
		System.out.printf("cnt: %d\n", cnt);
		cnt += 1;
		System.out.printf("cnt: %d\n", cnt);
		cnt += 1;
		System.out.printf("cnt: %d\n", cnt);
		cnt += 1;
		System.out.printf("cnt: %d\n", cnt);
		System.out.println("==for문을 통해 다시 진행==");
		
		cnt = 0;
		
		for(int i = 1; i <= 3; i ++) {  // i = i + 1  → i += 1;
			cnt += i ;
			System.out.printf("i: %d, cnt: %d\n", i, cnt);
		}
		System.out.println("==for문 종료==");
		
//		1~10까지 임의의 값을 출력하는 것을 10번 출력하는데 for문으로 확인

		int randomValue = 0;
		for(int i = 1; i <= 5; i ++) {
			randomValue = 0;
			randomValue += + (int)(Math.random() * 10) + 1;
			System.out.printf("i: %d, randomValue: %d\n", i, randomValue);
		}
		System.out.println("sum:" + randomValue);
		System.out.println("==for문 종료==");
		
//		
	}
}