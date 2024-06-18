package week3.day3;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class AmazonWindowSnap {

	public static void main(String[] args) throws InterruptedException, IOException {
		
		//1.Load the URL https://www.amazon.in/
		EdgeDriver driver=new EdgeDriver();
        driver.get("https://www.amazon.in/");
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	    
			//2.search as oneplus 9 pro 
	    driver.findElement(By.id("twotabsearchtextbox")).sendKeys("oneplus 9 pro");
	    driver.findElement(By.id("nav-search-submit-button")).click();
	    
	    Thread.sleep(4000);
			//3.Get the price of the first product
	    String price = driver.findElement(By.xpath("//span[@class='a-price-whole']")).getText();
	    System.out.println("Price : "+price);
	    
	    Thread.sleep(4000);
			//4. Print the number of customer ratings for the first displayed product
	    String rating = driver.findElement(By.xpath("//div[@class='a-icon-row a-spacing-small a-padding-none']")).getText();
	    System.out.println("Rating : "+rating);
	    
	    Thread.sleep(4000);
			//5. Click the first text link of the first image
	    driver.findElement(By.xpath("//span[@class='a-size-medium a-color-base a-text-normal']")).click();
	    
			//6. Take a screen shot of the product displayed
	    Set<String> setStr = driver.getWindowHandles();
	    List<String> allWindow=new ArrayList<String>(setStr);
	    driver.switchTo().window(allWindow.get(1));
	    
	    WebElement image = driver.findElement(By.id("landingImage"));
	    File source = image.getScreenshotAs(OutputType.FILE);
	    File dest=new File("./snap/phoneimage.png");
	    FileUtils.copyFile(source, dest);
	    
	    
			//7. Click 'Add to Cart' button
	    driver.findElement(By.id("add-to-cart-button")).click();
	    
			//8. Get the cart subtotal and verify if it is correct.
	    String count = driver.findElement(By.id("attach-accessory-cart-total-string")).getText();
	    if(count.contains("1")) {
	    	System.out.println("Cart has one item");
	    }
	    else {
	    	System.out.println("Error in count");
	    }
			//9.close the browser
	    //driver.quit();

	}

}
