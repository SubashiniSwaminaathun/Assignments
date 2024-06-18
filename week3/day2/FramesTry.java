package week3.day2;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FramesTry {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver=new ChromeDriver();
        driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_confirm");
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	    
	    //Getting into Try iframe
	    Thread.sleep(5000);
	    WebElement frame1 = driver.findElement(By.xpath("//iframe[@id='iframeResult']"));
	    driver.switchTo().frame(frame1);
	    
	    //Clicking "Try it" button
	    Thread.sleep(5000);
	    WebElement el = driver.findElement(By.xpath("//button[text()='Try it']"));
	    el.click();

	    //Handling alert by accepting
	    Alert alert1 = driver.switchTo().alert();
	    alert1.accept();
	    
	    //Capturing pop up message
	    String text=driver.findElement(By.xpath("//p[@id='demo']")).getText();
	    
	    //Checking whether accepted or dismissed
	    if(text.contains("OK")) {
	    	System.out.println("User accepted");
	    }
	    else {
	    	System.out.println("User dismissed");
	    }
	    
	    
	    
	}

}
