package week2.day3;

public class Safari extends BrowserInheritance{
	
	//Define readerMode() and fullScreenMode() methods in Safari class
	
	public void readerMode() {
		System.out.println("Reader mode invoked from Safari browser");
	}
	
	public void fullScreenMode() {
		System.out.println("full screen mode from safari class");
	}


	public static void main(String[] args) {
		Safari obj3=new Safari();
		System.out.println(obj3.browserName="Safari");
		obj3.fullScreenMode();

	}

}
