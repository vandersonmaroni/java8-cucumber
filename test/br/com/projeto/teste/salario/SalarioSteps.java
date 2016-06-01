package br.com.projeto.teste.salario;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsEqual.equalTo;

import java.util.List;

import javax.inject.Inject;

import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;


public class SalarioSteps {
	
	@Inject
	private GerenciadorDeSalario gerenciadorDeSalario;
	@Inject
	private Funcionario funcionario;
	
	@Dado("^O sistema de gestao de funcionarios iniciar com os seguintes data$")
	public void o_sistema_de_gestao_de_funcionarios_iniciaria_com_os_seguintes_dados(final List<Funcionario> funcionario) throws Throwable { 
		gerenciadorDeSalario = new GerenciadorDeSalario(funcionario);
	}
	
	@Quando("^O chefe aumentar o salario do funcionario com o id '(\\d+)' por (\\d+)%$")
	public void o_chefe_aumentar_o_salario_do_funcionario_com_o_id_por(final int id, final int aumentoPorcentual) throws Throwable {
		gerenciadorDeSalario.aumentaSalario(id, aumentoPorcentual);
	}
	
	@Entao("^O salario para o empregado  com o id (\\d+)'' sera mostrado o valor de (\\d+)$")
	public void o_salario_para_o_empregado_com_o_id_sera_mostrado_o_valor_de(final int id, final float salario) throws Throwable {
		funcionario = gerenciadorDeSalario.getHolerite(id);
		assertThat(funcionario.getSalario(), equalTo(salario));
	}
}	
