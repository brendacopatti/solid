# L — Liskov Substitution Principle (Princípio da substituição de Liskov)
Possui esse nome pois foi criado em 1988 por Bárbara Liskov. Tendo
a definição formal: <br>
>Se para cada objeto o1 do tipo S há um objeto o2 do tipo T de forma que, para todos os programas P definidos em termos de T, o comportamento de P é inalterado quando o1 é substituído por o2 então S é um subtipo de T

Isso quer dizer que, classes "filhas" devem poder ser substituir a
sua classe base ou ser utilizada como se fosse a sua classe base.

Um exemplo de violação desse princípio: 
**antes**.
No método **l.antes.Salario.calcula** sempre é necessário testar 
qual é a classe que o objeto funcionário está implementando, dessa
forma, não é possível apena utilizar um método que já se encontra na
classe base para realizar a lógica.

A refatoração desse código utilizando o princípio de Liskov 
encontra-se em: **refatorado**
Foi criada a classe **Funcionario** com o método **getRemuneracao()**
nas classes **Estagiario** e **ContratoCLT** foi estendida a classe
**Funcionario** e sobrescrito o método **getRemuneracao()**, dessa
forma, foi possível desenvolver o método **l.refatoracao.Salario.calcula**
recebendo como parâmetro um objeto do tipo **Funcionario** 
sendo necessário apenas chamar o método **getRemuneracao()**.