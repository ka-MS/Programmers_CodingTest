package Level1;

public class 자릿수더하기 {

	public static void main(String[] args) {
		// 자연수 N이 주어지면, N의 각 자릿수의 합을 구해서 return 하는 solution 함수를 만들어 주세요.
		// 예를들어 N = 123이면 1 + 2 + 3 = 6을 return 하면 됩니다.
		int n = 123;
		int answer = 0;
		String[] arr = (n+"").split("");
//		for(String i : arr) {
//			answer += Integer.parseInt(i);
//		}
		
		// 빅오로 생각해보자 위식과 아래식은 엄청난 실행시간 차이가 난다
		while(n != 0) {
			answer += n%10;
			n = n/10;
		}
		System.out.println(answer);
	}

}
