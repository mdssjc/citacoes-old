package com.github.mdssjc.citacoes.base;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

/**
 * Configuração do BDD com Cucumber.
 * 
 * @author Marcelo dos Santos
 *
 */
@RunWith(Cucumber.class)
@CucumberOptions(plugin = { "pretty", "html:target/cucumber" })
public class RunCitacoesTest {
}
