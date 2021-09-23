package reference;

import java.util.Scanner;

public class MainExecute {

	public static void main(String[] args) {
//		1. �л� �� ���� 2. �л� �̸� �Է¹��� 3. ����Ʈ ��� 4. ����
		
		String[] names = null;
		while (true) {
			menu();
			int choice = readInt("��ȣ�� �����ϼ��� >>");

			if (choice == 1) { // �л� �� ����
				int size = numberStudent();
				names = new String[size];
			
			} else if (choice == 2) { // �л� �̸� �Է�
				inputName(names);

			} else if (choice == 3) { // �л� ����Ʈ ���
				showName(names);

			} else if (choice == 4) { // ����
				break;
			}
		}
		System.out.println("��!");
	}

	public static void menu() { // �޴�
		System.out.println("1. �л� �� ����, 2. �л� �̸� �Է�, 3. ����Ʈ ���, 4. ����");
	}

	public static int numberStudent() { // 1��
		int a = readInt("�л� ���� �Է��ϼ���.");
		return a;
	}

	public static void inputName(String[] ary) { // 2��
		if(ary == null ) {
			return;
		}
		for (int i = 0; i<ary.length; i++) {
			ary[i] = readString("�л� �̸��� �Է��ϼ���");
		}
		
		
	}

	public static void showName(String[] ary) { // 3��
		if(ary == null ) {
			return;
		}
		for (int i = 0; i <ary.length; i++) { 
			System.out.printf("%d��° �л�: %s\n", i, ary[i]);
		}
		
	}

	public static int readInt(String a) {
		Scanner scn = new Scanner(System.in);
		System.out.println(a);
		int menu = scn.nextInt();
		return menu;
	}
	public static String readString(String a) {
		Scanner scn = new Scanner(System.in);
		System.out.println(a);
		String b  = scn.nextLine();
		return b;
	}

}