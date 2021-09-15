package Control;

import java.util.Scanner;
import java.lang.String; // lang 패키지에 있는 클래스는 모두 설정이 되어있다고 생각하면 됨

public class WhileExample2 {
	public static void main(String[] args) {
		String name = "박태준";
		String age = "28";
		String phone = "010-5008-2740";
		
//		사용자의 입력값에 따라 리턴값을 다르게 하는 것
		Scanner scn = new Scanner(System.in);
		while(true) {
			System.out.println("메뉴를 선택하세요.");
			System.out.println("1. 이름 // 2. 나이 // 03. 연락처 // 4. 종료");
			int menu = scn.nextInt();
			if(menu == 1) {
				System.out.println("이름은 " + name);
			} else if (menu == 2) {
				System.out.println("나이는" + age);
			} else if (menu == 3) {
				System.out.println("연락처는 " + phone);
			} else if (menu == 4) {
				System.out.println("종료");
				break;
			}
		}
		
	}
}