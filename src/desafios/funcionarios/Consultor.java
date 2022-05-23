package desafios.funcionarios;

public class Consultor extends Funcionario{
    private double valorDaHora;
    private long horasTrabalhadas;


    public Consultor(String nome, Long cpf, double valorDaHora, long horasTrabalhadas) {
        super(nome, cpf);
        this.valorDaHora = valorDaHora;
        this.horasTrabalhadas = horasTrabalhadas;
    }

    @Override
    public double calcularSalario() {
        return valorDaHora*horasTrabalhadas;
    }

    public double getValorDaHora() {
        return valorDaHora;
    }

    public void setValorDaHora(double valorDaHora) {
        this.valorDaHora = valorDaHora;
    }

    public long getHorasTrabalhadas() {
        return horasTrabalhadas;
    }

    public void setHorasTrabalhadas(long horasTrabalhadas) {
        this.horasTrabalhadas = horasTrabalhadas;
    }
}
