package FirstProject;

public class DoubleExample {

	public static void main(String[] args) {

//		double(8byte)
//		float(4byte)
		
		double d1 = 3.1;
		double d2 = 6.9;
		double r1 = d1 + d2;
		System.out.println(r1);

		float f1 = 3.2f;
		d1 = d2 = 2.3;
		boolean isSame = d1 == d2;
		System.out.println(isSame);
		
		String s1 = "Hello";
		String s2 = new String("Hello");
		isSame = s1.equals(s2);
		System.out.println(isSame);
		
		String s3 = "abc";
		String s4 = "abcd";
		boolean A = s3 == s4;
		System.out.println(A);
	}

}
