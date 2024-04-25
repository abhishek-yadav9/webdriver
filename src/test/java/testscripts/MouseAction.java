package testscripts;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class MouseAction {

	public static void main(String[] args) throws InterruptedException, IOException {
		ChromeOptions options = new ChromeOptions();
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
	
		Actions actions = new Actions(driver);
		/*
		driver.get("https://demo.opencart.com/");
		WebElement srchBox = driver.findElement(By.name("search"));
		
		
		WebElement menu = driver.findElement(
				By.cssSelector("ul.nav.navbar-nav > li:nth-child(3)"));
		WebElement menuitem = driver.findElement(
				By.xpath("//ul[@class='list-unstyled']//a[contains(text(), 'Monitors'(2)"));
		actions.moveToElement(menu).click(menuitem).build().perform();
*/
		driver.get("https://www.stqatools.com/demo/DoubleClick.php");
		
		TakesScreenshot screen = (TakesScreenshot)driver;
		File srcImg = screen.getScreenshotAs(OutputType.FILE);
		String path = System.getProperty("user.dir")
				+"/screenshots/"+ System.currentTimeMillis()+".png";
		FileUtils.copyFile(srcImg,new File(path));
		
		String strPlaceholder = driver.findElement(
				By.id("searchBar")).getAttribute("placeholder");
		System.out.println(strPlaceholder);
		WebElement closeIcon = driver.findElement(
				By.cssSelector("a[title = 'Clear text']"));
				
		
		File srcImg1 = closeIcon.getScreenshotAs(OutputType.FILE);
		String path1 = System.getProperty("user.dir")
				+"/screenshots/"+ System.currentTimeMillis()+".png";
		FileUtils.copyFile(srcImg,new File(path));

		System.out.println(closeIcon.isDisplayed());
		/*WebElement btn  = driver.findElement(
				By.xpath("//button[text() = 'Click Me / Double Click Me!']"));
		Thread.sleep(5000);
		
		actions.doubleClick(btn).doubleClick(btn).build().perform();
		*/
	}

}
