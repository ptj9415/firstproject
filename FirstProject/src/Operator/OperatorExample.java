package Operator;

public class OperatorExample {
	public static void main(String[] args) {
		
//		연산자(Operator)란 +, -, *, /, %, &, |, ^, ~ 을 의미
//		연산자는 기본적으로 int로 변환하여 계산됨
		
		int num1, num2, result;
		num1 = 10;
		num2 = 5;
		result = num1 * num2; // 할당(대입)연산자 = 오른쪽 처리 결과를 왼쪽에 담겠다.
		result = -result;
		System.out.println(result);
		System.out.printf("- 연산결과는 %d\n", result);
		System.out.println();

		result = num1 % 3;
		System.out.println(result);
		System.out.printf("연산결과는 %d\n", result);
		System.out.println();
		
		result = num1 & num2;
		System.out.println(result);
		System.out.printf("& 연산결과는 %d\n", result);
		System.out.println();
		
		result = num1 | num2;
		System.out.println(result);
		System.out.printf("| 연산결과는 %d\n", result);
		System.out.println();
		
		result = num1 ^ num2;
		System.out.println(result);
		System.out.printf("^ 연산결과는 %d\n", result);
		System.out.println();
		
		result = ~ num1;
		System.out.println(result);
		System.out.printf("~ 연산결과는 %d\n", result);
		System.out.println();

		String a1 = Integer.toBinaryString(num1);
		String a2 = Integer.toOctalString(num1);
		String a3 = Integer.toHexString(num1);
		System.out.println("5의 2진수 변환값은 " + a1);
		System.out.println("5의 8진수 변환값은 " + a2);
		System.out.println("5의 16진수 변환값은 " + a3);
		System.out.println();
				
		String b1 = Integer.toBinaryString(num2);
		String b2 = Integer.toOctalString(num2);
		String b3 = Integer.toHexString(num2);
		System.out.println("10의 2진수 변환값은 " + b1);
		System.out.println("10의 8진수 변환값은 " + b2);
		System.out.println("10의 16진수 변환값은 " + b3);
		System.out.println();
		
//		>>, <<<, >>> (비트연산자: 비트를 부등호 방향으로 밀어버림)
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
