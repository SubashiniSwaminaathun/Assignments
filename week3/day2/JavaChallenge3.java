package week3.day2;

public class JavaChallenge3 {

	public static void main(String[] args) {
		String s1="A man, a plan, a canal:Panama";
		String s2=s1.toLowerCase();
		System.out.println("After converting to lower case : "+s2);
		String s3=s1.replaceAll("[^a-z]","");
		System.out.println("After replacing special characters : "+s3);
		
	}

}
