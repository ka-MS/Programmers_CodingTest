package Level0;

import java.math.BigInteger;

public class �����������°���Ǽ� {

	public static void main(String[] args) {
		�����������°���Ǽ� bl = new �����������°���Ǽ�();
		// �Ӿ��̴� ������ ģ���鿡�� �������ַ��� �մϴ�. ������ ��� �ٸ��� ������ϴ�. �Ӿ��̰� ���� �ִ� ������ ���� balls�� ģ���鿡��
		// ������ �� ���� ���� share�� �Ű������� �־��� ��, balls���� ���� �� share���� ������ ���� ������ ��� ����� ����
		// return �ϴ� solution �Լ��� �ϼ����ּ���.
		// https://gangdor.tistory.com/m/38
		// https://copro505.tistory.com/entry/%EA%B5%AC%EC%8A%AC%EC%9D%84-%EB%82%98%EB%88%84%EB%8A%94-%EA%B2%BD%EC%9A%B0%EC%9D%98-%EC%88%98
		// �ٽú���
		int balls = 30;
		int share = 10;
		int answer = 0;
		BigInteger a = new BigInteger("0");
		// n!/(n-m)!m!  ����Ǽ� ����
		// ����Լ� ���丮�� ���
		a = bl.fact(balls).divide(bl.fact(balls -share).multiply(bl.fact(share)));
//				/(bl.fact(balls -share)*bl.fact(share));
		System.out.println(a);
		answer = a.intValue();
		

	}
	
	
	// ���丮�� ����Լ�
	public BigInteger fact(int n) {
		BigInteger a = new BigInteger(n+"");
		BigInteger c = new BigInteger("0");
		if(n <=1 ) {
			return new BigInteger(1+"");
		}else {
			c = fact(n-1).multiply(a);
			return c;
		}
	}
//	public long fact(int n ) {
//		if(n <=1) {
//			return n;
//		}else {
//			return fact(n-1)*n;
//		}
//	}
	
	// DFS�˰������� ���ۼ� �ϱ�
	
	
}
