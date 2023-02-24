package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import framework.Browser.Waits;

public class LoginPage {
	private WebDriver driver;
	private Waits wait;

	public LoginPage(WebDriver driver) {
		this.driver = driver;
		wait = new Waits(this.driver);
	}

	public WebElement getEmailInput() {
		return wait.visibilityOfElement(By.xpath("//div[@class ='card__login']/form/div/input[@type='email']"));
	}

	public WebElement getSenhalInput() {
		return wait.visibilityOfElement(By.xpath("//div[@class ='card__login']/form/div/div/input[@type='password']"));
	}

	public WebElement getAcessarButton() {
		return wait.visibilityOfElement(By.xpath(
				"//div[@class='login__buttons']/button[@class='style__ContainerButton-sc-1wsixal-0 otUnI button__child']"));
	}

	public WebElement getRegistrarButton() {
		return wait.visibilityOfElement(By.xpath(
				"//div[@class='login__buttons']/button[@class='style__ContainerButton-sc-1wsixal-0 ihdmxA button__child']"));
	}

	// usado para validacao que esta na pagina login
	public WebElement getConhecaNossosRequesitosHiperLink() {

		return wait.visibilityOfElement(By.xpath("//div[@class='login__link']/a[@class='styles__Link-sc-osobjw-0 xzjxU']"));

	}

	// para o alert
	public WebElement getTexto() {
		return wait.visibilityOfElement(By.id("modalText"));
	}
    //para o alert
	public WebElement getFecharLink() {
		return wait.visibilityOfElement(By.id("btnCloseModal"));
	}

}
