package Control;

public class ControlExample2 {

	public static void main(String[] args) {
		String inputValue = "B";
		
		switch(inputValue) {
		case "A": 
			System.out.println("참 잘했습니다");
			break; // switch 구문을 그만하고 빠져나오게끔 하는 역할
		case "B": 
			System.out.println("잘했습니다");
			break;
		case "C": 
			System.out.println("보통입니다");
			break;
		case "D": 
			System.out.println("노력하세요");
			break;
		default: // if문의 else에 해당 
			System.out.println("실망입니다");
		}
		
		switch(inputValue) {
		case "A", "B", "C":
			System.out.println("Pass");
			break;
		case "D":
			System.out.println("retry");
		default:
			System.out.println("Fail");
		}

	}

}
