package Tasks;


import org.openqa.selenium.WebDriver;

import PageObjects.LoginPage;
import Validations.ValidaCadastro;
import Validations.ValidaLogin;
import Validations.ValidaMenu;
import framework.Utils.FilesOperation;

public class LoginTask {
	private WebDriver driver;
	private LoginPage homePage;
	private ValidaLogin validaLogin;
	private ValidaCadastro validaCadastro;
	private ValidaMenu validaMenu;

	public LoginTask(WebDriver driver) {
		this.driver = driver;
		homePage = new LoginPage(this.driver);
		validaLogin = new ValidaLogin(this.driver);
		validaCadastro= new ValidaCadastro(this.driver);
		validaMenu = new ValidaMenu(this.driver);
	}

	public void acessarCadastro() {
		validaLogin.validaHome();
		homePage.getRegistrarButton().click();
		validaCadastro.validaCadastro();
	}

	public void fazerLogin(String conta) {
		homePage.getEmailInput().sendKeys(FilesOperation.getProperties("contas").getProperty(conta+"email"));
		validaLogin.validaLoginEmail();
		homePage.getSenhalInput().sendKeys(FilesOperation.getProperties("contas").getProperty(conta+"senha"));
		homePage.getVisibilidadadeSenhaButton().click();
		validaLogin.validaLoginSenha();
		homePage.getAcessarButton().click();
		validaMenu.validaMenu();
	}

}
