
public class VariableExample2 {

	public static void main(String[] args) {
//		이름, 나이, 참/거짓
		String name = "박태준";
		int age = 15;
		int My_age = 21;
		
//		age <= 나이 => 25세 이상.
//		age >= 나이 => 25세 이하.
		if(age <= My_age) System.out.println(name + "은 25세 이상입니다.");
		if(age >= My_age) System.out.println(name + "은 25세 이하입니다.");
		System.out.println("end of program.");

	}

}
