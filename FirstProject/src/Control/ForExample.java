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
		System.out.println("==for���� ���� �ٽ� ����==");
		
		cnt = 0;
		
		for(int i = 1; i <= 3; i ++) {  // i = i + 1  �� i += 1;
			cnt += i ;
			System.out.printf("i: %d, cnt: %d\n", i, cnt);
		}
		System.out.println("==for�� ����==");
		
//		1~10���� ������ ���� ����ϴ� ���� 10�� ����ϴµ� for������ Ȯ��

		int randomValue = 0;
		for(int i = 1; i <= 5; i ++) {
			randomValue = 0;
			randomValue += + (int)(Math.random() * 10) + 1;
			System.out.printf("i: %d, randomValue: %d\n", i, randomValue);
		}
		System.out.println("sum:" + randomValue);
		System.out.println("==for�� ����==");
		
//		
	}
}