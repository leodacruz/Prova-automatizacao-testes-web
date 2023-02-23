package Validations;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.Status;

import PageObjects.LoginPage;
import framework.Report.Report;
import framework.Report.Screenshot;

public class ValidaLogin {
	private WebDriver driver;
	private LoginPage home;

	public ValidaLogin(WebDriver driver) {
		this.driver = driver;
		home = new LoginPage(this.driver);
	}

	public void validaHome() {
		try {
			String message = home.getConhecaNossosRequesitosHiperLink().getText();
			Assertions.assertEquals("Conheça nossos requisitos", message);
			//Assertions.assertTrue(home.getConhecaNossosRequesitosHiperLink().isDisplayed());
			Report.log(Status.PASS, "Login carregado com sucesso: " + message,Screenshot.captureBase64(driver));
		} catch (Exception e) {
			Report.log(Status.FAIL, "Erro ao validar Home: " + e);
		}
	}
}
