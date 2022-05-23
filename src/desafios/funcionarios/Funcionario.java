package desafios.funcionarios;

public abstract class Funcionario {
    private String nome;
    private Long cpf;
    protected final Double SALARIO_MINIMO = 1212.0;

    public Funcionario(String nome, Long cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    public abstract double calcularSalario();


}
