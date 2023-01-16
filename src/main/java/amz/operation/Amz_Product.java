package amz.operation;

import static amz.core.Amz_DriverFactory.getDriver;

import java.time.Duration;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

import amz.core.Amz_BasePage;

public class Amz_Product extends Amz_BasePage {
	@Before
	public void inicializa() {
		getDriver().get("https://amazon.com.br/");
	}

	@Test
	public void Product() {

		WebDriver driver = getDriver();

		/* Busca Produto */

		escreve("//div[3]/div[1]/input", "Suporte para Notebook");
		clicar("//div/span/input");

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));

		/* Seleciona Produto */

		clicar("//div[7]/div/div/div/div/div[3]/div[1]/h2/a/span");

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));

		/* Add ao carrinho */

		clicar("//div[13]/div[1]/span/span/span/input");

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));

		/* Vai para o carrinho */
		clicar("//div[1]/span/span/a");

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));

		/* Exclui do carrinho */
		clicar("//span[2]/span/input");

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));

	}
}
