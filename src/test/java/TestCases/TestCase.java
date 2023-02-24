package TestCases;


import java.io.IOException;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.Status;

import Tasks.CadastroTask;
import Tasks.LoginTask;
import Tasks.MenuTask;
import framework.TestBase;
import framework.Report.Report;
import framework.Report.ReportType;
import framework.Report.Screenshot;
import framework.Utils.FilesOperation;

public class TestCase extends TestBase {

	private WebDriver driver = this.getDriver();

	private String Properties = "url";
	private LoginTask loginTask = new LoginTask(this.driver);
	private CadastroTask cadastroTask = new CadastroTask(this.driver);
	private MenuTask menuTask = new MenuTask(this.driver);

	@BeforeEach
	public void initialTest() throws IOException {
		getDriver().get(FilesOperation.getProperties(Properties).getProperty("urlProva"));
	}

	@Test
	public void validarFrames() {

		try {
			Report.createTest("Criação da Primeira Conta", ReportType.GROUP);
			Report.createStep("Acessar Cadastro");
			loginTask.acessarCadastro();
			Report.createStep("Cadastro da conta");
			cadastroTask.fazerCadastro("conta1");
			Report.createStep("Validar a conta");
			loginTask.fazerLogin("conta1");
			menuTask.menuSair();
			
			Report.createTest("Criação da Segunda Conta", ReportType.GROUP);
			Report.createStep("Acessar Cadastro");
			loginTask.acessarCadastro();
			Report.createStep("Cadastro da conta");
			cadastroTask.fazerCadastro("conta2");
			Report.createStep("Validar a conta");
			loginTask.fazerLogin("conta2");
			menuTask.menuSair();
			
			Report.createTest("Transferencia Bancaria", ReportType.GROUP);
			
			
			

		} catch (Exception e) {
			Report.log(Status.FAIL, e.getMessage(), Screenshot.captureBase64(driver));
		}
	}

}
