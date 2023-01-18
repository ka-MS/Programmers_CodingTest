package Level0;

import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class 특이한정렬 {

	public static void main(String[] args) {
		// 정수 n을 기준으로 n과 가까운 수부터 정렬하려고 합니다. 이때 n으로부터의 거리가 같다면 더 큰 수를 앞에 오도록 배치합니다. 정수가
		// 담긴 배열 numlist와 정수 n이 주어질 때 numlist의 원소를 n으로부터 가까운 순서대로 정렬한 배열을 return하도록
		// solution 함수를 완성해주세요.
		int[] numlist = {1, 2, 3, 4, 5, 6};
		int n = 4;
		int[] answer = new int[numlist.length];
		Map<Integer, Integer> arr = new HashMap<Integer, Integer>();
		for(int i = 0; i < numlist.length ; i++) {
			arr.put(numlist[i], Math.abs(numlist[i] - n));
		}
		List<Map.Entry<Integer,Integer>> entry = new LinkedList<Map.Entry<Integer,Integer>>(arr.entrySet());
		entry.sort(new Comparator<Map.Entry<Integer, Integer>>() {
		    @Override
		    public int compare(Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2) {
		    	System.out.println(o2);
		    	if(o1.getValue() - o2.getValue() == 0) {
		    		return o2.getValue() - o1.getValue();
		    	}
			return o1.getValue() - o2.getValue();
		    }
		});
		System.out.println(entry);
		for(int i = 0; i < numlist.length ; i++) {
			answer[i] = entry.get(i).getKey();
			System.out.println(answer[i]);
		}
		
		
		
		

	}

}
