package Level0;

public class �����ִ¼����ǵ���2 {

	public static void main(String[] args) {
		// ���ڿ� my_string�� �Ű������� �־����ϴ�. my_string�� �ҹ���, �빮��, �ڿ����θ� �����Ǿ��ֽ��ϴ�. my_string����
		// �ڿ������� ���� return�ϵ��� solution �Լ��� �ϼ����ּ���.
		String my_string = 	"1a2b3c4d123Z";
		int answer = 0;
		String[] arr = my_string.split("[a-zA-Z]");
		System.out.println(arr.length);
		for(int i = 0; i < arr.length; i++) {
			if(!arr[i].equals("")) {
				answer += Integer.parseInt(arr[i]);
			}
		}
		System.out.println(answer);
	}

}
