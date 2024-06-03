package week2.day3;

public class LoginTestData extends TestData{

	//enterUsername() - enterPassword()
	
	public void enterUsername() {
		System.out.println("LoginTestData : enter username");
	}
	
	public void enterPassword() {
		System.out.println("LoginTestData : enter password");
		
	}
	public static void main(String[] args) {
		
		LoginTestData obj=new LoginTestData();
		obj.enterCredentials();
		obj.enterUsername();
	}

}
