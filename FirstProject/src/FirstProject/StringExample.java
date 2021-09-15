package FirstProject;

public class StringExample {

	public static void main(String[] args) {
		
//		byte < short < int < long < float < double
		
		int age = 28;
		String name = "박태준";
		
		long myAge = age; // 자동형변환(promotion)
		age = (int) myAge; // 강제형변환(casting)
		
//		age = "홍길동";
//		name = 20;
		
		System.out.println(name + "의 나이는 " + age);

	}

}
