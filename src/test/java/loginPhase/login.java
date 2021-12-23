package loginPhase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class login {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://accounts.google.com/signin/v2/identifier?flowName=GlifWebSignIn&flowEntry=ServiceLogin");
		
		WebElement emailbox = driver.findElement(By.name("identifier"));
		emailbox.sendKeys("ahmedfarjana455@gmail.com");
		Thread.sleep(5000);
		
		driver.findElement(By.cssSelector("button[type='button'] span[class='VfPpkd-vQzf8d']")).click();
				
	}
}
