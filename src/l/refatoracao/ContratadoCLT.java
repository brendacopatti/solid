package l.refatoracao;

import java.math.BigDecimal;

public class ContratadoCLT extends Funcionario {
    @Override
    public BigDecimal getRemuneracao() {
        return new BigDecimal(5000);
    }
}
