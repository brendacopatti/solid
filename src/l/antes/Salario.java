package l.antes;

import java.math.BigDecimal;

public class Salario {
    public BigDecimal calcula(Funcionario funcionario) {
        if (funcionario instanceof Estagiario) {
            return ((Estagiario) funcionario).getBolsa();
        } else if (funcionario instanceof ContratadoCLT) {
            return ((ContratadoCLT) funcionario).getSalario();
        }
        return null;
    }
}
