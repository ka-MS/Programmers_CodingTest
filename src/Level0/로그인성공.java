package Level0;

import java.util.HashMap;
import java.util.Map;

public class �α��μ��� {

	public static void main(String[] args) {
		// �Ӿ��̴� ���α׷��ӽ��� �α����Ϸ��� �մϴ�. �Ӿ��̰� �Է��� ���̵�� �н����尡 ��� �迭 id_pw�� ȸ������ ������ ��� 2���� �迭
		// db�� �־��� ��, ������ ���� �α��� ����, ���п� ���� �޽����� return�ϵ��� solution �Լ��� �ϼ����ּ���.
		// ���̵�� ��й�ȣ�� ��� ��ġ�ϴ� ȸ�������� ������ "login"�� return�մϴ�.
		// �α����� �������� �� ���̵� ��ġ�ϴ� ȸ���� ���ٸ� ��fail����, ���̵�� ��ġ������ ��й�ȣ�� ��ġ�ϴ� ȸ���� ���ٸ� ��wrong
		// pw���� return �մϴ�.
		String[] id_pw = { "meosseugi", "1234" };
		String[][] db = {{ "meosseugi", "1234" }, { "rardss", "123" }, { "yyoom", "" }  };
		String answer = "";
		for(int i = 0; i < db.length ; i++) {
			if(id_pw[0].equals(db[i][0])) {
				answer = "wrong pw";
				if(id_pw[1].equals(db[i][1])) {
					answer = "login";
					break;
				}
			}else if(!answer.equals("wrong pw")){
				answer = "fail";
			}
		}
		System.out.println(answer);
		
		// �� Ž��
		String aa = getDb(db).get(id_pw[0]) != null ? getDb(db).get(id_pw[0]).equals(id_pw[1]) ? "login" : "wrong pw" : "fail";
		System.out.println(getDb(db).get(id_pw[0]));
	}
	
	private static Map<String, String> getDb(String[][] db) {
        Map<String, String> map = new HashMap<>();

        for (String[] array : db) {
            map.put(array[0], array[1]);
        }
        return map;
    }

}
