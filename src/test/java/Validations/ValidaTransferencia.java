package Validations;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.Status;

import PageObjects.TransferenciaPage;
import framework.Report.Report;
import framework.Report.Screenshot;

public class ValidaTransferencia {
	private WebDriver driver;
	private TransferenciaPage transferenciaPage;

	public ValidaTransferencia(WebDriver driver) {
		this.driver = driver;
		transferenciaPage=new TransferenciaPage(this.driver);
	}
	
	public void validaTransferencia() {
		try {
			String message = transferenciaPage.getTexto().getText();
			Assertions.assertEquals("Saldo disponível", message);
			Report.log(Status.PASS, "Validação Extrato com sucesso: " + message, Screenshot.captureBase64(driver));
		} catch (Exception e) {
			Report.log(Status.FAIL, "Validação Extrato ERRO!!:"+e, Screenshot.captureBase64(driver));
		}	
	}
	

}
