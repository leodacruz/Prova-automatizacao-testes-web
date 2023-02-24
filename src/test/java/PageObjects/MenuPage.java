package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import framework.Browser.Waits;

public class MenuPage {
	private WebDriver driver;
	private Waits wait;

	public MenuPage(WebDriver driver) {
		this.driver = driver;
		wait = new Waits(this.driver);
	}

	public WebElement getTranferenciaButton() {
		return wait.visibilityOfElement(By.id("btn-TRANSFERÊNCIA"));
	}

	public WebElement getExtratoButton() {
		return wait.visibilityOfElement(By.id("btn-EXTRATO"));
	}

	public WebElement getSairButton() {
		return wait.visibilityOfElement(By.id("btnExit"));
	}

	// validacao
	public WebElement getValidaTexto() {
		return wait.visibilityOfElement(By.xpath(
				"//div[@class='home__Footer-sc-1auj767-16 eeLkgF']/p[@class='home__Text-sc-1auj767-9 jjmPHj']"));
	}

	public WebElement getContaDigitalTexto() {
		return wait.visibilityOfElement(By.id("textAccountNumber"));
	}

}
