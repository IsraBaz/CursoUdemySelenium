package basePage;


import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasePage {
	
	//Objeto est�tico "driver" para la instancia de un solo valor
	protected static WebDriver driver;

	//Constructor
	public BasePage(WebDriver driver) {
		BasePage.driver = driver;
	}
	
	//M�todo para iniciar ChromeDriver
	public WebDriver chromeDriverConnection() {
		System.setProperty("webdriver.chrome.driver","C:\\ChromeDriver\\ChromeDriver\\ChromeDriver 103.0.5060.53\\chromedriver.exe");
		//wait = new WebDriverWait(driver,10);
		driver = new ChromeDriver();
		return driver;
	}
	
	//M�todo para la URL
	public void navigateTo(String url) {
		driver.get(url);
	}
	
	//M�todo para realizar switch a otro Frame 
	public void switchToiFrame(int iFrameIndex) {
		driver.switchTo().frame(iFrameIndex);
	}
	
	public void switchToParentFrame() {
		driver.switchTo().parentFrame();
	}
	
	//M�todo para las alertas
	public void dismissAlert() {
		try {
			driver.switchTo().alert().dismiss();
		}catch(NoAlertPresentException e) {
			e.printStackTrace();
		}
	}
	
	
}
