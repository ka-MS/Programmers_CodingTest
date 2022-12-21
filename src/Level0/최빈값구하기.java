package Level0;

import java.util.HashMap;
import java.util.Map;

public class 최빈값구하기 {

	public static void main(String[] args) {
		// 최빈값은 주어진 값 중에서 가장 자주 나오는 값을 의미합니다. 정수 배열 array가 매개변수로 주어질 때, 최빈값을 return 하도록
		// solution 함수를 완성해보세요. 최빈값이 여러 개면 -1을 return 합니다.
		int[] array = {1,1,2,3,4,4,5,5,5,6,1};
		int answer = 0;
		int count = 0;
		int controll = -1;
		int last = 0;
		for(int i = 0; i<array.length ; i++) {
			count = 0;
			for(int j = 0; j<array.length; j++) {
				if(controll == array[i]) {
					break;
				}
				if(array[i] == array[j]) {
					count++;
				}
			}
			if(controll != array[i]) {
				if(count > answer) {
					answer = count;
					controll = array[i];
					last = 0;
				}else if(count == answer) {
					last = 1;
				}
			}
			
		}
		if(last == 1) {
			answer = -1;
		}else {
			answer = controll;
		}
		System.out.println(answer);
		
		//Map으로 다시 풀이
		
		int maxCount = 0;
        answer = 0;
        count = 0;

        Map<Integer, Integer> map = new HashMap<>();

        // getOrDefault : 찾는 키가 존재한다면 찾는 키의 값을 반환하고 없다면 기본 값을 반환하는 메서드
        // getPrDefault(Object key, V DefaultValue)
        // 매개변수 : 이 메서드는 두개의 매개변수를 허용
        // key : 값을 가져와야 하는 요소의 키
        // defaultValue : 지정된 키로 매핑된 값이 없는 경우 반환되어야 하는 기본값
        // 반환값 : 찾는 key가 존재하면 해당 key에 매핑되어 있는 값을 반환하고, 그렇지 않으면 디폴트 값이 반환

        for(int number : array) {
            count = map.getOrDefault(number, 0) + 1;

            if(count > maxCount) {
                maxCount = count;
                answer = number;
            }

            else if(count == maxCount) {
                answer = -1;
            }

            map.put(number, count);
        }

        System.out.println(answer);
	}
}
