package Level0;

public class K의개수 {

	public static void main(String[] args) {
		// 1부터 13까지의 수에서, 1은 1, 10, 11, 12, 13 이렇게 총 6번 등장합니다. 정수 i, j, k가 매개변수로 주어질 때,
		// i부터 j까지 k가 몇 번 등장하는지 return 하도록 solution 함수를 완성해주세요.
		int i = 10;
		int j = 50;
		int k = 5;
		int answer =0;
		
		for(int u = i; u <= j ; u++) {
			String num = u+"";
			answer += num.length() - num.replace(k+"", "").length();
		}
		System.out.println(answer);
		

	}

}
