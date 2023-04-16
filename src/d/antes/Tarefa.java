package d.antes;

public class Tarefa {
    private Funcionario funcionario;

    public Tarefa(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

    public long getTempoEstimadoHoras() {
        return this.funcionario.getTempoEstimadoHoras();
    }
}
