package br.com.projeto.teste.salario;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;


public class GerenciadorDeSalario {
	
	private Map<Integer, Funcionario> funcionario = new HashMap<>();
	
	public GerenciadorDeSalario(final List<Funcionario> funcionario ) {
		this.funcionario = funcionario.stream().collect(Collectors.toMap(Funcionario::getId, Function.<Funcionario> identity()));
	}	
	
	public void aumentaSalario(final Integer id, final int aumentaPorcentagem) {
		Funcionario pessoaNomeada = funcionario.get(id);
		float salarioAntigo = pessoaNomeada.getSalario();
		pessoaNomeada.setSalario(salarioAntigo + salarioAntigo * aumentaPorcentagem / 100);
	}
	
	public Funcionario getHolerite(final int id) {
		return funcionario.get(id);
	}
	
	public Map<Integer, Funcionario> getFuncionario() {
		return funcionario;
	}

	public void setFuncionario(Map<Integer, Funcionario> funcionario) {
		this.funcionario = funcionario;
	}
	
}
