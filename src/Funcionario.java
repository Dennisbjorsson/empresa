import java.time.LocalDate;

public class Funcionario {

    private String nome;
    private LocalDate dataNascimento;
    private double salario;
    private Contrato contrato;
    private int idade;

     public Funcionario(String nome, LocalDate dataNascimento,
                       double salario, Contrato contrato, int idade) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.salario = salario;
        this.contrato = contrato;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public double getSalario() {
        return salario;
    }

    public Contrato getContrato() {
        return contrato;
    }

    public int getIdade() {
        return idade;
    }

    @Override
    public String toString() {
        return String.format(
                "Nome: %s | Nascimento: %s | Salário: R$ %.2f | Contrato: %s | Idade: %d",
                nome, dataNascimento, salario, contrato, idade
        );
    }
}