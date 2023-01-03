package Level0;

public class 칠의개수 {

	public static void main(String[] args) {
		// 머쓱이는 행운의 숫자 7을 가장 좋아합니다. 정수 배열 array가 매개변수로 주어질 때, 7이 총 몇 개 있는지 return 하도록
		// solution 함수를 완성해보세요.
		
		int[] array = {7,77,17};
		int answer = 0;
		String arr = "";
		for(int i : array) {
			arr += i+"";
		}
		answer = arr.length() - arr.replace("7", "").length();
		
		System.out.println(answer);
	}

}
