package Level0;

public class ���������θ���� {

	public static void main(String[] args) {
		// ���� �迭 num_list�� ���� n�� �Ű������� �־����ϴ�. num_list�� ���� ����� ���� 2���� �迭�� �ٲ� return�ϵ���
		// solution �Լ��� �ϼ����ּ���.
		// num_list�� [1, 2, 3, 4, 5, 6, 7, 8] �� ���̰� 8�̰� n�� 2�̹Ƿ� num_list�� 2 * 4 �迭�� ������
		// ���� �����մϴ�. 2�������� �ٲ� ������ num_list�� ���ҵ��� �տ������� n���� ���� 2���� �迭�� �����մϴ�.
		// [1, 2, 3, 4, 5, 6, 7, 8]	2	[[1, 2], [3, 4], [5, 6], [7, 8]]
		int[] num_list = {1, 2, 3, 4, 5, 6, 7, 8};
		int n = 2;
		int j = 0;
		int[][] answer = new int[num_list.length/n][n];
		
//		for(int i = 0; i<num_list.length/n ; i++) {
//			for(int k = 0; k<n ; k++) {
//				answer[i][k] = num_list[j];
//				j++;
//			}
//		}
		
		// ����) �������� �̿��Ͽ� for���� �ѹ��� ������ 
		for(int i = 0; i<num_list.length ; i++) {
			answer[i/n][i%n] = num_list[i];
		}
		
		for(int i = 0; i<num_list.length/n ; i++) {
			System.out.print("[");
			for(int k = 0; k<n ; k++) {
				if(k == n-1) {
					System.out.print(answer[i][k]);
				}else {
					System.out.print(answer[i][k] + ",");
				}
				
			}
			System.out.print("]");
		}
		
	}

}
