package l.antes;

import java.math.BigDecimal;

public class Salario {
    public BigDecimal calcula(Funcionario funcionario) {
        if (funcionario instanceof Estagiario) {
            return ((Estagiario) funcionario).getBolsa();
        } else if (funcionario instanceof ContratoCLT) {
            return ((ContratoCLT) funcionario).getSalario();
        }
        return null;
    }
}
