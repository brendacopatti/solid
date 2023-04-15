package o.refatorado;

import java.math.BigDecimal;

public class Pagamento {
    public BigDecimal calcula(Remuneracao funcionario) {
        return funcionario.getRemuneracao();
    }
}
