package Control;

public class DoWhileExe {
	public static void main(String[] args) {
		
		boolean run = false;
		
//		do while ������ ���� 1 ~ 10 ���
		int num1 = 0;
		do {
			System.out.println(num1);
			num1 ++;
			if(num1 > 10)
				break;
		}
		while (true);
		System.out.println("����1 ��\n");

		
		
		int num2 = 0;
		do {
			num2 ++;
			if(num2 % 2 == 1) 
			continue;
			System.out.println(num2);
		}
		while (num2 < 11);
		System.out.println("����2 ��\n");
		
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
		System.out.println("����3 ��");
		
		int num4 = (int)(Math.random() * 10) + 1; // 1~10������ ������ �� ����
		int sum2 = 0; // num4�� ���� ��
		int count = 0; // num4�� ��� ���ߴ��� Ȯ���� �� �ִ� ��
		while (sum2 > 100)
			sum2 = sum2 + num4;
			System.out.println(sum2);
			System.out.printf("�� ���� Ƚ���� %d ���Դϴ�.", count);
		
	}
}