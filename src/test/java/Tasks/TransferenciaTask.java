package Tasks;

import org.openqa.selenium.WebDriver;

import PageObjects.TransferenciaPage;

public class TransferenciaTask {
	WebDriver driver;
	TransferenciaPage transferenciaPage;

	public TransferenciaTask(WebDriver driver) {
		this.driver = driver;
		transferenciaPage = new TransferenciaPage(this.driver);
	}
}
