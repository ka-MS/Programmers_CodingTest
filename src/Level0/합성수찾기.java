package Level0;

public class 합성수찾기 {

	public static void main(String[] args) {
		// 약수의 개수가 세 개 이상인 수를 합성수라고 합니다. 자연수 n이 매개변수로 주어질 때 n이하의 합성수의 개수를 return하도록
		// solution 함수를 완성해주세요.
		int n = 15;
		int answer = 0;
		for (int i = 1; i <= n; i++) {
			int j = 0;
			for (int k = 1; k <= n; k++) {
				if(i%k == 0) {
					j++;
				}
			}
			if(j >= 3) {
				answer++;
			}
		}
		System.out.println(answer);

	}

}
