package week1.day4;

public class ReverseOddWords {

	public static void main(String[] args) {
		String test = "I am a software tester";
		String rev=" ";
		String[] words = test.split(" ");
		for (int i = 0; i < words.length; i++) {
			if(i%2!=0) {
				rev="";
				for (int j = 0; j < words[i].length(); j++) {
					rev=words[i].charAt(j)+rev;
				}
				words[i]=rev;
			}
		}
		for (int i = 0; i < words.length; i++) {
			System.out.print(words[i]+" ");
		}

	}

}
