package Level0;

import java.util.HashMap;

public class �𽺺�ȣ1 {

	public static void main(String[] args) {
		// �Ӿ��̴� ģ������ �𽺺�ȣ�� �̿��� ������ �޾ҽ��ϴ�. �׳��� ���� �� ���� �̸� �ص��ϴ� ���α׷��� ������� �մϴ�. ���ڿ�
		// letter�� �Ű������� �־��� ��, letter�� ���� �ҹ��ڷ� �ٲ� ���ڿ��� return �ϵ��� solution �Լ��� �ϼ��غ�����.
		// �𽺺�ȣ�� ������ �����ϴ�.
//		morse = { 
//			    '.-':'a','-...':'b','-.-.':'c','-..':'d','.':'e','..-.':'f',
//			    '--.':'g','....':'h','..':'i','.---':'j','-.-':'k','.-..':'l',
//			    '--':'m','-.':'n','---':'o','.--.':'p','--.-':'q','.-.':'r',
//			    '...':'s','-':'t','..-':'u','...-':'v','.--':'w','-..-':'x',
//			    '-.--':'y','--..':'z'
//			} 
		String letter = ".... . .-.. .-.. ---";
		String answer = "";
		HashMap<String, String> morse = new HashMap<String, String>();
		morse.put(".-" , "a");
		morse.put("-..." , "b");
		morse.put("-.-." , "c");
		morse.put("-.." , "d");
		morse.put("." , "e");
		morse.put("..-." , "f");
		morse.put("--." , "g");
		morse.put("...." , "h");
		morse.put(".." , "i");
		morse.put(".---" , "j");
		morse.put("-.-" , "k");
		morse.put(".-.." , "l");
		morse.put("--" , "m");
		morse.put("-." , "n");
		morse.put("---" , "o");
		morse.put(".--." , "p");
		morse.put("--.-" , "q");
		morse.put(".-." , "r");
		morse.put("..." , "s");
		morse.put("-" , "t");
		morse.put("..-" , "u");
		morse.put("...-" , "v");
		morse.put(".--" , "w");
		morse.put("-..-" , "x");
		morse.put("-.--" , "y");
		morse.put("--.." , "z");
		String[] arr = letter.split(" ");
		for(int i = 0; i < arr.length ; i++) {
			answer += morse.get(arr[i]);
		}
		System.out.println(answer);
		

	}

}
