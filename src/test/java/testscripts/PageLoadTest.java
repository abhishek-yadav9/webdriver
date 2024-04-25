package testscripts;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PageLoadTest {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(15));
		driver.get("http://uitestingplayground.com/");
		driver.findElement(By.linkText("LoadDelay")).click();
		driver.findElement(By.cssSelector("button.btn.btn-primary")).click();

	}

}
