package l.refatoracao;

import java.math.BigDecimal;

public class ContratoCLT extends Funcionario {
    @Override
    public BigDecimal getRemuneracao() {
        return new BigDecimal(5000);
    }
}
