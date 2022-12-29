package Level0;

public class 팩토리얼 {

	public static void main(String[] args) {
		// i 팩토리얼 (i!)은 1부터 i까지 정수의 곱을 의미합니다. 예를들어 5! = 5 * 4 * 3 * 2 * 1 = 120 입니다. 정수
		// n이 주어질 때 다음 조건을 만족하는 가장 큰 정수 i를 return 하도록 solution 함수를 완성해주세요.
		int n = 7;
		int answer = 0;
		int i = 1;
		while(n >= i) {
			answer++;
			i = answer*i;
			if(i == n) {
				break;
			}else if(i > n) {
				answer = answer -1;
				break;
			}
		}
		System.out.println(answer);
	}

}
