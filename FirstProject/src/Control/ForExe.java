package Control;

public class ForExe {

	public static void main(String[] args) {
//		���� 1) 1 ~ 10 ���
		for (int i = 1; i <= 10; i++) {
			System.out.println(i + " ");
		}
		System.out.println("����1 ��\n");

//		���� 2) 1 ~ 10 �� ¦���� ���
		for (int i = 1; i <= 10; i++) {
			if (i % 2 == 0) {
				System.out.println(i);
			}
		}
		System.out.println("����2 ��\n");

//		����3) 1 ~ 10 �� Ȧ���� ���
		for (int i = 1; i <= 10; i++) {
			if (i % 2 == 1) {
				System.out.println(i);
			}
		}
		System.out.println("����3 ��\n");

//		����4) 1 ~ 10�� �� ���
		int sum1 = 0;
		for (int i = 1; i <= 10; i++) {
			sum1 = sum1 + i;
		}
		System.out.printf("1���� 10������ ���� %s �Դϴ�.\n", sum1);
		System.out.println("����4 ��");
	}

}
