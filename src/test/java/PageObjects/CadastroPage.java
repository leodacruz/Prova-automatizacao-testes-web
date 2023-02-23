package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CadastroPage {
	private WebDriver driver;

	public CadastroPage(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement getVoltarLoginButton() {
		return driver.findElement(By.xpath("//div[@class ='card__register']/form/div/a[@id='btnBackButton']"));
	}

	public WebElement getEmailInput() {
		return driver.findElement(By.xpath("//div[@class ='card__login']/form/div/input[@type='email']"));
	}

	public WebElement getNomeInput() {
		return driver.findElement(By.xpath("//div[@class ='card__login']/form/div/input[@type='email']"));
	}

	public WebElement getSenhaInput() {
		return driver.findElement(By.xpath("//div[@class ='card__login']/form/div/input[@type='email']"));
	}

	public WebElement getConfirmaSenhaInput() {
		return driver.findElement(By.xpath("//div[@class ='card__login']/form/div/input[@type='email']"));
	}

	public WebElement getCriarContaComSaldoButton() {
		return driver.findElement(By.xpath("//div[@class ='card__login']/form/div/input[@type='email']"));
	}

	public WebElement getCadastrarButton() {
		return driver.findElement(By.xpath("//div[@class ='card__login']/form/div/input[@type='email']"));
	}
}
