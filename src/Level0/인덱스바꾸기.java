package Level0;

public class �ε����ٲٱ� {

	public static void main(String[] args) {
		// ���ڿ� my_string�� ���� num1, num2�� �Ű������� �־��� ��, my_string���� �ε��� num1�� �ε��� num2��
		// �ش��ϴ� ���ڸ� �ٲ� ���ڿ��� return �ϵ��� solution �Լ��� �ϼ��غ�����.
		String my_string = "hello";
		int num1 = 1;
		int num2 = 2;
		String answer = "";

		char[] arr = { my_string.charAt(num1), my_string.charAt(num2) };
		String[] str = my_string.split("");
		for (int i = 0; i < str.length; i++) {
			if (i == num1) {
				answer += arr[1];
			} else if (i == num2) {
				answer += arr[0];
			} else {
				answer += str[i];
			}
		}
		answer = String.valueOf(arr);
		System.out.println(answer);

		// char�迭 + String.valueOf Ǯ��
		char[] ch = my_string.toCharArray();

		ch[num1] = my_string.charAt(num2);
		ch[num2] = my_string.charAt(num1);

		answer = String.valueOf(ch);
		
		// �������� �������� Ǯ��
		String[] arr2 = my_string.split("");
        String temp = arr2[num1];
        arr2[num1] = arr2[num2];
        arr2[num2] = temp;
        for(String str2 : arr2){
            answer += str2;
        }
        System.out.println(answer);
	}

}
