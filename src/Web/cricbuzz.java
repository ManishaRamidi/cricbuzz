package Web;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class cricbuzz extends CapabilityWeb{

	public static void main(String[] args) throws MalformedURLException {
		AndroidDriver<AndroidElement> driver =WebCapability(); 
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://m.cricbuzz.com/");
		//driver.findElement(MobileBy.AccessibilityId("Search")).sendKeys("cricbuzz");
		 driver.findElement(By.xpath("//a[contains(@href,'menu')]")).click();;
		 driver.findElement(By.xpath("//a[text()='Home']")).click();
		 JavascriptExecutor js = (JavascriptExecutor) driver;
		 WebElement ele = driver.findElement(By.xpath("(//span[@class='cbz-ui-home-headline'])[1]"));
		 js.executeScript("arguments[0].scrollIntoView(true);", ele);
		 ele.click();
	}
}
