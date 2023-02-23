package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GenericPage {
	private WebDriver driver;

	public GenericPage(WebDriver driver) {
		this.driver = driver;
	}
	
	/*
	 * public WebElement getEmailInput() {
	    return driver.findElement(By.xpath(
	    		"//div[@class ='card__login']/form/div[@class='style__ContainerFieldInput-sc-s3e9ea-0 gQAEIG input__child']/input[@type='email']"));
		}

		public WebElement getSenhalInput() {

		}
	 * 
	 * */
	
}
