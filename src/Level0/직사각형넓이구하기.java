package Level0;

public class ���簢�����̱��ϱ� {
	public static void main(String[] args) {
		// 2���� ��ǥ ��鿡 ���� ��� ������ ���簢���� �ֽ��ϴ�. ���簢�� �� �������� ��ǥ [[x1, y1], [x2, y2], [x3,
		// y3], [x4, y4]]�� ����ִ� �迭 dots�� �Ű������� �־��� ��, ���簢���� ���̸� return �ϵ��� solution �Լ���
		// �ϼ��غ�����.
		int[][] dots = {{1, 1}, {2, 1}, {2, 2}, {1, 2}};
		int[][] minmax = {{256,256},{-256,-256}};
		for(int i = 0; i<4 ; i++) {
			for(int j = 0; j<2; j++) {
				minmax[0][0] = Math.min(minmax[0][0], dots[i][0]);
				minmax[0][1] = Math.min(minmax[0][1], dots[i][1]);
				minmax[1][0] = Math.max(minmax[1][0], dots[i][0]);
				minmax[1][1] = Math.max(minmax[1][1], dots[i][1]);
			}
		}
		int answer = (minmax[1][0] - minmax[0][0])*(minmax[1][1] - minmax[0][1]);
		System.out.println(answer);
	}
}
