package br.com.projeto.teste.salario;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(features = "classpath:br/com/projeto/resources", tags = "@SalarioTest", glue = "br.com.projeto.teste.salario", monochrome = true, dryRun = false)
public class SalarioTest {
	
}
