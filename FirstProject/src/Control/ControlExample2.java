package Control;

public class ControlExample2 {

	public static void main(String[] args) {
		String inputValue = "B";
		
		switch(inputValue) {
		case "A": 
			System.out.println("�� ���߽��ϴ�");
			break; // switch ������ �׸��ϰ� ���������Բ� �ϴ� ����
		case "B": 
			System.out.println("���߽��ϴ�");
			break;
		case "C": 
			System.out.println("�����Դϴ�");
			break;
		case "D": 
			System.out.println("����ϼ���");
			break;
		default: // if���� else�� �ش� 
			System.out.println("�Ǹ��Դϴ�");
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
