package Tasks;

import org.openqa.selenium.WebDriver;

import PageObjects.LoginPage;
import PageObjects.MenuPage;
import Validations.ValidaLogin;

public class MenuTask {
	private WebDriver driver;
	private MenuPage menuPage;
	private ValidaLogin validaLogin;

	public MenuTask(WebDriver driver) {
		this.driver = driver;
		menuPage= new MenuPage(this.driver);
		validaLogin= new ValidaLogin(this.driver);
	}
	
	public void menuSair() {
		menuPage.getSairButton().click();
		validaLogin.validaHome();
	}
	
}
