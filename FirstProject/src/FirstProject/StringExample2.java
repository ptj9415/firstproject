package FirstProject;

public class StringExample2 {
	
	public static void main(String[] args) {
	
		String name = "������";
		int age = 28;
		System.out.println("�̸��� " + name + ", ���̴� " + age);
		System.out.printf("�̸��� %s, ���̴� %d\n", name, age);
		
		byte b1 = -90;
		byte b2 = 10;
		byte result = (byte)(b1 + b2);
		System.out.println(b1 + " + " + b2 + " = " + result);
		
//		�� �Ǵ� ������ ���� �� �ִ� ���� isLarger ����
		
		boolean isLarger = result > 5;
		if(isLarger) System.out.println("����Դϴ�");
		else System.out.println("�����Դϴ�");
		
		long number = 2200000000L;
		int number2 = 120;
		int number3 = 16;
		double Avg = (double) number2 / number3;
		System.out.println(Avg);
		
		long Result = number + number2 + number3;
		double Avg2 = Result / 3;
		System.out.println(Avg2);
		
		
	}
	
}
