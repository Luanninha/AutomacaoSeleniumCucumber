package Steps;

import java.io.IOException;

import Elementos.Elementos;
import Metodos.Metodos;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Steps {

	Metodos m = new Metodos();
	Elementos e = new Elementos();

	@Given("que acesse o site {string}")
	public void que_acesse_o_site(String string) {

		m.AbrirNavegador(string);
	}

	@When("clica no botao abrir conta")
	public void clica_no_botao_abrir_conta() {

		m.clicar(e.getBtnABrirConta());
	}

	@When("preenche os dados")
	public void preenche_os_dados() throws InterruptedException {

		m.preencher(e.getCampoNome(), "Kevin Ricardo Santos");
		m.preencher(e.getCampoTelefone(), "(27) 99435-0759");
		m.pausa(2000);
		m.preencher(e.getCampoEmail(), "kevin_santos@temavonfeccaosjc.com.br");
		m.preencher(e.getCampoCpf(), "436.429.750-03");
		m.preencher(e.getCampoNasc(), "12/04/1949");
	}

	@When("clica no checkbox")
	public void clica_no_checkbox() {

		m.clicar(e.getCheckbox());
		
	}

	@Then("clica em continuar")
	public void clica_em_continuar() {
		m.clicar(e.getBtnContinuar());
	}

	@Then("aparecera a mensagem")
	public void aparecera_a_mensagem() throws IOException {
		m.validarTexto(e.getMensagemValid(), "Prontinho! Recebemos os seus dados");
		String evidencia = "AutomationPractice";
		m.tirarPrint("./printevidencia/" + evidencia + ".png");
		
		

	}

}