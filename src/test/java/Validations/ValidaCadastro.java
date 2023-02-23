package Validations;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.Status;

import PageObjects.CadastroPage;
import framework.Browser.JavaScriptExecutor;
import framework.Browser.Waits;
import framework.Report.Report;
import framework.Report.Screenshot;

public class ValidaCadastro {
	private WebDriver driver;
	private CadastroPage cadastroPage;
	private Waits wait;

	public ValidaCadastro(WebDriver driver) {
		this.driver = driver;
		cadastroPage = new CadastroPage(this.driver);
		wait = new Waits(this.driver);
	}

	public void validaCadastro() {
		try {

			String message = cadastroPage.getCriarContaComSaldoText().getText();
			Assertions.assertEquals("Criar conta com saldo ?", message);
			Report.log(Status.PASS, "Cadastro carregado com sucesso: " + message, Screenshot.captureBase64(driver));
		} catch (Exception e) {
			Report.log(Status.FAIL, "Erro ao entrar no Cadastro: " + e);
		}

	}

	public void validaCadastroInputs(String valida) {
		try {
			String message = cadastroPage.getEmailInput().getText();
			Assertions.assertNotEquals(" ", message);
			Report.log(Status.PASS, valida + " inserido com sucesso: " + message, Screenshot.captureBase64(driver));
		} catch (Exception e) {
			Report.log(Status.FAIL, (valida + " nao inserido = "+e), Screenshot.captureBase64(driver));
		}
	}

	public void validaCriarContaSaldoButton() {
		try {
			Assertions.assertTrue(cadastroPage.getCriarContaComSaldoAtivadoButton().isDisplayed());
			Report.log(Status.PASS, "Conta com saldo ativada ", Screenshot.captureBase64(driver));
		} catch (Exception e) {
			Report.log(Status.FAIL, ("Conta com saldo desativada "+e), Screenshot.captureBase64(driver));
		}
	}
	
	public void validarContaCadastradaAlert() {
		try {
			Assertions.assertTrue(cadastroPage.getAlertTexto().isDisplayed());
			Report.log(Status.PASS, "Conta Criada com sucesso ", Screenshot.captureBase64(driver));
		} catch (Exception e) {
			Report.log(Status.FAIL, ("Erro ao criar a conta "+e), Screenshot.captureBase64(driver));
		}
	}

}
