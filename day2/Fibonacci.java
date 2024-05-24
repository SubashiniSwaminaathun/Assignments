package week1.day2;

public class Fibonacci {

	public static void main(String[] args) {
		int range=8;
		int a=0,b=1;
		for (int i = 0; i < range; i++) {
			System.out.println(a);
			int c=b+a;
			a=b;
			b=c;
		}
		
	}
}
