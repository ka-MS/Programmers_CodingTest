package Level1;

public class 자연수뒤집어배열로만들기 {

	public static void main(String[] args) {
		// 자연수 n을 뒤집어 각 자리 숫자를 원소로 가지는 배열 형태로 리턴해주세요. 예를들어 n이 12345이면 [5,4,3,2,1]을 리턴합니다.
		long n = 12345;
		String num = String.valueOf(n);
		int[] answer = new int[num.length()];
		
		for(int i = 0; i < answer.length; i++) {
			answer[i] = (int) (n%10);
			n = n/10;
		}
		System.out.println(answer[0]);

	}

}
