package library;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePageFactory {
	
	WebDriver driver;
	
	/*
	 * 
	 * Objects
	 * 
	 */
	
	By searchBox = By.xpath("//input[@id='search_query_top']");
	By searchBtn = By.xpath("//button[@name='submit_search']");
	By searchResultOpt1 = By.xpath("//div[@id='best-sellers_block_right']//li[1]/a");
	
	/*
	 * 
	 * Constructor
	 * 
	 */
	public HomePageFactory(WebDriver driver) {
		this.driver = driver;
	}
	
	
	/*
	 * 
	 * Actions on objects
	 * 
	 */
	
	// This is the search box on top of the window
	public void insertSearchStr(String searchKey) {
		driver.findElement(searchBox).sendKeys(searchKey);
	}
	
	public void clickSrchBtn() {
		driver.findElement(searchBtn).click();
	}
	
	public void chooseFirstOption() {
		driver.findElement(searchResultOpt1).click();
	}
	
	
	

}
