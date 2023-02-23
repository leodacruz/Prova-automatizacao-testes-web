package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TransferenciaPage {
	private WebDriver driver;

	public TransferenciaPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public WebElement getVoltarButton() {
		return driver.findElement(By.id("btnBack"));
	}
	
	public WebElement getSairButton() {
		return driver.findElement(By.id("btnExit"));
	}
	
	public WebElement getTransferirButton() {
		return driver.findElement(By.xpath(
				"//form[@class='styles__ContainerFormTransfer-sc-1oow0wh-0 hehMDu']/button [@type='submit']"));
	}
	
	public WebElement getNumeroContaInput() {
		return driver.findElement(By.xpath(
				"//div[@class='style__ContainerFieldInput-sc-s3e9ea-0 gQAEIG input__child']/input[@type='accountNumber']"));
	}
	
	public WebElement getDigitoContaInput() {
		return driver.findElement(By.xpath(
				"//div[@class='style__ContainerFieldInput-sc-s3e9ea-0 gQAEIG input__child']/input[@type='digit']"));
	
	}
	
	public WebElement getValorTransferenciaInput() {
		return driver.findElement(By.xpath(
				"//div[@class='style__ContainerFieldInput-sc-s3e9ea-0 gQAEIG input__child']/input[@type='transferValue']"));
	
	}
	
	public WebElement getDescricaoInput() {
		return driver.findElement(By.xpath(
				"//div[@class='style__ContainerFieldInput-sc-s3e9ea-0 gQAEIG input__child']/input[@type='description']"));
	
	}
	
	//validacao
	public WebElement getTexto() {
		return driver.findElement(By.xpath(
				"//div[@class='transfer__ContainerTexts-sc-1yjpf2r-3 isoOxX']/p[@class='transfer__TextInformation-sc-1yjpf2r-7 eUFZOb']"));
	}
	
	//alert
	public WebElement getTextoAlert() {
		return driver.findElement(By.id("modalText"));
	}
	
	//alert
		public WebElement getFecharButtonAlert() {
			return driver.findElement(By.id("btnCloseModal"));
		}
	
}
