package reference;

import java.util.Scanner;

public class MainExecute {

	public static void main(String[] args) {
//		1. 학생 수 지정 2. 학생 이름 입력받음 3. 리스트 출력 4. 종료
		
		String[] names = null;
		while (true) {
			menu();
			int choice = readInt("번호를 선택하세요 >>");

			if (choice == 1) { // 학생 수 지정
				int size = numberStudent();
				names = new String[size];
			
			} else if (choice == 2) { // 학생 이름 입력
				inputName(names);

			} else if (choice == 3) { // 학생 리스트 출력
				showName(names);

			} else if (choice == 4) { // 종료
				break;
			}
		}
		System.out.println("끝!");
	}

	public static void menu() { // 메뉴
		System.out.println("1. 학생 수 지정, 2. 학생 이름 입력, 3. 리스트 출력, 4. 종료");
	}

	public static int numberStudent() { // 1번
		int a = readInt("학생 수를 입력하세요.");
		return a;
	}

	public static void inputName(String[] ary) { // 2번
		if(ary == null ) {
			return;
		}
		for (int i = 0; i<ary.length; i++) {
			ary[i] = readString("학생 이름을 입력하세요");
		}
		
		
	}

	public static void showName(String[] ary) { // 3번
		if(ary == null ) {
			return;
		}
		for (int i = 0; i <ary.length; i++) { 
			System.out.printf("%d번째 학생: %s\n", i, ary[i]);
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