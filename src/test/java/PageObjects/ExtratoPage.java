package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ExtratoPage {
	private WebDriver driver;

	public ExtratoPage(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement getVoltarButton() {
		return driver.findElement(By.id("btnBack"));
	}

	public WebElement getSairButton() {
		return driver.findElement(By.id("btnExit"));

	}

//validacao
	public WebElement getSaldoDisponivelTexto() {
		return driver.findElement(By.xpath(
				"//div[@class='bank-statement__ContainerBalance-sc-7n8vh8-9 dntobx']/p[@class='bank-statement__LabelText-sc-7n8vh8-10 UPwdn']"));
	}
}
