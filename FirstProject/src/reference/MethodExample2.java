package reference;

public class MethodExample2 {

	public static void main(String[] args) {
		int a = 45, b = 33;
		sum(24, 55);
		multi(24,25);
		getArea(3.5);
		int res = getMax(a,b);
		double abc = divide(5,3);
	
		System.out.println("큰 수는 " + res);
		System.out.println("결과는 " + abc);

	}

//	두 정수를 입력받아서 합을 출력

	public static void sum(int n1, int n2) {
		int sum = n1 + n2;
		System.out.println("두 수의 합은 " + sum);
	}
	
//	두 정수를 입력받아서 곱을 출력
	
	public static void multi(int m1, int m2) {
		int multi = m1 * m2;
		System.out.println("두 수의 곱은 " + multi);
	}
	
//	정사각형 너비를 계산
	public static void getArea(double side) {
		double side1 = side * side;
		System.out.println("정사각형의 너비는 " + side1);
	}
	
//	두 수 중에서 큰 값을 반환해주는 메소드
	public static int getMax(int a1, int a2) {
		int result = (a1 >= a2) ? a1 : a2;
		return result;		
		
	}
	
//	두 수를 입력받아 첫번째 수에서 두번째 수를 나눈 결과
	public static double divide(int b1, int b2) {
		double devide = (double)b1 / b2;
		return devide;
		
	}
}
