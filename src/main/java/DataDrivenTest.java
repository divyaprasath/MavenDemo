package com.datadriven.DataDrivenFramework;

import java.io.FileInputStream;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DataDrivenTest {

	public static void main(String[] args) throws IOException {

		com.excel.utility.Xls_Reader reader = new com.excel.utility.Xls_Reader(
				"C:\\Users\\Prasath\\eclipse-workspace\\DataDrivenFramework\\src\\main\\java\\com\\exceldata\\datadrivenframeworkdata.xlsx");

		String firstName = reader.getCellData("datadriventestdata", "firstname", 2);
		System.out.println(firstName);

		String lastName = reader.getCellData("datadriventestdata", "lastname", 2);
		System.out.println(lastName);

		String address1 = reader.getCellData("datadriventestdata", "address1", 2);
		System.out.println(address1);

		String address2 = reader.getCellData("datadriventestdata", "address2", 2);
		System.out.println(address2);

		String city = reader.getCellData("datadriventestdata", "city", 2);
		System.out.println(city);

		String state = reader.getCellData("datadriventestdata", "state", 2);
		System.out.println(state);

		String zipCode = reader.getCellData("datadriventestdata", "zipcode", 2);
		System.out.println(zipCode);

		String emailAddress = reader.getCellData("datadriventestdata", "emailaddress", 2);
		System.out.println(emailAddress);

		// System.setProperty("webdriver.chrome.driver",
		// "C:\\Users\\Prasath\\eclipse-workspace\\DataDrivenFramework\\Resources\\chromedriver.exe");
		// WebDriver driver = new ChromeDriver();

		// driver.get("https://scgi.half.ebay.com/ws/ebayISAPI.dll?RegisterEnterInfo&usage=2943&ru=");

		// driver.findElement(By.xpath("//*[@id=\"firstname\"]")).sendKeys(firstName);

//		driver.findElement(By.xpath("//*[@id=\"lastname\"]")).sendKeys(lastName);

		// driver.findElement(By.xpath("//*[@id=\"address1\"]")).sendKeys(address1);

		// driver.findElement(By.xpath("//*[@id=\"address2\"]")).sendKeys(address2);

		// driver.findElement(By.xpath("//*[@id=\"city\"]")).sendKeys(city);

		// Select select = new
		// Select(driver.findElement(By.xpath("//*[@id=\"state\"]")));
		// select.selectByVisibleText(state);

		// driver.findElement(By.xpath("//*[@id=\"zip\"]")).sendKeys(zipCode);

		// driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys(emailAddress);

	}

}
