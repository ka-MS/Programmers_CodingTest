package Level0;

public class ���������� {

	public static void main(String[] args) {
		// ������ 2 ������ 0 ���� 5�� ǥ���մϴ�. ���� ���� ���� ���� ������� ��Ÿ�� ���ڿ� rsp�� �Ű������� �־��� ��, rsp�� �����
		// ���� ���� ���� ��� �̱�� ��츦 ������� ��Ÿ�� ���ڿ��� return�ϵ��� solution �Լ��� �ϼ��غ�����.
		String rsp = "205";
		String answer = "";
		for(int i = 0; i < rsp.length() ; i++){
           answer += solution(rsp.substring(i,i+1));
        }
		System.out.println(answer);
	}
	public static String solution(String rsp) {
		String result = rsp.equals("2") ? "0" : rsp.equals("5") ? "2" : rsp.equals("0") ? "5" : "";
		return result;
	}
}
