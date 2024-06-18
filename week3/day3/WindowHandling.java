package week3.day3;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandling {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver=new ChromeDriver();
        driver.get("https://www.irctc.co.in/");
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	    
	    //Clicking flights
	    Thread.sleep(4000);
	    driver.findElement(By.xpath("//a[text()=' FLIGHTS ']")).click();
	    
	    //Switching to Child
	    Set<String> setStr = driver.getWindowHandles();
	    List<String> allWindow=new ArrayList<String>(setStr);
	    driver.switchTo().window(allWindow.get(1));
	    
	    //Getting title
	    Thread.sleep(4000);
	    String childtitle = driver.getTitle();
	    System.out.println("Child title: " +childtitle);
	    
	    //Closing parent tab
	    Thread.sleep(4000);
	    driver.switchTo().window(allWindow.get(0));
	    driver.close();
	    

	}

}
