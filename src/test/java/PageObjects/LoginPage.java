package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
	private WebDriver driver;

	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement getEmailInput() {
		return driver.findElement(By.xpath("//div[@class ='card__login']/form/div/input[@type='email']"));
	}

	public WebElement getSenhalInput() {
		return driver.findElement(By.xpath("//div[@class ='card__login']/form/div/div/input[@type='password']"));
	}

	public WebElement getAcessarButton() {
		return driver.findElement(
				By.xpath("//div[@class ='card__login']/form/div[@class='login__buttons']/button[@type='submit']"));
	}

	public WebElement getRegistrarButton() {
		return driver.findElement(
				By.xpath("//div[@class ='card__login']/form/div[@class='login__buttons']/button[@type='button']"));
	}

	// usado para validacao que esta na pagina login
	public WebElement getText() {
		return driver.findElement(By.xpath(
				"//div[@class ='card__login']/form/div[@class='login__link']/p[@class='styles__WarnigWrapper-sc-1ota0lw-0 kpiCJH']"));
	}

}
