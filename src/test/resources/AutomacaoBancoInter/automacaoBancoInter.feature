
@tag
Feature: cadastro banco inter

  @tag1
  Scenario: validacao de cadastro
    Given que acesse o site "https://inter.co/super-app-inter/"
    When clica no botao abrir conta
    And preenche os dados
    And clica no checkbox
    Then clica em continuar
    And aparecera a mensagem

 