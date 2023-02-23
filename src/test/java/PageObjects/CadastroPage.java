package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import framework.Browser.Waits;

public class CadastroPage {
	private WebDriver driver;
	private Waits wait;

	public CadastroPage(WebDriver driver) {
		this.driver = driver;
		 wait= new Waits(this.driver);  
	}

	public WebElement getVoltarLoginButton() {
		return wait.visibilityOfElement(By.id("btnBackButton"));
	}

	public WebElement getEmailInput() {
		return wait.visibilityOfElement(By.xpath("//div[@class ='card__register']/form/div/input[@type='email']"));
	}

	public WebElement getNomeInput() {
		return wait.visibilityOfElement(By.xpath("//div[@class ='card__register']/form/div/input[@type='name']"));
	}

	public WebElement getSenhaInput() {
		return wait.visibilityOfElement(By.xpath("//div[@class ='card__register']/form/div/div/input[@name='password']"));
	}
	
	public WebElement getVisibilidadeSenhaButton() {
		return wait.visibilityOfElement(By.cssSelector(
				"#__next > div > div.pages__FormBackground-sc-1ee1f2s-2.jNpkvU > div > div.card__register > form > div:nth-child(4) > button"));
		}

	public WebElement getConfirmaSenhaInput() {
		return wait.visibilityOfElement(
				By.xpath("//div[@class ='card__register']/form/div/div/input[@name='passwordConfirmation']"));
	}
	
	public WebElement getVisibilidadeConfirmaSenhaButton() {
		return wait.visibilityOfElement(By.cssSelector(
				"#__next > div > div.pages__FormBackground-sc-1ee1f2s-2.jNpkvU > div > div.card__register > form > div:nth-child(5) > button"));
		}

	// usado para validacao
	public WebElement getCriarContaComSaldoText() {
		return wait.visibilityOfElement(By.xpath(
				"//div[@class='styles__ContainerToggle-sc-7fhc7g-2 cJsFYf']/p[@class='styles__ToggleText-sc-7fhc7g-3 eZmSOs']"));
	}

	public WebElement getCriarContaComSaldoButton() {
		return wait.visibilityOfElement(By.id("toggleAddBalance"));
	}

	public WebElement getCadastrarButton() {
		return wait.visibilityOfElement(By.xpath("//div[@class ='card__register']/form/button[@type='submit']"));
	}
}
