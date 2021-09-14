package FirstProject;
import java.util.Scanner;

public class Parktaejoon {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("이름이 무엇인가요?");
		String name = scn.nextLine();
		
		System.out.println("사는곳이 어디인가요?");
		String home =scn.nextLine();
		
		System.out.println("몇살인가요?");
		int age = scn.nextInt();
		scn.nextLine();
		
		System.out.printf("저는 %s에 살고 %d살인 %s입니다.", home, age, name);
//		주석처리입니다.

	}

}
