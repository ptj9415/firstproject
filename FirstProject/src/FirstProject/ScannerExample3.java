package FirstProject;

import java.util.Scanner;

public class ScannerExample3 {
		public static void main(String[] args) {

//		���������Է�:
//		���������Է�:
//		�̸��Է�:
//		ȫ�浿���� ����, ���� ������ ���� ?, ����� ? �Դϴ�. (printf���)
		
		Scanner scn = new Scanner(System.in);
		System.out.println("���� ������ �Է��ϼ���.");
		int engScore = scn.nextInt();
		
		System.out.println("���� ������ �Է��ϼ���.");
		int mathScore = scn.nextInt();
		scn.nextLine();
		
		System.out.println("�̸��� �Է��ϼ���.");
		String name = scn.nextLine();
		
		double s2 = ((engScore + mathScore)/2);
		int s1 = (engScore + mathScore);
		
		System.out.printf("%s ���� ����, ���� ������ ���� %d, ����� %f �Դϴ�.", name, s1, s2);
		System.out.println();
		
		
		if(s1 <= 120)
		System.out.println("���հ��Դϴ�.");
		if(s1 > 120)
		System.out.println("�հ��Դϴ�.");

		
		}
}
