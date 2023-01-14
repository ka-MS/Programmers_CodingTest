package Level0;

import java.util.Deque;
import java.util.LinkedList;

public class 문자열밀기 {

	public static void main(String[] args) {
		// 문자열 "hello"에서 각 문자를 오른쪽으로 한 칸씩 밀고 마지막 문자는 맨 앞으로 이동시키면 "ohell"이 됩니다. 이것을 문자열을
		// 민다고 정의한다면 문자열 A와 B가 매개변수로 주어질 때, A를 밀어서 B가 될 수 있다면 밀어야 하는 최소 횟수를 return하고 밀어서
		// B가 될 수 없으면 -1을 return 하도록 solution 함수를 완성해보세요.
		
		String A = "apple";
		String B = "elppa";
		int answer = 0;
		Deque<String> arr = new LinkedList<String>();
		for(String st : A.split(""))arr.add(st);
		while(!B.equals(String.join("", arr))) {
			arr.addFirst(arr.pollLast());
			answer++;
			if(answer > arr.size()) {
				answer = -1; 
				break;
			}
		}
		
		System.out.println(answer);
		
		// 미친풀이... java11부터는 repeat() 메소드 사용 가능
		String result = B+B;
		System.out.println(result.indexOf(A));
	}

}
