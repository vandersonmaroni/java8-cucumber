  # language: pt
  @SalarioTest
  Funcionalidade: Modificar o salario do funcionario
  Dado o sistema de gest�o de funcion�rios iniciar� com os seguintes dados
  	|id   | usuario           | salario        |
  	|1    | marcos            | 5000           |
  	|2    | felipe            | 4000           |
  	|3    | saulos            | 3000           |
  	|4    | guilhe            | 7000           |
  
  Quando o chefe aumentar o sal�rio do funcionario com o id '1' por 5%
  Entao o sal�rio para o empregado  com o id '1' sera mostrado o valor de 5500