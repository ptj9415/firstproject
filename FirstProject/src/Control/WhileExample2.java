package Control;

import java.util.Scanner;
import java.lang.String; // lang ��Ű���� �ִ� Ŭ������ ��� ������ �Ǿ��ִٰ� �����ϸ� ��

public class WhileExample2 {
	public static void main(String[] args) {
		String name = "������";
		String age = "28";
		String phone = "010-5008-2740";
		
//		������� �Է°��� ���� ���ϰ��� �ٸ��� �ϴ� ��
		Scanner scn = new Scanner(System.in);
		while(true) {
			System.out.println("�޴��� �����ϼ���.");
			System.out.println("1. �̸� // 2. ���� // 03. ����ó // 4. ����");
			int menu = scn.nextInt();
			if(menu == 1) {
				System.out.println("�̸��� " + name);
			} else if (menu == 2) {
				System.out.println("���̴�" + age);
			} else if (menu == 3) {
				System.out.println("����ó�� " + phone);
			} else if (menu == 4) {
				System.out.println("����");
				break;
			}
		}
		
	}
}