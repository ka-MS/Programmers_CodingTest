package programmers_school.sort;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class 가장큰수 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numbers = { 9,8,80,0};
		System.out.println(solution2(numbers));;
		
//		System.out.println("909".compareTo("990"));
	}

	public static String solution(int[] numbers){
		String[] list = new String[numbers.length];
		for (int i = 0; i < numbers.length; i++) {
			list[i] = numbers[i]+"";
		}
		
		Arrays.sort(list, new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) { // 둘을 비교 o2를 기준으로 비교하면 내림차순 o1기준이면 오름차순
				return (o2+o1).compareTo(o1+o2); // 둘을 더해서 비교한 값을 내림차순으로 정렬
			}
		});
		StringBuilder sb = new StringBuilder();
		for(String str : list) {
			sb.append(str);
		}
		String answer = list[0].equals("0") ? "0"  : new String(sb);
		return new String(answer);
	}

	public static String solution2(int[] numbers){
		String answer = IntStream.of(numbers)
				.mapToObj(String::valueOf) //string배열로 변환
				.sorted((s1, s2) -> (s2+s1).compareTo(s1+s2)) //값 비교
				.collect(Collectors.joining());
		if(answer.startsWith("0")){
			answer = "0";
		}
		return answer;
	}

}
