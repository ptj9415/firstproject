package reference;

import java.util.Scanner;

public class AppMain {

	public static void main(String[] args) {
//		학생 점수를 생성하여 분석

//		학생 인원 지정, 지정된 인원 만큼 학생 점수를 설정, 점수 리스트 출력
//		평균, 최고점, 최저점, 종료

		int[] scores = null;
		while (true) {
			showMenu();
			int choice = readInt("번호를 선택하세요>>");

			if (choice == 1) {
				int size = createStudent();
				scores = new int[size];

			} else if (choice == 2) {
				inputValue(scores);

			} else if (choice == 3) {
				showList(scores);

			} else if (choice == 4) {
				analysis(scores);

			} else if (choice == 5) {
				break;
			}
		}
		System.out.println("끝");
	}

	public static void showMenu() {
		System.out.println("1. 학생인원 지정, 2. 학생 점수, 3. 전체 리스트, 4. 분석:평균및  최고점, 5. 종료");
	}

	public static int createStudent() {
		int cnt = readInt("학생수를 입력하세요.");
		return cnt;

	}

	public static void inputValue(int[] ary) {
		if (ary == null) {
			return;
		}
		for (int i = 0; i < ary.length; i++) {
			ary[i] = readInt("학생 점수를 입력하세요.");
		}
	}

	

	public static void showList(int[] ary) {
		if (ary == null) {
			return;
		}
		for (int i = 0; i < ary.length; i++) {
			System.out.printf("scores[%d] → %d\n", i, ary[i]);
		}

	}

	public static void analysis(int[] ary) {
		if (ary == null) {
			return;
		}
//		평균, 최고점 → 콘솔
		int sum = 0;
		int max = 0;
		for (int i = 0; i < ary.length; i++) {
			sum = sum + ary[i];
			if (max < ary[i]) {
				max = ary[i];
			}
		}
		double avg = (double) sum / ary.length;
		System.out.println("학생 점수의 평균은 " + avg + ", 최고점은 " + max + "입니다.");
	}

	public static int readInt(String msg) {
		Scanner scn = new Scanner(System.in);
		System.out.println(msg);
		int menu = scn.nextInt();
		return menu;

	}

}
