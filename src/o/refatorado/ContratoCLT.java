package o.refatorado;

import java.math.BigDecimal;

public class ContratoCLT implements Remuneracao {

    @Override
    public BigDecimal getRemuneracao() {
        return new BigDecimal(5000);
    }
}
