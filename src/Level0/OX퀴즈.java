package Level0;

import java.util.ArrayList;
import java.util.List;

public class OX���� {

	public static void main(String[] args) {
		// ����, ���� ���ĵ��� 'X [������] Y = Z' ���·� ����ִ� ���ڿ� �迭 quiz�� �Ű������� �־����ϴ�. ������ �Ǵٸ� "O"��
		// Ʋ���ٸ� "X"�� ������� ���� �迭�� return�ϵ��� solution �Լ��� �ϼ����ּ���.
		String[] quiz = {"19 - 6 = 13", "5 + 6 = 11"};
		String[] answer = new String[quiz.length];
		String[][] arr = new String[quiz.length][5];
		for(int i = 0; i< quiz.length; i++) {
			arr[i] = quiz[i].split(" ");
		}
		for(int i = 0; i < arr.length; i++) {
			if(arr[i][1].equals("-")) {
				answer[i] = Integer.parseInt(arr[i][0])-Integer.parseInt(arr[i][2]) == Integer.parseInt(arr[i][4]) ? "O":"X";
			}else {
				answer[i] = Integer.parseInt(arr[i][0])+Integer.parseInt(arr[i][2]) == Integer.parseInt(arr[i][4]) ? "O":"X";
			}
		}
		
		// ������ �Ʒ��� �޸𸮸� ���־ణ ������Ƹ԰� �ӵ��� ���־ణ ������ 0.13 -> 0.11ms 74mb -> 72mb 
		// ��ü�� �Ʒ��� �� ���� �����ϴ°Ű����� �ֱ׷��� �𸣰ڴ� 
		// 2�߹迭�� �޸𸮸� �� ���� ��ƸԴ°ɱ�?
		// 1�����迭 arr[5] 2�� < 2���� �迭 arr[2][5] 1��
		
		for(int i = 0; i < quiz.length; i++) {
			String[] arr2 = quiz[i].split(" ");
			if(arr2[1].equals("-")) {
				answer[i] = Integer.parseInt(arr2[0])-Integer.parseInt(arr2[2]) == Integer.parseInt(arr2[4]) ? "O":"X";
			}else {
				answer[i] = Integer.parseInt(arr2[0])+Integer.parseInt(arr2[2]) == Integer.parseInt(arr2[4]) ? "O":"X";
			}
		}
		System.out.println(answer[0] );
	}

}
