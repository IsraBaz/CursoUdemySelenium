package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import basePage.BasePage;

public class GooglePage extends BasePage {
	
	/*Declaración de elementos de la página de Google*/
	//Locator campo de texto búsqueda
	By searchTextField = By.xpath("//input[@title='Buscar']");
	//Locator botón buscar
	By searchButton = By.xpath("//input[@value='Buscar con Google']");
	//Locator buscar en google
	
	//Constructor SUPER para las propiedades de BasePage
	public GooglePage(WebDriver driver) {
		super(driver);
	}
	
	public void searchTextField(String searchText) {
		driver.findElement(searchTextField).sendKeys(searchText);
	}
	
	public void clickGoogleSearch() {
		driver.findElement(searchButton).click();
	}
	
}
