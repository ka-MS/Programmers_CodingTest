package Level0;

import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class Ư�������� {

	public static void main(String[] args) {
		// ���� n�� �������� n�� ����� ������ �����Ϸ��� �մϴ�. �̶� n���κ����� �Ÿ��� ���ٸ� �� ū ���� �տ� ������ ��ġ�մϴ�. ������
		// ��� �迭 numlist�� ���� n�� �־��� �� numlist�� ���Ҹ� n���κ��� ����� ������� ������ �迭�� return�ϵ���
		// solution �Լ��� �ϼ����ּ���.
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
