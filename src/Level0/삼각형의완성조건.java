package Level0;

public class �ﰢ���ǿϼ����� {

	public static void main(String[] args) {
		// ���� �� ���� �ﰢ���� ����� ���ؼ��� ������ ���� ������ �����ؾ� �մϴ�.
		// ���� �� ���� ���̴� �ٸ� �� ���� ������ �պ��� �۾ƾ� �մϴ�.
		// �ﰢ���� �� ���� ���̰� ��� �迭 sides�� �Ű������� �־����ϴ�. ������ �� ���� �� �� �ִ� ������ ������ return�ϵ���
		// solution �Լ��� �ϼ����ּ���.
		int[] side= {7,11};
		int answer = 0;
		int min = Math.min(side[0],side[1]);
		side[0] = Math.max(side[0],side[1]);
		side[1] = min;
		for(int i = 1; i < side[0] + side[1]; i++) {
			if(side[0] < i + side[1] && i < side[0] + side[1]) {
				answer ++ ;
			}
		}
		
		System.out.println(answer);
	}

}
