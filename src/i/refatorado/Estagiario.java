package i.refatorado;

import java.math.BigDecimal;

public class Estagiario implements Remuneracao {
    @Override
    public BigDecimal getRemuneracao() {
        return new BigDecimal(1000);
    }
}
