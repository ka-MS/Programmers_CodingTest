package Level0;

import java.util.HashSet;
import java.util.TreeSet;

public class �ѹ��������ѹ��� {

	public static void main(String[] args) {
		// ���ڿ� s�� �Ű������� �־����ϴ�. s���� �� ���� �����ϴ� ���ڸ� ���� ������ ������ ���ڿ��� return �ϵ��� solution �Լ���
		// �ϼ��غ�����. �� ���� �����ϴ� ���ڰ� ���� ��� �� ���ڿ��� return �մϴ�.
		String s = "reabcabcadc";
		String answer = "";
		String[] sarr = s.split("");
		TreeSet<String> arr = new TreeSet<String>();
		for(int i = 0; i<s.length(); i++) {
			if(s.length() - s.replaceAll(sarr[i],"").length() == 1) {
				arr.add(sarr[i]);
			}
		}
		// String.join() �޼ҵ�� for�� ���� �迭�� ���ڿ�ȭ �� �� ����
		System.out.println(String.join("", arr));;
		for(String i : arr) {
			answer += i;
		}
		System.out.println(answer);
	
	}

}
