package Control;

public class WhileExe {
	public static void main(String[] args) {

// while ������ ����Ͽ� 1 ~ 10 ���� ���
		int num1 = 0;
		while(num1 < 10) {
			num1 ++;
			System.out.println(num1);
		}
		System.out.println("����1 ��");
		
//		while ������ ����Ͽ� ¦�� ���
		int num2 = 0;
		while(num2 < 10) {
			num2 ++;
			if (num2 % 2 == 0) {
				System.out.println(num2);
			}
		}
		System.out.println("����2 ��");
		
//		while ������ ����Ͽ� Ȧ�� ���
		int num3 = 0;
		while(num3 < 10) {
			num3 ++;
			if (num3 % 2 == 1) {
				System.out.println(num3);
			}
		}
		System.out.println("����3 ��");
		
//		while ������ �̿��Ͽ� 1 ~ 10 ������ �� ���
		int num4 = 0;
		int sum1 = 0;
		while(num4 <= 10) {
			sum1 = sum1 + num4;
			num4 ++;
		}
		System.out.println("�հ�: " + sum1);
		System.out.println("����4 ��");
		
		
	}
}
