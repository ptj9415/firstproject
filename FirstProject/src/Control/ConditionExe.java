package Control;

public class ConditionExe {
	public static void main(String[] args) {
//		�� ������ ��� ���� ������ �����Ͽ� 60, 70 �� �����

		int num1 = 60;
		int num2 = 70;
		int result = num1 + num2;
		int multiple = num1 * num2;

//		�� ���� ���� ����� 100���� ������ �հ� (1�� ����)
		if (result >= 100) {
			System.out.println("�հ�\n");
		} else 
			System.out.println("���հ�\n");

//		�� ���� ���ؼ� ¦���̸� ¦���Դϴ�, Ȧ���̸� Ȧ���Դϴ� ��� (2�� ����)
		if (multiple % 2 == 0) {
			System.out.println("¦���Դϴ�");
		} else 
			System.out.println("Ȧ���Դϴ�.");
		System.out.println("2�� ��\n");

//		2�� 3�� ���, 2�� ���, 3�� ������ (3�� ����)
		int num3 = 7;
		if (num3 % 6 == 0) {
			System.out.println("2�� 3�� ����Դϴ�.");
		} else if (num3 % 2 == 0) {
			System.out.println("2�� ����Դϴ�.");
		} else if (num3 % 3 == 0) {
			System.out.println("3�� ����Դϴ�.");
		} else
			System.out.println("2�� ����� 3�� ����� �ƴմϴ�.");
		System.out.println("3�� ��\n");
		
//		1~6�� ��µǴ� ������ �����ϰ� �� ���� ����ϱ� (4�� ����)
		int randomValue = (int)(Math.random() * 6) + 1;
		System.out.println(randomValue);
		
		switch(randomValue) {
		case 1 :
			System.out.println("1�Դϴ�.");
			break;
		case 2 :
			System.out.println("2�Դϴ�.");
			break;
		case 3 :
			System.out.println("3�Դϴ�.");
			break;
		case 4 :
			System.out.println("4�Դϴ�.");
			break;
		case 5 :
			System.out.println("5�Դϴ�.");
			break;
		case 6 :
			System.out.println("6�Դϴ�.");
		}
		System.out.println("4�� ��\n");
		
//		1~100�� ��µǴ� ������ �ϳ� ����� ���� ����ϱ� (5�� ����)
		int randomScore = (int)(Math.random() * 100);
		System.out.println(randomScore);
		if(randomScore >= 90) {
			System.out.println("A����");
		} else if (randomScore >= 80) {
			System.out.println("B����");
		} else if (randomScore >= 70) {
			System.out.println("C����");
		} else if (randomScore >= 60) {
		} else System.out.println("�� ���о�");
		System.out.println("5�� ��\n");
	}	
}
