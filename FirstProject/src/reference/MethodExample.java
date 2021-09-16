package reference;

public class MethodExample {

	public static void main(String[] args) {
//		비만도 계산공식
//		double bmi = weight / (height * height) ;
//		bmi < 18.5 이면 저체중
//		18.5 ~ 23 정상
//		23 ~ 25 과체중
//		25 ~ 30 비만
//		30 ~ 고도비만
		double w1 = 72.4, h1 = 1.5;
		checkBMI(w1, h1);
		double w2 = 67.1, h2 = 163.1; // 두번째사람
		checkBMI(w2, h2);
		checkBMI(194.2, 181.9);

	}

	public static void checkBMI(double weight, double height) {
		double bmi = weight / (height * height);
		if (bmi < 18.5) {
			System.out.println("저체중");
		} else if (bmi >= 18.5 && bmi < 23) {
			System.out.println("정상");
		} else if (bmi >= 23 && bmi < 25) {
			System.out.println("과체중");
		} else if (bmi >= 25 && bmi < 30) {
			System.out.println("비만");
		} else if (bmi >= 30) {
			System.out.println("고도비만");
		}
	}

}
