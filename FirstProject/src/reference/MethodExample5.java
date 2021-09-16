package reference;

public class MethodExample5 {

	public static void main(String[] args) {
		int[] scores = {88, 67, 92, 73, 58};
//		1. 제일 작은 값을 가져오는것 만들어보기
		int min = 0;
//		boolean isTrue = false;
//		isTrue = min > scores[i];			
		
		min = Integer.MAX_VALUE;
//		for(int i = 0; i < scores.length; i++) {
		for(int i : scores) {
			if(min > scores[i]) {
				min = scores[i];
			}
		}
		System.out.println(min);
			
		}
	
	
	public static int getMinValue(int[] ary) {
		
		return 0;
	}

}
