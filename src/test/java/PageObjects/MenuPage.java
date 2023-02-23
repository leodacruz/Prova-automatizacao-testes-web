package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MenuPage {
	private WebDriver driver;

	public MenuPage(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement getTranferenciaButton() {
		return driver.findElement(By.id("btn-TRANSFERÊNCIA"));
	}

	public WebElement getExtratoButton() {
		return driver.findElement(By.id("btn-EXTRATO"));
	}

	public WebElement getSairButton() {
		return driver.findElement(By.id("btnExit"));
	}

	// validacao
	//public WebElement getBemVindoTexto() {
	//	return driver.findElement(By.xpath(
	//			"//div[@class='home__ContainerText-sc-1auj767-7 iDA-Ddb']/p[@class='home__Text-sc-1auj767-9 jjmPHj']"));
	//}

	public WebElement getContaDigitalTexto() {
		return driver.findElement(By.id("textAccountNumber"));
	}

}
