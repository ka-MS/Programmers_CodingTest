package Level0;

import java.util.LinkedList;
import java.util.Queue;

public class �������� {

	public static void main(String[] args) {
		// �Ӿ��̴� ģ����� ���׶��� ���� �� ������ ������ �ϰ� �ֽ��ϴ�. ���� 1������ ������ ���������� �� ���� �ǳʶٰ� �״��� ������Ը� ����
		// �� �ֽ��ϴ�. ģ������ ��ȣ�� ����ִ� ���� �迭 numbers�� ���� K�� �־��� ��, k��°�� ���� ������ ����� ��ȣ�� ��������
		// return �ϵ��� solution �Լ��� �ϼ��غ�����.
		int answer = -1;
		int[] numbers = { 1, 2, 3, 4 ,5,6};
		int k = 10;
		for (int j = 0; j < k; j++) {
			answer+=2;
			if (answer == numbers.length+1) {
				answer = 1;
			} else if (answer == numbers.length+2) {
				answer = 2;
			}
		}
		// ���� ���
		System.out.println( (k-1)*2 % numbers.length +1 );
		// queue �� ����Ͽ�  ť �ȿ� �ΰ� �ΰ��� �־ 2���� �о�����
		// poll() �迭�� �������°� ������ �������� �����Ѵ�
		// add() �ǵڿ� �ִ´� ť�� �������� �ͼ��� ��� offer() �ǵڿ� �ִ´� �������� false���
		// ť�� ��� ���� ���� ����?
		Queue<Integer> queue = new LinkedList<>();
        for(int num : numbers) queue.add(num);
        int cnt = 1;
        while(cnt !=k){
            queue.offer(queue.poll());
            queue.offer(queue.poll());
            System.out.println(queue);
            cnt++;
        }
		System.out.println(queue.poll());

	}

}
