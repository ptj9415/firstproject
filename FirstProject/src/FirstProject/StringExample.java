package FirstProject;

public class StringExample {

	public static void main(String[] args) {
		
//		byte < short < int < long < float < double
		
		int age = 28;
		String name = "������";
		
		long myAge = age; // �ڵ�����ȯ(promotion)
		age = (int) myAge; // ��������ȯ(casting)
		
//		age = "ȫ�浿";
//		name = 20;
		
		System.out.println(name + "�� ���̴� " + age);

	}

}