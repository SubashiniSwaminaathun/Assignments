package week1.day4;

public class ReverseString {

	public static void main(String[] args) {
		String str="TestLeaf";
		char[] ch=str.toCharArray();
		for (int i = ch.length-1; i >=0 ; i--) {
			System.out.print(ch[i]);
		}

	}

}
