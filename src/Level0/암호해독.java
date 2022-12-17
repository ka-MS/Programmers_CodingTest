package Level0;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ��ȣ�ص� {

	public static void main(String[] args) {
		//�� ������ �Ӿ��̴� ���� �� ������ ������ ���� ��ȣ ü�踦 ����Ѵٴ� ���� �˾Ƴ½��ϴ�.
		//��ȣȭ�� ���ڿ� cipher�� �ְ�޽��ϴ�.
		//�� ���ڿ����� code�� ��� ��° ���ڸ� ��¥ ��ȣ�Դϴ�.
		//���ڿ� cipher�� ���� code�� �Ű������� �־��� �� �ص��� ��ȣ ���ڿ��� return�ϵ��� solution �Լ��� �ϼ����ּ���.
		String cipher = "dfjardstddetckdaccccdegk";
		int code = 4;
		String answer = "";
		String[] arr = cipher.split("");
		
		for(int i = 0 ; i < arr.length ; i++) {
			if((i+1)%code == 0) {
				answer += arr[i];
			}
		}
		System.out.println(answer);
		
		answer = "";
		
		// ���ǹ����� ��� ������ ���ְ� subString���� �߶� ����
		for(int i = code ; i<=cipher.length() ; i += code) {
			answer += cipher.substring(i-1,i);
		}
		System.out.println(answer);
		
		//stream���
		answer = IntStream.range(0, cipher.length())
                .filter(value -> value % code == code - 1)
                .mapToObj(c -> String.valueOf(cipher.charAt(c)))
                .collect(Collectors.joining());
		System.out.println(answer);
	}

}
