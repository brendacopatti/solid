package l.refatoracao;

import java.math.BigDecimal;

public class Estagiario extends Funcionario {
    @Override
    public BigDecimal getRemuneracao() {
        return new BigDecimal(1000);
    }
}
