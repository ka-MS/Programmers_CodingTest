package Level0;

public class 자릿수더하기 {

	public static void main(String[] args) {
		// 정수 n이 매개변수로 주어질 때 n의 각 자리 숫자의 합을 return하도록 solution 함수를 완성해주세요
		int n = 1234993;
		String check = n + "";
		int result = 0;
		for (int i = 0; i < 10; i++) {
			int k = check.length();
			if (check.contains(i + "")) {
				check = check.replace(i + "", "");
				result += i * (k - (check.length()));
			}
		}
		System.out.println(result);
		//while을 이용한 방법
		result =0;
		while(n>0) {
			result += n%10;
			n = n/10;
		}
		System.out.println(result);
	}

}
