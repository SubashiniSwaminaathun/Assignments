package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver=new ChromeDriver();
		
	    driver.get("https://www.leafground.com/radio.xhtml");
	    
	    driver.manage().window().maximize();
	    
	    driver.findElement(By.xpath("//label[text()='Firefox']")).click();
	      

	}

}
