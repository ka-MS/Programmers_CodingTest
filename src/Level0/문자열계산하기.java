package Level0;

public class ���ڿ�����ϱ� {

	public static void main(String[] args) {
		// my_string�� "3 + 5"ó�� ���ڿ��� �� �����Դϴ�. ���ڿ� my_string�� �Ű������� �־��� ��, ������ ����� ����
		// return �ϴ� solution �Լ��� �ϼ����ּ���.
		String my_string = "3 + 4 - 3 + 7";
		int answer = 0;
		my_string = my_string.trim();
		String[] arr = my_string.split(" ");
		answer = Integer.parseInt(arr[0]);
		for(int i = 0; i < arr.length ; i++) {
			if(arr[i].equals("+")) {
				answer += Integer.parseInt(arr[i+1]);
			}else if(arr[i].equals("-")) {
				answer -= Integer.parseInt(arr[i+1]);
			}
		}
		System.out.println(answer);
	}

}
