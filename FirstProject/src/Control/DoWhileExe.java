package Control;

public class DoWhileExe {
	public static void main(String[] args) {
		
		boolean run = false;
		
//		do while 구문을 통해 1 ~ 10 출력
		int num1 = 0;
		do {
			System.out.println(num1);
			num1 ++;
			if(num1 > 10)
				break;
		}
		while (true);
		System.out.println("문제1 끝\n");

		
		
		int num2 = 0;
		do {
			num2 ++;
			if(num2 % 2 == 1) 
			continue;
			System.out.println(num2);
		}
		while (num2 < 11);
		System.out.println("문제2 끝\n");
		
		int num3 = 0;
		int sum1 = 0;
		do {
			num3 ++;
			if(num3 % 2 == 0) 
				continue;
			sum1 = sum1 + num3;
			
		}
		while(num3 < 10);
		System.out.println(sum1);
		System.out.println("문제3 끝");
		
		int num4 = (int)(Math.random() * 10) + 1; // 1~10까지의 무작위 수 생성
		int sum2 = 0; // num4를 더한 값
		int count = 0; // num4를 몇번 더했는지 확인할 수 있는 값
		while (sum2 > 100)
			sum2 = sum2 + num4;
			System.out.println(sum2);
			System.out.printf("총 시행 횟수는 %d 번입니다.", count);
		
	}
}