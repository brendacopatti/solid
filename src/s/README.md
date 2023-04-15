#S - Single Responsiblity Principle (Princípio da responsabilidade única)
Esse princípio afirma que a classe deve ter apenas uma responsabilidade.

Um exemplo de violação desse princípio este encontra-se na classe: Funcionario.java <br>
Nela, além dos atributos do objeto Funcionario,
encontra-se um metodo para cálculo de salário 
e um método de validação de classe de acesso, 
o que deixa a classe com 3 responsabilidades.

A refatoração desse código utilizando o princípio de responsabilidade única encontra-se no pacote: s/refatorado <br>
Nesse caso, foram divididas em 3 classes:<br>
**Funcionario:** que tem a responsabilidade apenas de conter os 
atributos e métodos do objeto.<br>
**Acesso:** que tem a responsabilidade apenas de realizar verificações
referente aos acessos.<br>
**Salário:** possui a responsabilidade de realizar verificações e cálculos
salariais.
