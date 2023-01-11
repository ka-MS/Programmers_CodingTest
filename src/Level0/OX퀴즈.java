package Level0;

import java.util.ArrayList;
import java.util.List;

public class OX퀴즈 {

	public static void main(String[] args) {
		// 덧셈, 뺄셈 수식들이 'X [연산자] Y = Z' 형태로 들어있는 문자열 배열 quiz가 매개변수로 주어집니다. 수식이 옳다면 "O"를
		// 틀리다면 "X"를 순서대로 담은 배열을 return하도록 solution 함수를 완성해주세요.
		String[] quiz = {"19 - 6 = 13", "5 + 6 = 11"};
		String[] answer = new String[quiz.length];
		String[][] arr = new String[quiz.length][5];
		for(int i = 0; i< quiz.length; i++) {
			arr[i] = quiz[i].split(" ");
		}
		for(int i = 0; i < arr.length; i++) {
			if(arr[i][1].equals("-")) {
				answer[i] = Integer.parseInt(arr[i][0])-Integer.parseInt(arr[i][2]) == Integer.parseInt(arr[i][4]) ? "O":"X";
			}else {
				answer[i] = Integer.parseInt(arr[i][0])+Integer.parseInt(arr[i][2]) == Integer.parseInt(arr[i][4]) ? "O":"X";
			}
		}
		
		// 위보다 아래가 메모리를 아주약간 적게잡아먹고 속도도 아주약간 빠르다 0.13 -> 0.11ms 74mb -> 72mb 
		// 객체는 아래가 더 많이 생성하는거같은데 왜그런지 모르겠다 
		// 2중배열이 메모리를 더 많이 잡아먹는걸까?
		// 1차원배열 arr[5] 2번 < 2차원 배열 arr[2][5] 1번
		
		for(int i = 0; i < quiz.length; i++) {
			String[] arr2 = quiz[i].split(" ");
			if(arr2[1].equals("-")) {
				answer[i] = Integer.parseInt(arr2[0])-Integer.parseInt(arr2[2]) == Integer.parseInt(arr2[4]) ? "O":"X";
			}else {
				answer[i] = Integer.parseInt(arr2[0])+Integer.parseInt(arr2[2]) == Integer.parseInt(arr2[4]) ? "O":"X";
			}
		}
		System.out.println(answer[0] );
	}

}
