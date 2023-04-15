package s.antes;

import java.math.BigDecimal;

public class Funcionario {
    private String nome;
    private String cargo;
    private String login;
    private String senha;


    public Funcionario() {

    }

    public boolean validaAcesso() {
        // realiza validação de acesso
        return true;
    }

    public BigDecimal calculaSalario() {
        // realiza cálculo de salário
        return null;
    }

}
