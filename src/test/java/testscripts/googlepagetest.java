package testscripts;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class googlepagetest {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//driver.get("https://www.google.com/");
		driver.navigate().to("https://www.google.com/");
		System.out.println("Page Title: " + driver.getTitle());
		//WebElement srchBox = driver.findElement(By.id("APjFqb"));
		//WebElement srchBox = driver.findElement(By.className("APjFqb"));
		WebElement srchBox = driver.findElement(By.name("APjFqb"));
		srchBox.sendKeys("Java Tutorial");
		srchBox.sendKeys(Keys.ENTER);
		
		System.out.println("Page Title:..."+driver.getTitle());
		System.out.println("New URL: "+ driver.getCurrentUrl());

		driver.navigate().back();
		
		System.out.println("Page Title after back():..." +driver.getTitle());
		
		driver.navigate().forward();
	}

}
