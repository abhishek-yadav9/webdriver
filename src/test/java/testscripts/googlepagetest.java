package testscripts;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class googlepagetest {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		System.out.println("Page Title: " + driver.getTitle());
		WebElement srchBox = driver.findElement(By.id("APjFqb"));
		srchBox.sendKeys("Java Tutorial");
		srchBox.sendKeys(Keys.ENTER);

	}

}
