package Level0;

import java.util.HashMap;

public class ĳ��������ǥ {

	public static void main(String[] args) {
		// �Ӿ��̴� RPG������ �ϰ� �ֽ��ϴ�. ���ӿ��� up, down, left, right ����Ű�� ������ �� Ű�� ������ ��, �Ʒ�, ����,
		// ���������� �� ĭ�� �̵��մϴ�. ���� ��� [0,0]���� up�� �����ٸ� ĳ������ ��ǥ�� [0, 1], down�� �����ٸ� [0, -1],
		// left�� �����ٸ� [-1, 0], right�� �����ٸ� [1, 0]�Դϴ�. �Ӿ��̰� �Է��� ����Ű�� �迭 keyinput�� ���� ũ��
		// board�� �Ű������� �־����ϴ�. ĳ���ʹ� �׻� [0,0]���� ������ �� Ű �Է��� ��� ���� �ڿ� ĳ������ ��ǥ [x, y]��
		// return�ϵ��� solution �Լ��� �ϼ����ּ���.
		// [0, 0]�� board�� �� �߾ӿ� ��ġ�մϴ�. ���� ��� board�� ���� ũ�Ⱑ 9��� ĳ���ʹ� �������� �ִ� [-4, 0]����
		// ���������� �ִ� [4, 0]���� �̵��� �� �ֽ��ϴ�.

		String[] keyinput = { "left", "right", "up", "right", "right" };
		int[] board = { 11, 11 };
		int[] answer = {0,0};
		
		for(int i = 0; i < keyinput.length ; i++) {
			switch (keyinput[i]) {
			case "left": if(answer[0] <= -board[0]/2)break;--answer[0]; break;
			case "right":if(answer[0] >= board[0]/2)break;++answer[0]; break;
			case "up":if(answer[1] >= board[1]/2)break;++answer[1]; break;
			case "down":if(answer[1] <= -board[1]/2)break;--answer[1]; break;
			default : break;
			}
		}
		
		System.out.println(answer[0] + "," + answer[1]);

	}

}
