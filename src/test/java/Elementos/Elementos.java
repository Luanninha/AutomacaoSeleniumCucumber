package Elementos;

import org.openqa.selenium.By;

public class Elementos {

	private By btnAcesse = By.cssSelector("#gatsby-focus-wrapper > div > header > div > nav > div.sc-esYiGF.dhxanf > div > div > span:nth-child(6) > div");
	private By btnABrirConta = By.cssSelector("body > div.sc-fqkvVR.eMDHOt > div.sc-cWSHoV.bKpNJG > div.sc-jxOSlx.cmYZmR > button");
	private By campoNome = By.id("nome");
	private By campoTelefone = By.id ("celular");
	private By campoEmail =  By.id("email");
	private By campoCpf = By.id("cpf");
	private By campoNasc = By.id("dataNascimento");
	private By checkbox = By.cssSelector("body > div:nth-child(47) > div.sc-dtBdUo.eMbyIA > div > form > div.sc-bXCLTC.bVusLg > label");
	private By btnContinuar = By.cssSelector("body > div:nth-child(47) > div.sc-dtBdUo.eMbyIA > div > form > button");
	private By mensagemValid = By.cssSelector("body > div:nth-child(51) > div.sc-dtBdUo.eMbyIA > div > p.sc-jlZhew.gPgMxx");

	public By getBtnAcesse() {
		return btnAcesse;
	}

	public By getBtnABrirConta() {
		return btnABrirConta;
	}

	public By getCampoNome() {
		return campoNome;
	}

	public By getCampoTelefone() {
		return campoTelefone;
	}

	public By getCampoEmail() {
		return campoEmail;
	}

	public By getCampoCpf() {
		return campoCpf;
	}

	public By getCampoNasc() {
		return campoNasc;
	}

	public By getCheckbox() {
		return checkbox;
	}

	public By getBtnContinuar() {
		return btnContinuar;
	}

	public By getMensagemValid() {
		return mensagemValid;
	}
}
