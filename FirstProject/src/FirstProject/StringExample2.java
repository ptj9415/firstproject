package FirstProject;

public class StringExample2 {
	
	public static void main(String[] args) {
	
		String name = "박태준";
		int age = 28;
		System.out.println("이름은 " + name + ", 나이는 " + age);
		System.out.printf("이름은 %s, 나이는 %d\n", name, age);
		
		byte b1 = -90;
		byte b2 = 10;
		byte result = (byte)(b1 + b2);
		System.out.println(b1 + " + " + b2 + " = " + result);
		
//		참 또는 거짓을 담을 수 있는 변수 isLarger 선언
		
		boolean isLarger = result > 5;
		if(isLarger) System.out.println("양수입니다");
		else System.out.println("음수입니다");
		
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
