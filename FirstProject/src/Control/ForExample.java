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
		
		for(int i = 1; i <= 4; i++) {
			cnt += 1;
			System.out.printf("cnt: %d\n", cnt);
		}
		System.out.println("==for�� ����==");
	}

}
