package o.refatorado;

import java.math.BigDecimal;

public class ContratadoCLT implements Remuneracao {

    @Override
    public BigDecimal getRemuneracao() {
        return new BigDecimal(5000);
    }
}
