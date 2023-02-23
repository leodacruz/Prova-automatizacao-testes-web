package Validations;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.Status;

import PageObjects.MenuPage;
import framework.Report.Report;
import framework.Report.Screenshot;

public class ValidaMenu {
	private WebDriver driver;
	private MenuPage menuPage;

	public ValidaMenu(WebDriver driver) {
		this.driver = driver;
		menuPage = new MenuPage(this.driver);
	}

	public void validaMenu() {
		try {
			String message = menuPage.getExtratoButton().getText();
			Assertions.assertEquals("EXTRATO", message);
			Report.log(Status.PASS, "Cadastro carregado com sucesso: " + message, Screenshot.captureBase64(driver));
		} catch (Exception e) {
			Report.log(Status.FAIL, "Cadastro carregado com sucesso: ", Screenshot.captureBase64(driver));
		}
	}

}
