package surat;

import org.testng.annotations.Test;

import surat_test.HomePageObjects;
import utilities.Base;

public class SearchTest extends Base {
	/// String urlString = "http://automationpractice.com/index.php";
	@Test
	public void testSearch() {

		// Properties prop = new Properties();
		// FileInputStream fileProp = new
		// FileInputStream("src\\main\\java\\properties\\app.properties");
		// prop.load(fileProp);

		driver.get("http://automationpractice.com/index.php");

		HomePageObjects homePageObjects = new HomePageObjects(driver);

		homePageObjects.insertSearchBox();
		homePageObjects.clickButton();
		homePageObjects.selectColor();
		homePageObjects.selectSizeM();
		
		for(int i=1;i<=5;i++) {
			//homePageObjects.addOneMore();
		}
		
		

	}

}
