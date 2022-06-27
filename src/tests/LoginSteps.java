package tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.GooglePage;

public class LoginSteps {
	
	//Objeto Driver
	WebDriver driver;
		
	//Variable con referencia a loginPage
	GooglePage googlePage;

	@BeforeTest
	public void setUp() {
		googlePage = new GooglePage(driver);
		driver = googlePage.chromeDriverConnection();
		//Url de la aplicación
		googlePage.navigateTo("https://www.google.com.mx/");
		//Maximizar ventana
		driver.manage().window().maximize();	
	}
		
	@SuppressWarnings("deprecation")
	@Test
	public void login() throws InterruptedException {
		googlePage.searchTextField("Stellantis México");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		googlePage.clickGoogleSearch();
	}
		
	@AfterTest
	public void tearDown() {
		driver.quit();
	}
		
}
