package week2.day3;

public class Edge extends BrowserInheritance{
	
	//Define takeSnap() and clearCookies() methods in Edge class
	
	public void takesnap() {
		System.out.println("Take snap invoked from Edge class");
	}
	
	public void clearcookies() {
		System.out.println("Cleared cookies from Edge class");
	}

	public static void main(String[] args) {
		Edge obj2=new Edge();
		System.out.println(obj2.browserName="Edge browser");
		obj2.takesnap();

	}

}
