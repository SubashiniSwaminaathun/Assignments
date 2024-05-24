package week1.day2;

public class IsPrime {

	public static void main(String[] args) {
		int num=28;
		boolean prime=true;
		for (int i = 2; i <num; i++) {
			if(num%i==0)
				{prime=false;}
		}
		if(prime==false)
			System.out.println(num+ " is not prime");
		else
			System.out.println(num+ " is prime");

	}

}
