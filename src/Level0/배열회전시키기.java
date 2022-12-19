package Level0;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class 배열회전시키기 {

	public static void main(String[] args) {
		// 정수가 담긴 배열 numbers와 문자열 direction가 매개변수로 주어집니다. 배열 numbers의 원소를 direction방향으로
		// 한 칸씩 회전시킨 배열을 return하도록 solution 함수를 완성해주세요.
		int[] numbers = {4, 455, 6, 4, -1, 45, 6};
		String direction = "left";
		int[] answer = new int[numbers.length];
		int length = numbers.length;
		for(int i = 0; i < length ; i++) {
			switch(direction) {
			case "left":
				answer[i] = i == length-1 ? numbers[0] : numbers[i+1];
				break;
			case "right":
				answer[i] = i == 0 ? numbers[length-1] : numbers[i-1];
				break;
			}
			System.out.print(answer[i] +",");
		}
		
		//stream 사용 
		List<Integer> list = Arrays.stream(numbers).boxed().collect(Collectors.toList());

        if (direction.equals("right")) {
            list.add(0, list.get(list.size() - 1));
            list.remove(list.size() - 1);
        } else {
            list.add(list.size(), list.get(0));
            list.remove(0);
        }
        answer = list.stream().mapToInt(Integer::intValue).toArray();
	}

}
