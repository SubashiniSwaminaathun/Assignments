package week3.day4;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsScroll {

	public static void main(String[] args) {
		EdgeDriver driver=new EdgeDriver();
        driver.get("https://www.amazon.in/");
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	    
	    //Finding element
	    WebElement element = driver.findElement(By.xpath("//a[text()='Instagram']"));
	    
	    //Instantiating actions class
	    Actions act=new Actions(driver);
	    
	    //Scrolling to place where element is present
	    act.scrollToElement(element).perform();
	    
	}

}
