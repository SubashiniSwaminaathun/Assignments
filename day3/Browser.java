package week1.day3;

public class Browser {
	
	public String launchBrowser(String browserName)
	{
		System.out.println("Browser launched successfully");
		return browserName;
	}
	public void loadUrl()
	{
		System.out.println("Application url loaded successfully");
	}

	public static void main(String[] args) {
		Browser browse=new Browser();
		System.out.println(browse.launchBrowser("Chrome"));
		browse.loadUrl();

	}

}
