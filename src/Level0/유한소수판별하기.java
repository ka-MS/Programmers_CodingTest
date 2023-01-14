package Level0;

public class 유한소수판별하기 {

	public static void main(String[] args) {
		// 소수점 아래 숫자가 계속되지 않고 유한개인 소수를 유한소수라고 합니다. 분수를 소수로 고칠 때 유한소수로 나타낼 수 있는 분수인지 판별하려고 합니다. 유한소수가 되기 위한 분수의 조건은 다음과 같습니다.
		// 기약분수로 나타내었을 때, 분모의 소인수가 2와 5만 존재해야 합니다.
		// 두 정수 a와 b가 매개변수로 주어질 때, a/b가 유한소수이면 1을, 무한소수라면 2를 return하도록 solution 함수를 완성해주세요.

		int a = 3500;
		int b = 500;
		int answer = 1;
		int min = Math.min(a, b);
		int in = 1;
		for(int i = 1; i <= min ; i++) {
			if(a % i == 0 && b % i == 0) {
				in = Math.max(i, in);
			}
		}
		int b2 = b/in;
		for(int i = 2; i<=b/in ;i++) {
			if(i == 2 || i == 5) {
				while(b2%i == 0) {
					b2 = b2/i;
					answer = 1;
				}
			}else if(b2%i == 0){
				answer = 2;
			}
		}
		if(a%b == 0){
			answer = 1;
		}
		System.out.println(answer);
			
	}

}
