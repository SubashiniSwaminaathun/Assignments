package week1.day3;

public class Palindrome {

	public static void main(String[] args) {
		int inp=5945;
		int a=0,rev=0,sum=0;
		a=inp;
		for (; a != 0; a /= 10) {
            rev = a % 10; //To get last digit
            sum = (sum * 10) + rev; // Add the last digit to the sum
        }
        if(sum==inp) {
        	System.out.println("Palindrome");
        }
        else
        	System.out.println("Not a palindrome");
	}

}
