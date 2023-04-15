#O — Open-Closed Principle (Princípio Aberto-Fechado)
Esse principio afirma que uma vez que a classe é criada, ela deve estar
aberta a extensões, mas fechada para modificações.
Isso significa que, a medida que surjam novos requisitos de regra
de negócio, a classe deve estar preparada para receber extensões, porém
sem que seja modificado o código já existente.

Um exemplo de violação desse princípio encontra-se no 
pacote: **antes**. <br>
Como o retorno do salário se dá de acordo com uma condição do tipo
da instancia do objeto utilizado, caso surja outro tipo de funcionário
(por exemplo: contrato PJ) será necessário alterar a lógica do método
**o.antes.Pagamento.calcula** adicionando mais um if e um retorno.

A refatoração desse código utilizando o princípio Aberto-Fechado
encontra-se no pacote: **refatorado**.<br>
Foi criada uma interface **Remuneracao** que é implementada pelas
classes **ContratoCLT** e **Estagiario**. Essa interface exige que
seja implementado o método **getRemuneracao**, dessa forma, 
no método **o.refatorado.Pagamento.calcula** deve chamar apenas o método
**getRemuneracao**, no caso de existir a necessidade de adicionar
mais um tipo de funcionário, será necessário apenas criar uma nova 
classe implementando a interface **Remuneracao**.