package i.antes;

import java.math.BigDecimal;

public class ContratadoCLT implements Remuneracao {

    @Override
    public BigDecimal getRemuneracao() {
        return new BigDecimal(5000);
    }

    @Override
    public BigDecimal getPorcentagemINSS() {
        return new BigDecimal(11);
    }
}
