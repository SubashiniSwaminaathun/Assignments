package week2.day3;

public class Chrome extends BrowserInheritance{
	//Define openIncognito() and clearCache() methods in Chrome class
	
	public void openIncognito() {
		System.out.println("Chrome opened in incognito mode");
	}
	public void clearcache() {
		System.out.println("Cache cleared in chrome");
	}

	public static void main(String[] args) {
		Chrome obj1=new Chrome();
		System.out.println(obj1.browserName="Chrome Browser");
		System.out.println(obj1.browserVersion="1.2.3");
		obj1.openURL();
		obj1.clearcache();
		

	}

}
