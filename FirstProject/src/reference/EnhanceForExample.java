package reference;

public class EnhanceForExample {

	public static void main(String[] args) {
		String[] strAry = null;
		strAry = new String[5];
		strAry = new String[] { "hong", "park", "choi", "kim", "hwang" };
		System.out.println("배열의 수는 " + strAry.length);

		System.out.println("배열 값이 hong인 경우만 출력");
		strAry[2] = "hong";
		for (int i = 0; i < strAry.length; i++) {
			if (strAry[i].equals("hong"))
				System.out.println(strAry[i]);
		}
		System.out.println("끝");
		
		for (String str : strAry) { // 배열에 들어있는 만큼 반복하겠다
			System.out.println(str);
		}
		
		
		int[] scores = {50, 70, 80, 60};
		int sum = 0;
		for(int score : scores) {
			sum = sum + score;
		}
		System.out.println(sum);
		System.out.println("끝");
		
//		학생 세명의 점수 (4.2 3.5 2.8)
		double[] score = {4.2, 3.5, 2.8};
		double sum1 = 0;
		double avg = 0;
		for (double score1 : score) {
			sum1 = sum1 + score1;
		}
		avg = sum1 / 3;
		System.out.println("세 학생 점수의 평균은 " + avg + "입니다.");
	}

}
