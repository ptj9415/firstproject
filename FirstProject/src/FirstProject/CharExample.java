package FirstProject;

public class CharExample {
	public static void main(String[] args) {

//		1byte < char, short (2byte) < int(4byte)
//		1byte = 8bit = 256���� ����(-128 ~ 127)
//		short = 2byte = 16bit (-32768 ~ 32767)
//		int = 4byte = 32bit (-21�� ~ 21��)
		
		char myFirstCharType = 97;
		System.out.println(myFirstCharType);
		byte b1 = 10;
		b1 = 127;
		b1++;
		System.out.println(b1);
		
		Short s1 = 0;
		Short result = (short)(b1 + s1);
		
//	�⺻ ������ �ϴ� ���� �⺻������ �ڷ����� int������ �ٲ�� ��
//	���� short�� int���� ����� ���� �� ����
		
		System.out.println(Short.MAX_VALUE);
		
		long fakeLong = 2147483648L;
			
		
	}
}
