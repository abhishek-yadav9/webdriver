package testscripts;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHoverTest {

	public static void main(String[] args) throws IOException {
		WebDriver driver = new ChromeDriver();
		Actions actions = new Actions(driver);
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/tooltip/");
		
		driver.switchTo().frame(driver.findElement(By.cssSelector(".demo-frame")));
		
		driver.findElement(By.id("age")).sendKeys(Keys.ARROW_DOWN);
		actions.moveToElement(driver.findElement(By.id("age"))).perform();
		String strTxt = driver.findElements(By.className("ui-tooltip-content").getText()).toString();
		System.out.println("Tooltip text is .." +strTxt);
		WebElement age = driver.findElement(By.id("age"));
		age.sendKeys("20");
	}

}
