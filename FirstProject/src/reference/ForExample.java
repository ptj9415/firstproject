package reference;

public class ForExample {

	public static void main(String[] args) {
//		�� �ȿ����� ������ ��ȿ��!!
		{
			int i = 0;
			int j = 0;
		}
		{
			int i = 5;
			int j = 10;
		}
		for(int i=1; i<=10; i++) {
			System.out.println(i);
		}
		System.out.println("1�� ��");
		
		for(int i=1; i<=10; i++) {
			if(i % 2 == 0)
				System.out.println(i);			
		}
		System.out.println("2�� ��");
		
		int sum = 0;
		for(int i = 1; i <= 10; i++) {
			if(i % 2 == 1) {
				sum = sum + i;
			}
		}
		System.out.println(sum);
		System.out.println("3�� ��");
		
		sum = 0;
		int count = 0;
		for(int c = 1; c <=10; c++) {
			sum = sum + c;
			if(sum >= 20) {
				count = c;
				break;
			}
		}
		System.out.println(count + "ȸ �ݺ��߰� " + "����" + sum);

	}

}
