package l.refatoracao;

import java.math.BigDecimal;

public class Salario {
    public BigDecimal calcula(Funcionario funcionario) {
        return funcionario.getRemuneracao();
    }
}
