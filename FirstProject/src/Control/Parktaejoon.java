package Control;

import java.util.Scanner;

public class Parktaejoon {

	public static void main(String[] args) {
//		if ������ for/while ������ ����Ͽ� ���� ����

		int num = 0;
		System.out.println("���� �����ϴ� ���� �����ϱ��?");
		Scanner scn = new Scanner(System.in);
		do {
			num = scn.nextInt();
			if (num < 72) {
				System.out.println(num + "���� ū ���Դϴ�.");
			}
			if (num > 72) {
				System.out.println(num + "���� ���� ���Դϴ�.");
			}
		} while (num != 72);
		System.out.println("�����Դϴ�.");
	}
}
