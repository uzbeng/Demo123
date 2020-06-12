package online_shopping;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.Test;

import library.HomePageFactory;
import library.HomePageObjs;
import utilities.Base;

public class SearchTest extends Base {

	// @Test
	public void testSearch() throws IOException {

		// Opening the url
		driver.get(prop.getProperty("url"));

		HomePageObjs homePageObjs = new HomePageObjs(driver);

		// Search box insert "blouse"
		homePageObjs.insertSearchStr("shirt");

		// Click on search button
		homePageObjs.clickSrchBtn();

		// Clicking on the first option
		homePageObjs.chooseFirstOption();

	}

	// @Test
	public void testSearchWithNumeric() {
		// Opening the url
		driver.get("");

		HomePageFactory homePageFactory = new HomePageFactory(driver);

		// Search box insert "blouse"
		homePageFactory.insertSearchStr("3456");

		// Click on search button
		homePageFactory.clickSrchBtn();

		// Clicking on the first option
		homePageFactory.chooseFirstOption();

	}

	// @Test
	public void testProperties() throws IOException {
		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream("src\\main\\java\\properties\\app.properties");
		prop.load(fis);

		System.out.println(prop.getProperty("url"));
	}

	@Test
	public void testFacebook() {
		// Opening the url
		driver.get(prop.getProperty("url"));
	}

}
