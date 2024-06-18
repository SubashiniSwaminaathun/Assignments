package week3.day4;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebtableErail {

	public static void main(String[] args) {
		//- Launch the erail URL. 
		ChromeDriver driver=new ChromeDriver();
        driver.get("https://erail.in/");
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	    	    
	    //- Enter "MAS" as the "From" station. 
	    driver.findElement(By.id("txtStationFrom")).clear();
	    driver.findElement(By.id("txtStationFrom")).sendKeys("MAS");
	    driver.findElement(By.xpath("//div[text()='Mgr Chennai Ctr']")).click();
	    
	    //- Enter "MDU" as the "To" station. 
	    driver.findElement(By.id("txtStationTo")).clear();
	    driver.findElement(By.id("txtStationTo")).sendKeys("MDU");
	    driver.findElement(By.xpath("//div[text()='Madurai Jn']")).click();
	    
	    //- Uncheck the "Sort on Date" checkbox. 
	    driver.findElement(By.xpath("//input[@id='chkSelectDateOnly']")).click();
	    
	    //- Retrieve the train names from the web table. 
	    //- Verify if there are any duplicate train names in the web table.
	    

	}

}
