package amz.core;

import static amz.core.Amz_DriverFactory.getDriver;

import org.openqa.selenium.By;

public class Amz_BasePage {

	
	/********************************************************/	
	public void escrever(By by, String texto){
		getDriver().findElement(by).clear();
		getDriver().findElement(by).sendKeys(texto);
	}
	
	public void click(By by) {
		getDriver().findElement(by).click();
	}
	/********************************************************/	
	
	
	public void escreve(String xpath, String texto){
		escrever(By.xpath(xpath), texto);
	}
	
	
	public void clicar(String xpath) {
		click(By.xpath(xpath));
	}
	
	public void clica(String id) {
		click(By.id(id));
	}
}
