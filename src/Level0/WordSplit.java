package Level0;

public class WordSplit {

	public static void main(String[] args) {
		
		String result = "abcdef";
//		String[] word = result.split("");
//		for(String k : word) {
//			if(!k.equals("f")) {
//				result = result + k;
//			}
//		}
		
		//replace»ç¿ë
		String result2 = result.replace("f", "");
		System.out.println(result2);
	}

}
