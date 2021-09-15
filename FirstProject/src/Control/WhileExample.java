package Control;

public class WhileExample {
	public static void main(String[] args) {

		int i = 1;
		while (i <= 10) {
			System.out.println("i의 값은 " + i);
			i++;
		}
		
		boolean run = true;
		int cnt = 0;
		while(run) {
			cnt = (int)(Math.random() * 10) + 1;
			System.out.println(cnt);
			if(cnt == 8) {
				run = false;
			}
		}
		System.out.println("끝");
		
	}
}