package reference;

public class MethodExample2 {

	public static void main(String[] args) {
		int a = 45, b = 33;
		sum(24, 55);
		multi(24,25);
		getArea(3.5);
		int res = getMax(a,b);
		double abc = divide(5,3);
	
		System.out.println("ū ���� " + res);
		System.out.println("����� " + abc);

	}

//	�� ������ �Է¹޾Ƽ� ���� ���

	public static void sum(int n1, int n2) {
		int sum = n1 + n2;
		System.out.println("�� ���� ���� " + sum);
	}
	
//	�� ������ �Է¹޾Ƽ� ���� ���
	
	public static void multi(int m1, int m2) {
		int multi = m1 * m2;
		System.out.println("�� ���� ���� " + multi);
	}
	
//	���簢�� �ʺ� ���
	public static void getArea(double side) {
		double side1 = side * side;
		System.out.println("���簢���� �ʺ�� " + side1);
	}
	
//	�� �� �߿��� ū ���� ��ȯ���ִ� �޼ҵ�
	public static int getMax(int a1, int a2) {
		int result = (a1 >= a2) ? a1 : a2;
		return result;		
		
	}
	
//	�� ���� �Է¹޾� ù��° ������ �ι�° ���� ���� ���
	public static double divide(int b1, int b2) {
		double devide = (double)b1 / b2;
		return devide;
		
	}
}
