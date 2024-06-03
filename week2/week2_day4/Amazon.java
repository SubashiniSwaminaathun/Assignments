package week2.day4;

public class Amazon extends CanaraBank{

	public void cashOnDelivery() {
		System.out.println("Cash on Deleivery options");
		
	}

	public void upiPayments() {
		System.out.println("UPI Payment options");
		
	}

	public void cardPayments() {
		System.out.println("Card Payment options");
		
	}

	public void internetBanking() {
		System.out.println("Internet banking options");
		
	}

	public static void main(String[] args) {
		Amazon obj=new Amazon();
		obj.cardPayments();
		obj.cashOnDelivery();
		obj.internetBanking();
		obj.upiPayments();
		obj.recordPaymentDetails();
		
	}
}
