package reference;

public class MethodExample {

	public static void main(String[] args) {
//		�񸸵� ������
//		double bmi = weight / (height * height) ;
//		bmi < 18.5 �̸� ��ü��
//		18.5 ~ 23 ����
//		23 ~ 25 ��ü��
//		25 ~ 30 ��
//		30 ~ ����
		double w1 = 72.4, h1 = 1.5;
		checkBMI(w1, h1);
		double w2 = 67.1, h2 = 163.1; // �ι�°���
		checkBMI(w2, h2);
		checkBMI(194.2, 181.9);

	}

	public static void checkBMI(double weight, double height) {
		double bmi = weight / (height * height);
		if (bmi < 18.5) {
			System.out.println("��ü��");
		} else if (bmi >= 18.5 && bmi < 23) {
			System.out.println("����");
		} else if (bmi >= 23 && bmi < 25) {
			System.out.println("��ü��");
		} else if (bmi >= 25 && bmi < 30) {
			System.out.println("��");
		} else if (bmi >= 30) {
			System.out.println("����");
		}
	}

}
