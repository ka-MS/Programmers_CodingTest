package Level0;

public class 가까운수 {

	public static void main(String[] args) {
		// 정수 배열 array와 정수 n이 매개변수로 주어질 때, array에 들어있는 정수 중 n과 가장 가까운 수를 return 하도록
		// solution 함수를 완성해주세요.
		
		int[] array = {11,8,12};
		int n = 10;
		int answer = 0;
		int check=1000000000;
		for(int i = 0; i<array.length ; i++) {
			if(check > Math.abs(n - array[i])) {
				check = Math.abs(n - array[i]);
				answer = array[i];
			}else if(check == Math.abs(n - array[i])) {
				check = Math.abs(n - array[i]);
				answer = Math.min(answer, array[i]);
//				answer = answer < array[i] ? answer : array[i];
			}
		}
		System.out.println(answer);

	}

}
