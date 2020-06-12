package surat_test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class HomePageObjects {
	WebDriver driver;
	By searchBox = By.xpath("//input[@id='search_query_top']");
	By submitBtnBy = By.xpath("//button[@type='submit']");
	By selectColorBy = By.xpath("//a[@id='color_8']");
	By selectSizeBy = By.xpath("//*[@class='form-control attribute_select no-print']");

	public HomePageObjects(WebDriver driver) {
		this.driver = driver;

	}

	public void insertSearchBox() {
		driver.findElement(searchBox).sendKeys("blouses");
	}

	public void clickButton() {
		driver.findElement(submitBtnBy).click();
	}

	public void selectColor() {
		driver.findElement(selectColorBy).click();
	}

	public void selectSizeM() {
		Select sizeSelect = new Select(driver.findElement(selectSizeBy));
		sizeSelect.selectByVisibleText("M");
	}
	
	public void selectSizeS() {
		Select sizeSelect = new Select(driver.findElement(selectSizeBy));
		sizeSelect.selectByVisibleText("S");
	}
	
	public void selectSizeL() {
		Select sizeSelect = new Select(driver.findElement(selectSizeBy));
		sizeSelect.selectByVisibleText("L");
	}

}
