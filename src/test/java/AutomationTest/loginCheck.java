package AutomationTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class loginCheck {

	public static void main(String[] args) {
	

		WebDriverManager.firefoxdriver().setup();
		WebDriver driver =new FirefoxDriver();
		
		
        //Windows & link
		driver.get("https://eticket.railway.gov.bd/login");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("mobile_number")).sendKeys("01883385458");
		driver.findElement(By.id("password")).sendKeys("mq7Hwir4o0");
		driver.findElement(By.className("login-form-submit-btn")).click();
		}
}
