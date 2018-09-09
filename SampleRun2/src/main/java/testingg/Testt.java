package testingg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testt {

	public static void main(String[] args) throws InterruptedException {
	
	
	
		 WebDriver driver;
	     
	        System.setProperty("webdriver.chrome.driver", "C:\\Users\\dvillur2\\Downloads\\chromedriver_win32\\chromedriver.exe");
		    driver = new ChromeDriver();
	        driver.get("http://newtours.demoaut.com/mercurysignon.php");
	        driver.findElement(By.name("RGISTER")).click();
	        
	        Thread.sleep(3000);
	        
	        driver.quit();
		
}


}





