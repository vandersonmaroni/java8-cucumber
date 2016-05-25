package br.com.projeto.teste;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "classpath:br/com/projeto/resources/", tags = "@ContaTeste", glue = "br.com.projeto.teste", monochrome = true, dryRun = false)
public class ContaTeste {

}
