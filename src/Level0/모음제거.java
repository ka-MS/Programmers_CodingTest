package Level0;

public class 모음제거 {

	public static void main(String[] args) {
		String my_string = "nice to meet you";
		String answer = my_string;
        String[] alfa ={"a", "e", "i", "o", "u"};
        for(int i = 0; i<alfa.length; i++){
            answer = answer.replaceAll(alfa[i],"");
        }
        System.out.println(answer);
        
        //replaceAll 정규식 활용법
        my_string = my_string.replaceAll("[aeiou]", "");
        System.out.println(my_string);
	}

}
