package Level0;

public class 최댓값만들기2 {

	public static void main(String[] args) {
		// 정수 배열 numbers가 매개변수로 주어집니다. numbers의 원소 중 두 개를 곱해 만들 수 있는 최댓값을 return하도록
		// solution 함수를 완성해주세요.
		
		int[] numbers = {-500 , 2};
		int answer = 0;
		
		for(int i = 0; i<numbers.length ; i++) {
			for(int k = 0; k<numbers.length;k++ ) {
				if(i != k) {
					if(numbers[i]*numbers[k] > answer) {
						answer = numbers[i]*numbers[k];
					}
					
				}
			}
		}
		if(numbers.length == 2) {
			answer = numbers[0]*numbers[1];
		}
		System.out.println(answer);
			
	}

}
