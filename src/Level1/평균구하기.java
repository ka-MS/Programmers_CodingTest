package Level1;

public class 평균구하기 {

	public static void main(String[] args) {
		// 정수를 담고 있는 배열 arr의 평균값을 return하는 함수, solution을 완성해보세요.
		int[] arr = {1,2,3,4};
		double answer =0;
		for(int i : arr) {
			answer += i;
		}
		answer = answer/arr.length;
		System.out.println(answer);
	}

}
