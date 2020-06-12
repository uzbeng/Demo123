package library;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePageObjs {

	WebDriver driver;

	/*
	 * 
	 * Objects
	 * 
	 */
	@FindBy(xpath = "//input[@id='search_query_top']")
	WebElement searchBox;
	// By searchBox = By.xpath("");

	@FindBy(xpath = "//button[@name='submit_search']")
	WebElement searchBtn;
	// By searchBtn = By.xpath("//button[@name='submit_search']");

	@FindBy(xpath = "//div[@id='best-sellers_block_right']//li[1]/a")
	WebElement searchResultOpt1;
	// By searchResultOpt1 =
	// By.xpath("//div[@id='best-sellers_block_right']//li[1]/a");

	/*
	 * 
	 * Constructor
	 * 
	 */
	public HomePageObjs(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	/*
	 * 
	 * Actions on objects
	 * 
	 */

	// This is the search box on top of the window
	public void insertSearchStr(String searchKey) {
		searchBox.sendKeys(searchKey);
	}

	public void clickSrchBtn() {
		searchBtn.click();
	}

	public void chooseFirstOption() {
		searchResultOpt1.click();
	}

}
