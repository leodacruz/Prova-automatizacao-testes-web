package TestCases;

import java.io.File;
import java.io.FileOutputStream;
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

public class TestTestCase extends TestBase {

	private WebDriver driver = this.getDriver();

	private String Properties = "url";
	private LoginTask loginTask = new LoginTask(this.driver);
	private CadastroTask cadastroTask = new CadastroTask(this.driver);
	private MenuTask menuTask= new MenuTask(this.driver);

	@BeforeEach

	public void initialTest() throws IOException {
		//FilesOperation.setProperties("contas", "conta1email", "tste");
		
		
		getDriver().get(FilesOperation.getProperties(Properties).getProperty("urlProva"));
		//getDriver().get("https//bugbank.netlify.app/");
	}

	@Test
	public void validarFrames() {

		try {
			Report.createTest("Realizar Validações Frames", ReportType.GROUP);
			Report.createStep("Acessar Cadastro");
			loginTask.acessarCadastro();
			Report.createStep("Criar a primeira conta");
			cadastroTask.fazerCadastro("conta1");
			Report.createStep("Validar a primeira conta");
			loginTask.fazerLogin("conta1");
			menuTask.menuSair();
			
		//	Report.createStep("Criar a segunda conta");
		//	loginTask.acessarCadastro();
		//	cadastroTask.fazerCadastro("conta2");
			
			

		} catch (Exception e) {

			Report.log(Status.FAIL, e.getMessage(), Screenshot.captureBase64(driver));

		}

	}

}
