package FirstProject;

import java.util.Scanner;

public class ScannerExample2 {
	public static void main(String[] args) {
//		변수: 사용자 입력(10, 20)
		Scanner scn = new Scanner(System.in);
		System.out.println("첫번째 값을 입력하세요.");
		int first = scn.nextInt();
		
		System.out.println("두번째 값을 입력하세요.");
		int second = scn.nextInt();
		
		System.out.println(first + " + " + second + " = " + (first+second));
//		10 + 20 = 30
		
		
				
	}
}
