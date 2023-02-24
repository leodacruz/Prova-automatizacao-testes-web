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
			String message = menuPage.getValidaTexto().getText();
			Assertions.assertEquals("Obrigado por escolher o nosso banco", message);
			Report.log(Status.PASS, "Validação Menu com sucesso: " + message, Screenshot.captureBase64(driver));
		} catch (Exception e) {
			Report.log(Status.FAIL, "Validação Menu ERRO!!:"+e, Screenshot.captureBase64(driver));
		}
	}
}
