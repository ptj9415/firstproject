package reference;

import java.util.Scanner;

public class AppMain {

	public static void main(String[] args) {
//		�л� ������ �����Ͽ� �м�

//		�л� �ο� ����, ������ �ο� ��ŭ �л� ������ ����, ���� ����Ʈ ���
//		���, �ְ���, ������, ����

		int[] scores = null;
		while (true) {
			showMenu();
			int choice = readInt("��ȣ�� �����ϼ���>>");

			if (choice == 1) {
				int size = createStudent();
				scores = new int[size];

			} else if (choice == 2) {
				inputValue(scores);

			} else if (choice == 3) {
				showList(scores);

			} else if (choice == 4) {
				analysis(scores);

			} else if (choice == 5) {
				break;
			}
		}
		System.out.println("��");
	}

	public static void showMenu() {
		System.out.println("1. �л��ο� ����, 2. �л� ����, 3. ��ü ����Ʈ, 4. �м�:��չ�  �ְ���, 5. ����");
	}

	public static int createStudent() {
		int cnt = readInt("�л����� �Է��ϼ���.");
		return cnt;

	}

	public static void inputValue(int[] ary) {
		if (ary == null) {
			return;
		}
		for (int i = 0; i < ary.length; i++) {
			ary[i] = readInt("�л� ������ �Է��ϼ���.");
		}
	}

	

	public static void showList(int[] ary) {
		if (ary == null) {
			return;
		}
		for (int i = 0; i < ary.length; i++) {
			System.out.printf("scores[%d] �� %d\n", i, ary[i]);
		}

	}

	public static void analysis(int[] ary) {
		if (ary == null) {
			return;
		}
//		���, �ְ��� �� �ܼ�
		int sum = 0;
		int max = 0;
		for (int i = 0; i < ary.length; i++) {
			sum = sum + ary[i];
			if (max < ary[i]) {
				max = ary[i];
			}
		}
		double avg = (double) sum / ary.length;
		System.out.println("�л� ������ ����� " + avg + ", �ְ����� " + max + "�Դϴ�.");
	}

	public static int readInt(String msg) {
		Scanner scn = new Scanner(System.in);
		System.out.println(msg);
		int menu = scn.nextInt();
		return menu;

	}

}
