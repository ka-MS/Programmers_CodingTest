package Level0;

public class ġŲ���� {

	public static void main(String[] args) {
		// ���α׷��ӽ� ġŲ�� ġŲ�� ���Ѹ����� �� ������ ������ �� �� �߱��մϴ�. ������ �� �� ������ ġŲ�� �� ���� ���񽺷� ���� �� �ְ�,
		// ���� ġŲ���� ������ �߱޵˴ϴ�. ���Ѹ��� ġŲ�� �� chicken�� �Ű������� �־��� �� ���� �� �ִ� �ִ� ���� ġŲ�� ����
		// return�ϵ��� solution �Լ��� �ϼ����ּ���.
		
		int chicken = 1081;
		int answer = 0;
//		while(true) {
//			if(chicken/10 >= 10 || chicken >= 10) {
//				answer += chicken/10;
//				chicken = chicken%10 + chicken/10;
//			}else {
//				answer += chicken/10;
//				break;
//			}
//		}
		while(chicken >= 10) {
				answer += chicken/10;
				chicken = chicken%10 + chicken/10;
		}
		System.out.println(answer);

	}

}
