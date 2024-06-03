package week2.day2;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LeafGround {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://leafground.com/button.xhtml");
		driver.manage().window().maximize();
		
		//Click on the button with the text ‘Click and Confirm title.’
		driver.findElement(By.xpath("//span[text()='Click']")).click();
		String st=driver.getTitle();
		System.out.println(st);
		
		driver.navigate().back();
		
		WebElement el=driver.findElement(By.xpath("(//button[@role='button'])[2]"));
		if(el.isEnabled()) {
			System.out.println("Button is not disabled");
		}
	    else {
			System.out.println("Button is disabled");
		}
		
		//Find and print the position of the button with the text ‘Submit.’
		
		Thread.sleep(4000);
		WebElement el2 = driver.findElement(By.xpath("//span[text()='Submit']"));
		System.out.println(el2.getLocation());
		
		
		//Find and print the background color of the button with the text ‘Find the Save button color.’
		
		WebElement el3 = driver.findElement(By.xpath("//span[text()='Save']"));
		System.out.println(el3.getCssValue("background-color"));
	
		//Find and print the height and width of the button with the text ‘Find the height and width of this button.’
		
		org.openqa.selenium.Rectangle rect=driver.findElement(By.xpath("(//span[text()='Submit'])[2]")).getRect();
		System.out.println(rect.getHeight());
		System.out.println(rect.getWidth());
		
		driver.quit();
		
	}

}
