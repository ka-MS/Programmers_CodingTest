package Level0;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class �迭ȸ����Ű�� {

	public static void main(String[] args) {
		// ������ ��� �迭 numbers�� ���ڿ� direction�� �Ű������� �־����ϴ�. �迭 numbers�� ���Ҹ� direction��������
		// �� ĭ�� ȸ����Ų �迭�� return�ϵ��� solution �Լ��� �ϼ����ּ���.
		int[] numbers = {4, 455, 6, 4, -1, 45, 6};
		String direction = "left";
		int[] answer = new int[numbers.length];
		int length = numbers.length;
		for(int i = 0; i < length ; i++) {
			switch(direction) {
			case "left":
				answer[i] = i == length-1 ? numbers[0] : numbers[i+1];
				break;
			case "right":
				answer[i] = i == 0 ? numbers[length-1] : numbers[i-1];
				break;
			}
			System.out.print(answer[i] +",");
		}
		
		//stream ��� 
		List<Integer> list = Arrays.stream(numbers).boxed().collect(Collectors.toList());

        if (direction.equals("right")) {
            list.add(0, list.get(list.size() - 1));
            list.remove(list.size() - 1);
        } else {
            list.add(list.size(), list.get(0));
            list.remove(0);
        }
        answer = list.stream().mapToInt(Integer::intValue).toArray();
	}

}
