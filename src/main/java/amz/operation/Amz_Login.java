package amz.operation;

import static amz.core.Amz_DriverFactory.getDriver;

import java.time.Duration;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

import amz.core.Amz_BasePage;

public class Amz_Login extends Amz_BasePage{
	
	@Before
	public void inicializa() {
		getDriver().get("https://amazon.com.br/");
	}
	
	@Test
	public void Login() {
		
		WebDriver driver = getDriver();
		
		clicar("//div/a[1]/div/span");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
		
		escreve("//div[1]/input[1]", "testfafm@gmail.com");
		clicar("//span/input");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
		
		escreve("//div/div[1]/input", "qazxsw12");
		clicar("//span/input");
		
	}
	
}
