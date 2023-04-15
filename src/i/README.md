# I — Interface Segregation Principle (Princípio da Segregação da Interface)
Esse princípio defende que uma classe não deve ser obrigada a implementar
interfaces ou métodos que ela não utilizará.

Um exemplo de violação desse princípio encontra-se em: **antes**.
A implementação da interface **Remuneracao** obriga que os métodos
**getRemuneracao()** e **getPorcentagemINSS()** sejam implementados. No
caso da classe **ContratadoCLT** os dois métodos são utilizados, porém
no caso da classe **Estagiario** o método **getPorcentagemINSS()** é
implementado retornando null, pois esse tipo de funcionário não 
possui essa informação.

A refatoração desse código seguindo o princípio da segregação da
interface encontra-se em: **refatorado**.
Nesse caso, foi mantida a classe **Remuneracao** que obriga que seja
implementado apenas o método **getRemuneracao()** e extraído o método
**getPorcentagemINSS()** para a classe **DeducoesLegais**, dessa forma
a classe **ContratadoCLT** pode implementar as duas interfaces, conforme
a sua necessidade e a classe **Estagiario** pode implementar apenas
a interface **Remuneracao**, livrando-se da necessidade de implementar
o método **getPorcentagemINSS()**