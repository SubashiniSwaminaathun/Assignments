package week2.day4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ListInterface {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
	    
	    //load the url
	    
	    driver.get("https://amazon.in");
	    
	    //maximise
	    
	    driver.manage().window().maximize();
	    
	  //Searchbar
	    
	   driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("Mobile phones");
	 //Search button
	   
	   driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
	   //Getting price details
	   
	   List<WebElement> el = driver.findElements(By.xpath("//span[@class='a-price-whole']"));
	   
	   
	   List<String> price=new ArrayList<String>();
	   
	   for(WebElement finalprice:el) {
		   price.add(finalprice.getText());
	   
	}
	   Collections.sort(price);
	   System.out.println(price);
	   

	    


	}

}
