package FirstProject;
import java.util.Scanner;

public class Parktaejoon {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("�̸��� �����ΰ���?");
		String name = scn.nextLine();
		
		System.out.println("��°��� ����ΰ���?");
		String home =scn.nextLine();
		
		System.out.println("����ΰ���?");
		int age = scn.nextInt();
		scn.nextLine();
		
		System.out.printf("���� %s�� ��� %d���� %s�Դϴ�.", home, age, name);
//		�ּ�ó���Դϴ�.

	}

}
