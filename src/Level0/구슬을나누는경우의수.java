package Level0;

import java.math.BigInteger;

public class 구슬을나누는경우의수 {

	public static void main(String[] args) {
		구슬을나누는경우의수 bl = new 구슬을나누는경우의수();
		// 머쓱이는 구슬을 친구들에게 나누어주려고 합니다. 구슬은 모두 다르게 생겼습니다. 머쓱이가 갖고 있는 구슬의 개수 balls와 친구들에게
		// 나누어 줄 구슬 개수 share이 매개변수로 주어질 때, balls개의 구슬 중 share개의 구슬을 고르는 가능한 모든 경우의 수를
		// return 하는 solution 함수를 완성해주세요.
		// https://gangdor.tistory.com/m/38
		// https://copro505.tistory.com/entry/%EA%B5%AC%EC%8A%AC%EC%9D%84-%EB%82%98%EB%88%84%EB%8A%94-%EA%B2%BD%EC%9A%B0%EC%9D%98-%EC%88%98
		// 다시보기
		int balls = 30;
		int share = 10;
		int answer = 0;
		BigInteger a = new BigInteger("0");
		// n!/(n-m)!m!  경우의수 공식
		// 재귀함수 팩토리얼 사용
		a = bl.fact(balls).divide(bl.fact(balls -share).multiply(bl.fact(share)));
//				/(bl.fact(balls -share)*bl.fact(share));
		System.out.println(a);
		answer = a.intValue();
		

	}
	
	
	
	// 팩토리얼 재귀함수
	public BigInteger fact(int n) {
		BigInteger a = new BigInteger(n+"");
		BigInteger c = new BigInteger("0");
		if(n <=1 ) {
			return new BigInteger(1+"");
		}else {
			c = fact(n-1).multiply(a);
			return c;
		}
	}
	
	// 간단 재귀 풀이 곱하기와 나눗샘을 동시에 처리함 
	// balls의 30 ->20 까지는 share의 20 -> 10 까지와 나눔
	// 그 다음부터는 9,9,8,8,7,7,6,6,5,5,4,4,3,3,2,2 이렇게 나눌것임
	public long solution(int balls, int share) {
        share = Math.min(balls - share, share);

        if (share == 0)
            return 1;

        long result = solution(balls - 1, share - 1);
        result *= balls;
        result /= share;

        return result;
    }
	
	// DFS알고리즘으로 재작성 하기
	
	
}
