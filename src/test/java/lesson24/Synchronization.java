package lesson24;

import static org.testng.Assert.assertEquals;

import java.time.Duration;
import java.util.function.Function;

import javax.swing.JList.DropLocation;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.ClickAction;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import utilities.Base;

public class Synchronization extends Base {

	// implicit wait (by default = 0 seconds) - global wait time for everything
	// (after the line)
	public void explicitWait() {

		WebDriverWait wait15 = new WebDriverWait(driver, 15);

		wait15.until(ExpectedConditions.elementToBeClickable(By.xpath("(//button[@class='cta-1st select__cta'])[1]")));

		driver.findElement(By.xpath("(//button[@class='cta-1st select__cta'])[1]")).click();

		WebDriverWait wait30 = new WebDriverWait(driver, 30);
		wait30.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("")));

		driver.findElement(By.cssSelector("")).getText();

		wait15.until(ExpectedConditions.elementToBeClickable(By.xpath("")));

		// elementToBeClickable();
		// visibilityOfElementLocated();
		// elementToBeSelected();
		// frameToBeAvailableAndSwithToIt()
		// textToBePresentInElement()

	}

	public void fluentWait() {
		
		
		
		
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
			       .withTimeout(Duration.ofSeconds(15))
			       .pollingEvery(Duration.ofSeconds(5))
			       .ignoring(NoSuchElementException.class);
			       

	    WebElement foo = wait.until(new Function<WebDriver, WebElement>() {
			     public WebElement apply(WebDriver driver) {
			       return driver.findElement(By.id("foo"));
			     }
			   });
	    
	    String text = driver.findElement(By.id("foo")).getText();
	    
	    Assert.assertEquals(text, "Hello World!");
	    
	    
	}

}
