package reference;

public class MethodExample3 {

	public static void main(String[] args) {

		int[] intAry = { 30, 40, 50, 60, 70 };
		int sum = 0;
		double avg = 0;
//		for(int num1 = 0; num1 < intAry.length; num1++)
		for (int num : intAry) {
			sum = sum + num;
		}
		System.out.println("��1: " + sum);
		System.out.println("���2: " + avg1);
		sum = 0;
		int[] intAry2 = { 30, 40 };
		sum = sumArray(intAry2);
		System.out.println("��2: " + sum);
		System.out.println("���2: " + avg1);
	}

//	�迭�� �Ű��������� �հ�
	public static int sumArray(int[] intAry) {
		int sum = 0;
		for (int num : intAry) {
			sum = sum + num;
		}
		return sum;
	}

//	�迭�� �Ű������� �Ͽ� ��� ���ϱ� avgArray()
	public static double avgArray(int[] intAry) {
		double avg1 = 0;
		int sum = sum + Array(intAry);
		double avg = sum
		for (double avg = 0; avg < intAry.length; avg++) {
//		for (double avg : intAry) { �� ����
			avg1 = intAry[] / 5;
		}
		return avg1;
	}
}
