package o.antes;

import java.math.BigDecimal;

public class Pagamento {

    public BigDecimal calcula(Funcionario funcionario) {
        if (funcionario instanceof Estagiario) {
            return ((Estagiario) funcionario).getBolsa();
        } else {
            return ((ContratadoCLT) funcionario).getSalario();
        }
    }

}
