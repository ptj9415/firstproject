package Control;

public class DoWhileExample {
	public static void main(String[] args) {

//		while ����
		boolean run = false;

		while (run) {
			System.out.println("���๮1");
		}

//		dowhile ���� = do �ȿ� �ִ� ������ �ѹ� �����ϰ� ���� while ���� �۵�(�߾Ⱦ�)
		int cnt = 0;

		do {
			System.out.println(cnt);
			cnt++;
			if(cnt >= 10) {
				break;
			}
//			System.out.println("���๮2");
		} while (true);
		System.out.println("���๮ 2 ��\n");
		
		int cnt1 = 0;
		
		do {
			cnt1++;
			if (cnt1 % 2 == 1) {
				continue; // �ش� ���ǿ� �ش��� ��� �Ʒ� ������ skip
			}
			System.out.println(cnt1);
		} while(cnt1 <= 4);
		System.out.println("���๮ 3 ��");
		

	}
}