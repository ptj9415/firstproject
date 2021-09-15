package Operator;

public class OperatorExample {
	public static void main(String[] args) {
		
//		������(Operator)�� +, -, *, /, %, &, |, ^, ~ �� �ǹ�
//		�����ڴ� �⺻������ int�� ��ȯ�Ͽ� ����
		
		int num1, num2, result;
		num1 = 10;
		num2 = 5;
		result = num1 * num2; // �Ҵ�(����)������ = ������ ó�� ����� ���ʿ� ��ڴ�.
		result = -result;
		System.out.println(result);
		System.out.printf("- �������� %d\n", result);
		System.out.println();

		result = num1 % 3;
		System.out.println(result);
		System.out.printf("�������� %d\n", result);
		System.out.println();
		
		result = num1 & num2;
		System.out.println(result);
		System.out.printf("& �������� %d\n", result);
		System.out.println();
		
		result = num1 | num2;
		System.out.println(result);
		System.out.printf("| �������� %d\n", result);
		System.out.println();
		
		result = num1 ^ num2;
		System.out.println(result);
		System.out.printf("^ �������� %d\n", result);
		System.out.println();
		
		result = ~ num1;
		System.out.println(result);
		System.out.printf("~ �������� %d\n", result);
		System.out.println();

		String a1 = Integer.toBinaryString(num1);
		String a2 = Integer.toOctalString(num1);
		String a3 = Integer.toHexString(num1);
		System.out.println("5�� 2���� ��ȯ���� " + a1);
		System.out.println("5�� 8���� ��ȯ���� " + a2);
		System.out.println("5�� 16���� ��ȯ���� " + a3);
		System.out.println();
				
		String b1 = Integer.toBinaryString(num2);
		String b2 = Integer.toOctalString(num2);
		String b3 = Integer.toHexString(num2);
		System.out.println("10�� 2���� ��ȯ���� " + b1);
		System.out.println("10�� 8���� ��ȯ���� " + b2);
		System.out.println("10�� 16���� ��ȯ���� " + b3);
		System.out.println();
		
//		>>, <<<, >>> (��Ʈ������: ��Ʈ�� �ε�ȣ �������� �о����)
		result = num1 >> 2;
		System.out.println(result);
		System.out.println();
		
//		&&, ||, !
		boolean c1 = false;
		boolean c2 = !c1;
		boolean c3 = c1 || c2;
		System.out.printf("c3 : %s, c1: %s, c2: %s", c3, c1, c2); 
		System.out.println();
		
		
		
	}

}
