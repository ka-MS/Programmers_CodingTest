package Level0;

public class 이차원으로만들기 {

	public static void main(String[] args) {
		// 정수 배열 num_list와 정수 n이 매개변수로 주어집니다. num_list를 다음 설명과 같이 2차원 배열로 바꿔 return하도록
		// solution 함수를 완성해주세요.
		// num_list가 [1, 2, 3, 4, 5, 6, 7, 8] 로 길이가 8이고 n이 2이므로 num_list를 2 * 4 배열로 다음과
		// 같이 변경합니다. 2차원으로 바꿀 때에는 num_list의 원소들을 앞에서부터 n개씩 나눠 2차원 배열로 변경합니다.
		// [1, 2, 3, 4, 5, 6, 7, 8]	2	[[1, 2], [3, 4], [5, 6], [7, 8]]
		int[] num_list = {1, 2, 3, 4, 5, 6, 7, 8};
		int n = 2;
		int j = 0;
		int[][] answer = new int[num_list.length/n][n];
		
//		for(int i = 0; i<num_list.length/n ; i++) {
//			for(int k = 0; k<n ; k++) {
//				answer[i][k] = num_list[j];
//				j++;
//			}
//		}
		
		// 참고) 나눗샘을 이용하여 for문을 한번만 돌리기 
		for(int i = 0; i<num_list.length ; i++) {
			answer[i/n][i%n] = num_list[i];
		}
		
		for(int i = 0; i<num_list.length/n ; i++) {
			System.out.print("[");
			for(int k = 0; k<n ; k++) {
				if(k == n-1) {
					System.out.print(answer[i][k]);
				}else {
					System.out.print(answer[i][k] + ",");
				}
				
			}
			System.out.print("]");
		}
		
	}

}
