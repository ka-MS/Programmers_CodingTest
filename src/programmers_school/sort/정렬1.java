package programmers_school.sort;

import java.util.ArrayList;
import java.util.List;

public class 정렬1 {

	public static void main(String[] args) {
		String[] ab = new String[10];
		System.out.println(ab);
		System.out.println(ab.hashCode());
		ab[0] = "109";
		System.out.println(ab);
		System.out.println(ab.hashCode());
		String temp = "1";
		System.out.println(temp.hashCode());
		temp = "1";
		System.out.println(temp.hashCode());
		List<String> list = new ArrayList<String>();
		list.add(temp);
		list.add("");
		System.out.println(list.hashCode());


	}

}
