package week3.day4;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsSnapdeal {

	public static void main(String[] args) {
		//1. Launch (https://www.snapdeal.com/)
		ChromeDriver driver=new ChromeDriver();
        driver.get("https://www.snapdeal.com/");
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	    
			//2. Go to "Men's Fashion".
	    driver.findElement(By.xpath("//span[@class='catText']")).click();
	    
			//3. Go to "Sports Shoes".
	    driver.findElement(By.xpath("//span[text()='Sports Shoes']")).click();
	    
			//4. Get the count of sports shoes.
	    String count = driver.findElement(By.xpath("//span[@class='category-name category-count']")).getText();
	    System.out.println("Number of sport shoes : "+count);
	    
			//5. Click on "Training Shoes".
	    driver.findElement(By.xpath("//div[text()='Training Shoes']")).click();
	    
			//6. Sort the products by "Low to High".
	    driver.findElement(By.xpath("//i[@class='sd-icon sd-icon-expand-arrow sort-arrow']")).click();
	    driver.findElement(By.xpath("//li[@data-sorttype='plth']")).click();
	    
			//7. Check if the displayed items are sorted correctly.
			//8. Select any price range ex:(500-700).
	    driver.findElement(By.xpath("//input[@name='fromVal']")).sendKeys("500");
	    driver.findElement(By.xpath("//input[@name='toVal']")).sendKeys("700");
	    driver.findElement(By.xpath("//div[@class='price-go-arrow btn btn-line btn-theme-secondary']")).click();
	    
			//9. Filter by any colour.
	    driver.findElement(By.xpath("//label[@for='Color_s-Black']")).click();
	    
			//10. Verify all the applied filters.
			//11. Mouse hover on the first resulting "Training Shoes".
	    WebElement shoe = driver.findElement(By.xpath("//img[@class='product-image wooble']"));
	    Actions act=new Actions(driver);
	    act.moveToElement(shoe);
	    
			//12. Click the "Quick View" button.
	    driver.findElement(By.xpath("//div[@class='clearfix row-disc']/div")).click();
	    
			//13. Print the cost and the discount percentage.
			//14. Take a snapshot of the shoes.
			//15. Close the current window.
			//16. Close the main window.


	}

}
