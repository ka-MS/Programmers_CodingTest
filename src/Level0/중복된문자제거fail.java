package Level0;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.*;

public class �ߺ��ȹ�������fail {

	public static void main(String[] args) {
		// ���ڿ� my_string�� �Ű������� �־����ϴ�. my_string���� �ߺ��� ���ڸ� �����ϰ� �ϳ��� ���ڸ� ���� ���ڿ���
		// return�ϵ��� solution �Լ��� �ϼ����ּ���.
		String my_string = "people";
		String answer = "";
		char[] arr = my_string.toCharArray();
		List<String> sarr = new ArrayList<String>();

		for (int i = 0; i < arr.length; i++) {
			if(!sarr.contains(arr[i]+"")) {
				sarr.add(arr[i]+"");
			}
		}

		answer = String.join("", sarr);
		System.out.println(answer);
		
		//map�� set�� �� �����ؾ���
		// set�� �̿��� Ǯ��
		String[] answers = my_string.split("");
        Set<String> set = new LinkedHashSet<String>(Arrays.asList(answers));
        System.out.println(set);
	}

}
