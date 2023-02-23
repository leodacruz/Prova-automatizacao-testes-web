package Tasks;

import org.openqa.selenium.WebDriver;

import PageObjects.CadastroPage;
import PageObjects.LoginPage;
import Validations.ValidaCadastro;
import Validations.ValidaLogin;
import framework.Utils.FakersGeneration;
import framework.Utils.FilesOperation;

public class CadastroTask {
	private WebDriver driver;
	private CadastroPage cadastroPage;
	private FakersGeneration faker;
	private ValidaCadastro validaCadastro;
	private ValidaLogin validaLogin;

	public CadastroTask(WebDriver driver) {
		this.driver = driver;
		cadastroPage = new CadastroPage(this.driver);
		faker = new FakersGeneration(this.driver);
		validaCadastro = new ValidaCadastro(driver);
		validaLogin= new ValidaLogin(this.driver);
	}

	public void fazerCadastro(String conta) {
		
		
		// salvando o email e senha e nome no arquivo properties
		FilesOperation.setProperties("contas",conta+"nome", faker.getFirstName());
		
		FilesOperation.setProperties("contas", conta+"email",
				FilesOperation.getProperties("contas").getProperty(conta+"nome") + "@Gmail.com");
		
		FilesOperation.setProperties("contas", conta+"senha",
				FilesOperation.getProperties("contas").getProperty(conta+"nome"));

		//email
		cadastroPage.getEmailInput().sendKeys(FilesOperation.getProperties("contas").getProperty(conta+"email"));
		validaCadastro.validaCadastroInputs("E-mail");
		
		//nome
		cadastroPage.getNomeInput().sendKeys(FilesOperation.getProperties("contas").getProperty(conta+"nome"));
		validaCadastro.validaCadastroInputs("Nome");
		
		//senha
		cadastroPage.getSenhaInput().sendKeys(FilesOperation.getProperties("contas").getProperty(conta+"senha"));
		cadastroPage.getVisibilidadeSenhaButton().click();
		validaCadastro.validaCadastroInputs("Senha");
		
		//confirma senha
		cadastroPage.getConfirmaSenhaInput().clear();
		cadastroPage.getConfirmaSenhaInput()
				.sendKeys(FilesOperation.getProperties("contas").getProperty(conta+"senha"));
		cadastroPage.getVisibilidadeConfirmaSenhaButton().click();
		validaCadastro.validaCadastroInputs("Confirma Senha");
		
		//ativa conta saldo
		cadastroPage.getCriarContaComSaldoButton().click();
		validaCadastro.validaCriarContaSaldoButton();
		
		//confirma cadastro
		cadastroPage.getCadastrarButton().click();
		validaCadastro.validarContaCadastradaAlert();
		
		//fecha o alert
		cadastroPage.getFecharButton().click();
		validaLogin.validaHome();
		
		//faz o login para confirmar que fez a conta
		
		
		
		
		
		
		
	}
}
