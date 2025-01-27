package gitHub;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class GitHub {
	
	public static void loginUrl(WebDriver driver, String urlPage) {
		driver.get(urlPage);
	}
	
	public static void clickElements(WebDriver driver) {
		driver.findElement(By.className("card-up")).click();
	}
	
	public static void clickTextBox(WebDriver driver) {
		driver.findElement(By.xpath("//span[text()='Text Box']")).click();
	}
	
	public static void enterUserName(WebDriver driver, String uName) {
		driver.findElement(By.xpath("//input[@id='userName']")).sendKeys(uName);
	}
	
	public static void enterUserEmalId(WebDriver driver, String uEmailId) {
		driver.findElement(By.xpath("//input[@id='userEmail']")).sendKeys(uEmailId);
	}

}
