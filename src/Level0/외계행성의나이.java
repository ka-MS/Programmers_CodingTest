package Level0;

import java.util.Arrays;

public class �ܰ��༺�ǳ��� {

	public static void main(String[] args) {
		// ���ֿ����� �ϴ� �Ӿ��̴� ���� �������� PROGRAMMERS-962 �༺�� �ҽ����ϰ� �ƽ��ϴ�. �Ա��ɻ翡�� ���̸� ���ؾ� �ϴµ�,
		// PROGRAMMERS-962 �༺������ ���̸� ���ĺ����� ���ϰ� �ֽ��ϴ�. a�� 0, b�� 1, c�� 2, ..., j�� 9�Դϴ�. ����
		// ��� 23���� cd, 51���� fb�� ǥ���մϴ�. ���� age�� �Ű������� �־��� �� PROGRAMMER-962�� ���̸� return�ϵ���
		// solution �Լ��� �ϼ����ּ���.
		
		int age = 23;
		String answer = "";
		String num = age+"";
		String[] arr = num.split("");
		for(String i : arr) {
			switch(i) {
			case "0" : answer += "a"; break;
			case "1" : answer += "b"; break;
			case "2" : answer += "c"; break;
			case "3" : answer += "d"; break;
			case "4" : answer += "e"; break;
			case "5" : answer += "f"; break;
			case "6" : answer += "g"; break;
			case "7" : answer += "h"; break;
			case "8" : answer += "i"; break;
			case "9" : answer += "j"; break;
			}
		}
		System.out.println(answer);
		
	}

}
