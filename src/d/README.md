# D — Dependency Inversion Principle (Princípio da inversão da dependência)

Esse princípio define que, módulos de alto nível não devem depender
de módulos de baixo nível e sim de abstrações. Além disso, as abstrações
não devem depender de detalhes e sim os detalhes dependerem das abstrações.

Um exemplo de violação desse princípio encontra-se em: **antes**.
Nesse caso a classe **Tarefa** possui um atributo do tipo
**Funcionario**, nessa situação, caso seja necessário implementar
uma nova classe **Estagiario** por exemplo, será necessário alterar
o código original para conseguir buscar o dado de tempo estimado
do objeto.

Refatorando o código, foi criada a interface **Funcionario** com a 
assinatura do método **getTempoEstimadoHoras()**, e na classe
**Tarefa** foi criado o atributo do tipo **Funcionario**, assim
sempre que surja um novo tipo de funcionário, a classe deverá
implementar a interface **Funcionario**, não sendo necessária alteração
na classe **Tarefa**.