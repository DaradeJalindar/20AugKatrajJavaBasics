package stringclass;

import java.util.HashSet;

public class RemoveDuplicateFromString {

	public static void main(String[] args) {

		String s = "abcdefabcdef";

		HashSet<Character> hs = new HashSet<Character>();

		for (int i = 0; i < s.length(); i++) {

			char charvalue = s.charAt(i);

			hs.add(charvalue);

		}

		System.out.println(hs);

	}
}
