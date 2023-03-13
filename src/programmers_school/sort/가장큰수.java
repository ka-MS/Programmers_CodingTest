package programmers_school.sort;

import java.util.*;

public class 가장큰수 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numbers = { 9,90,2};
		System.out.println(solution(numbers));;
		
		System.out.println("909".compareTo("990"));
	}

	public static String solution(int[] numbers){
		String[] list = new String[numbers.length];
		for (int i = 0; i < numbers.length; i++) {
			list[i] = numbers[i]+"";
		}
		
		Arrays.sort(list,Collections.reverseOrder());
		String answer = "";
		for(String k : list) {
			System.out.println(k.indexOf("0"));
		}
		for(int i = list.length-1; i >= 0;i--) {
			answer += list[i];
		}
		return answer;
	}

}
