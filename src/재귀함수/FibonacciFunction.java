package 재귀함수;

public class FibonacciFunction {
	// 피보나치란? 수열 종류중 하나로
	// 1 1 2 3 5 8 13... 처럼 숫자와 그 앞에있는 숫자를 더한것을 나열하는 것 이다.

	public static void main(String[] args) {
		int n = 2;

		for (int i = 1; i <= n; i++) {// 피보나치 수열 출력
			System.out.print("{");
			System.out.println( "} "+i+ "번 : " + Fibonacci(i) );
		}
	}

	// 피보나치 수열의 결과를 구하는 메소드
	public static int Fibonacci(int n) {
		if (n <= 1) {
			return n;
		}
		else
			return Fibonacci(n - 1) + Fibonacci(n - 2);
	}
	
	

}
