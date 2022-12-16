package Level0;

public class 세균증식 {

	public static void main(String[] args) {
		// 어떤 세균은 1시간에 두배만큼 증식한다고 합니다. 처음 세균의 마리수 n과 경과한 시간 t가 매개변수로 주어질 때 t시간 후 세균의 수를
		// return하도록 solution 함수를 완성해주세요.
		int n = 7;
		int t = 10;
		int answer = n;
		for (int i = 0; i < t; i++) {
			answer = answer * 2;
		}
		System.out.println(answer);

		// << : 피연산자의 비트열을 왼쪽으로 이동시키며 이동에 따른 빈공간은 0으로 채움.
		//>> : 피연산자의 비트열을 오른쪽으로 이동시키며, 이동에 따른 빈공간은 음수의경우엔 1, 양수의 경우엔 0으로 채움.
		//>>> : 피연산자의 비트열을 오른쪽으로 이동시키며, 이동에 따른 빈공간은 0으로 채움.
		
		System.out.println(n << t);

	}

}
