package Level0;

public class �ʰ������ιޱ� {

	public static void main(String[] args) {
		// �Ӿ��̳� �ʰ��Դ� 10�� �� �̻� ��� 5%, 30�� �� �̻� ��� 10%, 50�� �� �̻� ��� 20%�� �������ݴϴ�.
		// ������ ���� ���� price�� �־��� ��, �����ؾ� �� �ݾ��� return �ϵ��� solution �Լ��� �ϼ��غ�����.
		int price = 150000;
		int result = (int) (price>=500000 ? price*0.8: price>=300000 ? price*0.9:price>=100000 ? price*0.95 : price);
		System.out.println(result);
	
	}

}
