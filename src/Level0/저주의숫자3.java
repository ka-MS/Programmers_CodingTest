package Level0;

public class 저주의숫자3 {

	public static void main(String[] args) {
		// 3x 마을 사람들은 3을 저주의 숫자라고 생각하기 때문에 3의 배수와 숫자 3을 사용하지 않습니다. 3x 마을 사람들의 숫자는 다음과 같습니다.
		//10진법	3x 마을에서 쓰는 숫자	10진법	3x 마을에서 쓰는 숫자
		//1	1	6	8
		//2	2	7	10
		//3	4	8	11
		//4	5	9	14
		//5	7	10	16
		//정수 n이 매개변수로 주어질 때, n을 3x 마을에서 사용하는 숫자로 바꿔 return하도록 solution 함수를 완성해주세요.
		int n = 40;
		int answer = 0;
		for(int i = 0; i < n ; i++) {
			answer++;
			while(answer % 3 == 0 || String.valueOf(answer).indexOf("3") != -1) {
				answer++;
			}
		}
		System.out.println(answer);
	}

}
