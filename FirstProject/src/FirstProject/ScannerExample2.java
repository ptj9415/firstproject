package FirstProject;

import java.util.Scanner;

public class ScannerExample2 {
	public static void main(String[] args) {
//		����: ����� �Է�(10, 20)
		Scanner scn = new Scanner(System.in);
		System.out.println("ù��° ���� �Է��ϼ���.");
		int first = scn.nextInt();
		
		System.out.println("�ι�° ���� �Է��ϼ���.");
		int second = scn.nextInt();
		
		System.out.println(first + " + " + second + " = " + (first+second));
//		10 + 20 = 30
		
		
				
	}
}
