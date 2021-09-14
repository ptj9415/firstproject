package FirstProject;

import java.util.Scanner;

public class ScannerExample3 {
		public static void main(String[] args) {

//		영어점수입력:
//		수학점수입력:
//		이름입력:
//		홍길동님의 영어, 수학 점수의 합은 ?, 평균은 ? 입니다. (printf사용)
		
		Scanner scn = new Scanner(System.in);
		System.out.println("영어 점수를 입력하세요.");
		int engScore = scn.nextInt();
		
		System.out.println("수학 점수를 입력하세요.");
		int mathScore = scn.nextInt();
		scn.nextLine();
		
		System.out.println("이름을 입력하세요.");
		String name = scn.nextLine();
		
		double s2 = ((engScore + mathScore)/2);
		int s1 = (engScore + mathScore);
		
		System.out.printf("%s 님의 영어, 수학 점수의 합은 %d, 평균은 %f 입니다.", name, s1, s2);
		System.out.println();
		
		
		if(s1 <= 120)
		System.out.println("불합격입니다.");
		if(s1 > 120)
		System.out.println("합격입니다.");

		
		}
}
