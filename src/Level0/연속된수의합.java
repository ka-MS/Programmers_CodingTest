package Level0;

public class ���ӵȼ����� {

	public static void main(String[] args) {
		// ���ӵ� �� ���� ������ ���� 12�� �Ǵ� ���� 3, 4, 5�Դϴ�. �� ���� num�� total�� �־����ϴ�. ���ӵ� �� num���� ����
		// ���� total�� �� ��, ���� �迭�� ������������ ��� return�ϵ��� solution�Լ��� �ϼ��غ�����.
		int num = 3;
		int total = 12;
		int[] answer = new int[num];
		for(int i = -num; i < 1000 ; i++) {
			int k = 0;
			for(int j = 0; j < num ; j++) {
				k +=i+j;
			}
			if(total == k) {
				for(int j = 0; j< num; j++) {
					answer[j] = i+j;
				}
				break;
			}
		}
		int p = 0;
		for(int i = 1 ; i <=100; i++) {
			p+=i;
		}
		
		//���������� �̿��� Ǯ��
//		�׽�Ʈ 1���� ���÷� ��� �� 3���� ���ڸ� �̿��ؼ� 12��� ���ڸ� �������մϴ�.
//		a0=a, d=1�̶� �Ҷ� a0+a1+a2=a+(a+d)+(a+2d)=15��� ���� ���ɴϴ�.
//		�� 3a+3=12 -> a=(12-3)/3�̶�� ������ ���ɴϴ�.
//		�̶� a�� ����Ʈ �ڷ��� ù��° ���ڶ�� ���� �� �� �ֽ��ϴ�. �̷� ����� �̿��� �ݺ��� ������ ����Ʈ ��ü ���ڸ� ���ϸ� �˴ϴ�.
		
		int check = (num-1)*(num)/2; // num~n���� ��
		int start = (total-check)/num; // �������� ���۰�
        for (int i = 0; i < answer.length; i++) {
                answer[i] = start + i ;
        }
		
		for(int i = 0 ; i < num ; i++) {
			System.out.println(answer[i]);
		}
		

	}

}
