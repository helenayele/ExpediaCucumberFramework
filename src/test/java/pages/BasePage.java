package pages;

import java.time.Duration;

import core.DriverFactory;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {
	
	protected WebDriver driver = null;
	
	public BasePage() {
		this.driver = new DriverFactory().getDriver("chrome");
	}
	public WebDriver getDriver(){
		 return this.driver;
	}
	public WebElement waitForElement(long time, WebElement element) throws Exception{
		WebDriverWait wait = new WebDriverWait(driver, time);
		return wait.ignoring(NoSuchElementException.class)
		.pollingEvery(Duration.ofSeconds(1))
		.until(ExpectedConditions.elementToBeClickable(element));
	}

}
