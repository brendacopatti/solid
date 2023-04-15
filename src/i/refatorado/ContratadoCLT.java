package i.refatorado;

import java.math.BigDecimal;

public class ContratadoCLT implements Remuneracao, DeducoesLegais {
    @Override
    public BigDecimal getRemuneracao() {
        return new BigDecimal(5000);
    }

    @Override
    public BigDecimal getPorcentagemINSS() {
        return new BigDecimal(11);
    }
}
