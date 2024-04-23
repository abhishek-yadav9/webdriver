package testscripts;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByCssSelector;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSS {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//driver.get("https://www.lambdatest.com/intl/en-in");
		driver.get("https://automationbookstore.dev/");
		System.out.println("page title is"+driver.getTitle());
		driver.findElement(By.id("searchBar")).sendKeys("Test");
		WebElement closeIcon = driver.findElement(
				By.cssSelector("a[title = 'Clear text']"));
		System.out.println(closeIcon.isDisplayed());
		if(closeIcon.isDisplayed()) {
			//closeIcon.click();
		}
	}

		//driver.findElement(By.cssSelector("nav div.header__menu__items > div:nth-child(2)"));


}
