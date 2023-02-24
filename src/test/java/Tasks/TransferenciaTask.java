package Tasks;

import org.openqa.selenium.WebDriver;

import PageObjects.TransferenciaPage;
import Validations.ValidaLogin;

public class TransferenciaTask {
	WebDriver driver;
	TransferenciaPage transferenciaPage;
	private ValidaLogin validaLogin;

	public TransferenciaTask(WebDriver driver) {
		this.driver = driver;
		transferenciaPage = new TransferenciaPage(this.driver);
		validaLogin = new ValidaLogin(this.driver);
	}

	public void sairDaConta() {
		transferenciaPage.getSairButton().click();
		validaLogin.validaLogin();
	}
	
	public void fazerTransferencia() {
		
	}

}
