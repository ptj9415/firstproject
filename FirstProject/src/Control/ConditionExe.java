package Control;

public class ConditionExe {
	public static void main(String[] args) {
//		두 정수를 담기 위한 변수를 선언하여 60, 70 값 만들기

		int num1 = 60;
		int num2 = 70;
		int result = num1 + num2;
		int multiple = num1 * num2;

//		두 수를 합한 결과가 100점이 넘으면 합격 (1번 문제)
		if (result >= 100) {
			System.out.println("합격\n");
		} else 
			System.out.println("불합격\n");

//		두 수를 곱해서 짝수이면 짝수입니다, 홀수이면 홀수입니다 출력 (2번 문제)
		if (multiple % 2 == 0) {
			System.out.println("짝수입니다");
		} else 
			System.out.println("홀수입니다.");
		System.out.println("2번 끝\n");

//		2와 3의 배수, 2의 배수, 3의 배수출력 (3번 문제)
		int num3 = 7;
		if (num3 % 6 == 0) {
			System.out.println("2와 3의 배수입니다.");
		} else if (num3 % 2 == 0) {
			System.out.println("2의 배수입니다.");
		} else if (num3 % 3 == 0) {
			System.out.println("3의 배수입니다.");
		} else
			System.out.println("2의 배수도 3의 배수도 아닙니다.");
		System.out.println("3번 끝\n");
		
//		1~6이 출력되는 변수를 생성하고 그 수를 출력하기 (4번 문제)
		int randomValue = (int)(Math.random() * 6) + 1;
		System.out.println(randomValue);
		
		switch(randomValue) {
		case 1 :
			System.out.println("1입니다.");
			break;
		case 2 :
			System.out.println("2입니다.");
			break;
		case 3 :
			System.out.println("3입니다.");
			break;
		case 4 :
			System.out.println("4입니다.");
			break;
		case 5 :
			System.out.println("5입니다.");
			break;
		case 6 :
			System.out.println("6입니다.");
		}
		System.out.println("4번 끝\n");
		
//		1~100이 출력되는 변수를 하나 만들고 학점 계산하기 (5번 문제)
		int randomScore = (int)(Math.random() * 100);
		System.out.println(randomScore);
		if(randomScore >= 90) {
			System.out.println("A학점");
		} else if (randomScore >= 80) {
			System.out.println("B학점");
		} else if (randomScore >= 70) {
			System.out.println("C학점");
		} else if (randomScore >= 60) {
		} else System.out.println("넌 실패야");
		System.out.println("5번 끝\n");
	}	
}
