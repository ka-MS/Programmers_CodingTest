package Level0;

public class ���׽Ĵ��ϱ� {

	public static void main(String[] args) {
		// �� �� �̻��� ���� ������ �̷���� ���� ���׽��̶�� �մϴ�. ���׽��� ����� ���� �����׳��� ����� �����մϴ�. �������� �̷���� ���׽�
		// polynomial�� �Ű������� �־��� ��, �����׳��� ���� �ᱣ���� ���ڿ��� return �ϵ��� solution �Լ��� �ϼ��غ�����.
		// ���� ���̶�� ���� ª�� ������ return �մϴ�.
		String polynomial = "x + x + x";
		String answer= "";
		int num = 0;
		int numx = 0;
		String[] arr = polynomial.split(" [+] ");
		for(int i = 0; i < arr.length ; i++) {
			if(arr[i].indexOf("x") !=-1) {
				numx += arr[i].replace("x", "").equals("") ? 1 : Integer.valueOf(arr[i].replace("x", ""));
			}else if(arr[i] != " "){
				num += Integer.valueOf(arr[i]);
			}
		}
		if(numx == 0) {
			
		}else if(numx == 1) {
			answer += "x";
		}else {
			answer += numx+"x";
		}
		if(numx != 0 && num != 0) {
			answer += " + "+num;
		}else if(numx == 0) {
			answer += num+"";
		}
		
		System.out.println(answer);
	}

}
