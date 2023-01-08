package Level0;

public class 종이자르기 {
	public static void main(String[] args) {
		// 머쓱이는 큰 종이를 1 x 1 크기로 자르려고 합니다. 예를 들어 2 x 2 크기의 종이를 1 x 1 크기로 자르려면 최소 가위질 세
		// 번이 필요합니다.
		int M = 2;
		int N = 3;
		int answer = 0;
		
		answer = (M-1)+(M*(N-1));
		System.out.println(answer);
		
	}
}
