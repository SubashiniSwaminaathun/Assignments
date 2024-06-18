package week3.day1;

import java.util.LinkedHashSet;
import java.util.Set;

public class SetDuplicate {

	public static void main(String[] args) {
		
		String inp="google";
		Set<Character> unique=new LinkedHashSet<Character>();
		char[] ch=inp.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			unique.add(ch[i]);
		}
		System.out.println(unique);
		
		}

	}


