package week2.day4;

public class JavaChallenge1 {

	public static void main(String[] args) {
		
		String inp="This is first Java challenge";
		String[] words = inp.split(" ");
		int size=words.length;
		int count=0;;
		System.out.println("Number of words : " +size);
		String lastword=words[size-1];
		char[] ch=lastword.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			count=count+1;
		}
		System.out.println("Last word : "+words[size-1]);
		System.out.println("Count = " +count);
		
	}

}
