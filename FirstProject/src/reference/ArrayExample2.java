package reference;

public class ArrayExample2 {

	public static void main(String[] args) {
//		1 ~ 10���� ������ �� ����
//		�л� 10���� �ִٰ� ����
//		�迭���� scores
		int scores[] = new int[10];
//		System.out.println(scores.length);
		for (int i = 0; i < scores.length; i++) {
			int temp = (int) (Math.random() * 10) + 1;
			System.out.println(scores[i] = temp);
		}
		System.out.println("��");
		for (int i = 0, l = scores.length; i < l; i++) {
			System.out.printf("scores[%d] �� %d\n", i, scores[i]);
		}
		System.out.println("��");

		int sum = 0;
//		�迭�� �հ�: ���Դϴ�.
		for (int i = 0; i < scores.length; i++) {
			sum = sum + scores[i];
		}
		System.out.println("�迭�� �հ�� " + sum + "�Դϴ�.");
		System.out.println("��");

		sum = 0;
		for (int i = 0; i < scores.length; i++) {
			if (scores[i] > 5) {
				sum = sum + scores[i];
			}
		}
		System.out.println("�迭�� �հ�� " + sum + "�Դϴ�.");
		System.out.println("��");
		
		sum = 0;
		for (int i = 0; i < scores.length; i++ ) {
			if (i % 2 == 0 ) {
				sum = sum + scores[i];
			} else if (i == 0) {
				sum = sum + scores[i];
			}
		}
		System.out.println("¦�� �迭�� �հ�� " + sum + "�Դϴ�.");

	}

}
