package Level0;

public class �߶󼭹迭�������ϱ� {

	public static void main(String[] args) {
		// ���ڿ� my_str�� n�� �Ű������� �־��� ��, my_str�� ���� n�� �߶� ������ �迭�� return�ϵ��� solution �Լ���
		// �ϼ����ּ���.
		int n = 1;
		String my_str = "abc1Addfggg4556b";
		int leng = my_str.length()%n == 0 ? my_str.length()/n : my_str.length()/n+1;
		String[] answer = new String[leng];
		
		for(int i = 0; i< leng; i++) {
			if(my_str.length() < n) {
				answer[i] = my_str.substring(0, my_str.length());
			}else {
				answer[i] = my_str.substring(0,n);
				my_str = my_str.replaceFirst(answer[i], "");
			}
		}
		for(int i = 0; i < answer.length; i++) {
			
			System.out.println(answer[i]);
		}
	}

}
