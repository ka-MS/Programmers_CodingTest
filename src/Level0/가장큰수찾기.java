package Level0;

public class 가장큰수찾기 {

	public static void main(String[] args) {
		// 정수 배열 array가 매개변수로 주어질 때, 가장 큰 수와 그 수의 인덱스를 담은 배열을 return 하도록 solution 함수를
		// 완성해보세요.
		
		int[] array = {1, 8, 3};
		int[] answer = new int[2];
		int max = 0;
		for(int i = 0 ; i<array.length ; i++) {
			if(max < array[i]) {
				max = array[i];
				answer[0] = array[i];
				answer[1] = i;
			}
		}
		System.out.println(answer[0] + "," + answer[1]);
	}

}
