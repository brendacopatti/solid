package i.antes;

import java.math.BigDecimal;

public class Estagiario implements Remuneracao {
    @Override
    public BigDecimal getRemuneracao() {
        return new BigDecimal(1000);
    }

    @Override
    public BigDecimal getPorcentagemINSS() {
        return null;
    }
}
