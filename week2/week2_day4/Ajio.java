package week2.day4;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ajio {

	public static void main(String[] args) throws InterruptedException {
		
       ChromeDriver driver=new ChromeDriver();
	    
	    //load the url
	    
	    driver.get("https://www.ajio.com/");
	    
	    //maximise
	    
	    driver.manage().window().maximize();
	    //In the search box, type as "bags" and press enter
	    
	    driver.findElement(By.xpath("//input[@name='searchVal']")).sendKeys("bags");
	  
	    driver.findElement(By.xpath("//button[@type='submit']")).click();
	    
	  //- To the left of the screen under "Gender" click on "Men" - Under "Category" click "Fashion Bags"
	    driver.findElement(By.xpath("//label[@for='Men']")).click();
	    
	    Thread.sleep(4000);
	    
	    driver.findElement(By.xpath("//label[contains(text(),'Fashion Bags')]")).click();
	    
	    System.out.println(driver.findElement(By.xpath("//div[@class='length']/strong")).getText());
	    
	    //List<WebElement> el = driver.findElements(By.xpath("//span[@class='a-price-whole']"));
	    List<WebElement> el=driver.findElements(By.xpath("//div[@class='brand']"));
	    System.out.println(el.size());
	    
	    List<String> brands=new ArrayList<String>();
	    
	    for (int i = 0; i < el.size(); i++) {
	    	String text=el.get(i).getText();
	    	brands.add(text);
	    	//System.out.println(brands);
		}
	    System.out.println(brands);

	}

}
