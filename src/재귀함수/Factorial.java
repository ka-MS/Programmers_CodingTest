package 재귀함수;

public class Factorial {
	// 재귀함수란 함수내에서 자기자신을 계속 재참조하면서 풀어가는 방식이다.
	// 함수가 콜되면 차근차근 stack에 계속해서 데이터를 쌓게된다.
	// 스텍은 후입선출구조로 가장나중에 쌓인 데이터부터 실행된다.
	// 처음 불려진 함수에서 리턴되는 값이 최종 리턴값이된다.
	// 반복문은 재귀함수로 재귀함수는 반복문으로 변환 가능하다
	// 재귀함수에는 팩토리얼 이진탐색트리 피보나치수열등 여러가지가 있음
	
	public static void main(String[] args) {
		int input = 4; //4!을 구할것
		System.out.println(fact(input));
	}
	
	public static int fact(int input) {
		if( input<=1) { 
			return input;
		}else {
			return fact(input-1)*input; //인풋값이 1이 올때까지 계속해서 실행된다
		}
	}
	// stack overflow? 만약 input <=1 이라는 조건이 빠진다면 함수는 어떻게 될까?
	// 1에서 멈추지않고 -1-2-3..-n까지 무한루프에 빠지게 된다.
	// 보통 호출 스택은 제한된 양의 주소공간을 이루며 프로그램 시작시 결정된다.
	// 호출 가능한 공간 이상을 사용하는 경우 stackoverflowerror에러가 발생하게된다.
	
	// 재귀함수를 쓰지 말고 stack을 이용해서 구현해 보자
	
	/* 실행 순서
	 * 1. fact(4)가 실행이 되면 input이 1보다 크므로 fact(3)을 호출하고 함수는 fact(4)를 stack에 쌓는다
	 * stack = [fact(4)]
	 * 2. fact(3) input은 현재 3이다 1보다 크므로 fact(2)를 호출하고 fact(3)은 stack에 쌓인다
	 * stack = [fact(4),fact(3)]
	 * 3. fact(2) input은 현재2 1보다 크므로 fact(1)을 호출하고 fact(2)를 stack에 쌓는다
	 * stack = [fact(4),fact(3),fact(2)]
	 * 4. fact(1) input은 현재 1이므로 1을 return 한다.
	 * 5. fact(1)이 종료되면서 stack의 가장위에있는 fact(2)가 실행된다.
	 * 6. fact(2)는 1*2 를 리턴한다
	 * stack = [fact(4),fact(3)]
	 * 7. fact(3)이 실행된다. 위에서 리턴받은 1*2를 input값인 3을 곱한 6을 리턴한다 1*2*3
	 * stack = [fact(4)] 
	 * 8. 마지막으로 fact(4)가 실행된다 7번에서 리턴받은 6과 input값인 4를 곱하고 종료될것 1*2*3*4
	 * 결론 : 1*2*3*4 -> 4! 순서로 실행된다
	 * stack 형태로 데이터를 처리해 팩토리얼을 구할 수 있었다.
	 */
	
}
