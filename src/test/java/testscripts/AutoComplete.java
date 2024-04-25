package testscripts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AutoComplete {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		Actions actions = new Actions(driver);
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/tooltip/");
		
		WebElement frame1 = driver.findElement(By.cssSelector(".demo-frame"));
		driver.switchTo().frame(frame1);
		WebElement inp = driver.findElement(By.cssSelector("#tags"));
		
		inp.sendKeys("as");
		List<WebElement> items = driver.findElements(By.cssSelector("ul#ui-id-1i"));
		System.out.println("Number of matching items...."+items.size());
		for(WebElement item: items) {
			System.out.println(item.getText());
			if(item.getText().equalsIgnoreCase(expValue)) {
				item.click();
				break;
			}
		}
	}

}
