package Metodos;

import static org.junit.Assert.assertEquals;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Metodos {
	WebDriver driver;

	// Metodo para abrir/maximizar navegador

	public void AbrirNavegador(String url) {
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
	}

	// Metodo para clicar

	public void clicar(By elemento) {
		driver.findElement(elemento).click();
	}

	// Metodo para preencher
	public void preencher(By elemento, String nome) {
		driver.findElement(elemento).sendKeys(nome);
	}

	// Metodo para pausar

	public void pausa(int tempo) throws InterruptedException {
		Thread.sleep(tempo);
	}

	// Metodo para fechar navegador

	public void fecharNavegador() {
		driver.quit();
	}

	// Metodo para validar texto

	public void validarTexto(By elemento, String texto) {
		String mensagem = driver.findElement(elemento).getText();
		assertEquals(texto, mensagem);
	}

	// Metodo para tirar print

	public void tirarPrint(String nome) throws IOException {
		TakesScreenshot print = ((TakesScreenshot) driver);
		File SrcFile = print.getScreenshotAs(OutputType.FILE);
		File Desfile = new File("./src/evidencias" + nome + ".png");
		FileUtils.copyFile(SrcFile, Desfile);
	}

}
