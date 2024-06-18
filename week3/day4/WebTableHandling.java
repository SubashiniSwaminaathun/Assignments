package week3.day4;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class WebTableHandling {

	public static void main(String[] args) {
		
		EdgeDriver driver=new EdgeDriver();
        driver.get("https://leafground.com/table.xhtml");
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	    
	    WebElement table = driver.findElement(By.xpath("//span[text()='Customer Analytics Table']/following::table[2]/tbody"));
	    List<WebElement> rows = table.findElements(By.tagName("tr"));
	    int count=rows.size();
	    System.out.println("Row count: "+count);
	    	
	
	    List<WebElement> col = driver.findElements(By.xpath("//span[text()='Customer Analytics Table']/following::table[2]/tbody/tr/td[1]"));
	    for (WebElement column : col) {
			String text = column.getText();
			System.out.println("Col data - "+text);
		}
	    
	}

}
