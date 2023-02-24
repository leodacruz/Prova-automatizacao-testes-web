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
	private ValidaLogin validaHome;
	private ValidaCadastro validaCadastro;
	private ValidaMenu validaMenu;

	public LoginTask(WebDriver driver) {
		this.driver = driver;
		homePage = new LoginPage(this.driver);
		validaHome = new ValidaLogin(this.driver);
		validaCadastro= new ValidaCadastro(this.driver);
		validaMenu = new ValidaMenu(this.driver);
	}

	public void acessarCadastro() {
		validaHome.validaHome();// ve se esta na pagina home
		homePage.getRegistrarButton().click();//clica para acessar cadastro
		validaCadastro.validaCadastro();//ve se chegou na pagina de cadastro
		
	}

	public void fazerLogin(String conta) {
		homePage.getEmailInput().sendKeys(FilesOperation.getProperties("contas").getProperty(conta+"email"));
		homePage.getSenhalInput().sendKeys(FilesOperation.getProperties("contas").getProperty(conta+"senha"));
		homePage.getAcessarButton().click();
		validaMenu.validaMenu();
	}

}