package Level0;

import java.util.Deque;
import java.util.LinkedList;

public class ���ڿ��б� {

	public static void main(String[] args) {
		// ���ڿ� "hello"���� �� ���ڸ� ���������� �� ĭ�� �а� ������ ���ڴ� �� ������ �̵���Ű�� "ohell"�� �˴ϴ�. �̰��� ���ڿ���
		// �δٰ� �����Ѵٸ� ���ڿ� A�� B�� �Ű������� �־��� ��, A�� �о B�� �� �� �ִٸ� �о�� �ϴ� �ּ� Ƚ���� return�ϰ� �о
		// B�� �� �� ������ -1�� return �ϵ��� solution �Լ��� �ϼ��غ�����.
		
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
		
		// ��ģǮ��... java11���ʹ� repeat() �޼ҵ� ��� ����
		String result = B+B;
		System.out.println(result.indexOf(A));
	}

}
