package Control;

public class DoWhileExample {
	public static void main(String[] args) {

//		while 구문
		boolean run = false;

		while (run) {
			System.out.println("실행문1");
		}

//		dowhile 구문 = do 안에 있는 내용을 한번 실행하고 나서 while 구문 작동(잘안씀)
		int cnt = 0;

		do {
			System.out.println(cnt);
			cnt++;
			if(cnt >= 10) {
				break;
			}
//			System.out.println("실행문2");
		} while (true);
		System.out.println("실행문 2 끝\n");
		
		int cnt1 = 0;
		
		do {
			cnt1++;
			if (cnt1 % 2 == 1) {
				continue; // 해당 조건에 해당할 경우 아래 구문을 skip
			}
			System.out.println(cnt1);
		} while(cnt1 <= 4);
		System.out.println("실행문 3 끝");
		

	}
}