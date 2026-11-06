import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        // Funcionários da empresa A
        List<Funcionario> funcionariosA = new ArrayList<>();

         funcionariosA.add(new Funcionario(
                "Will", LocalDate.of(1980, 5, 10),
                2500.00, Contrato.CLT, 46));

           funcionariosA.add(new Funcionario(
                "Dennis", LocalDate.of(1990, 3, 20),
                4500.00, Contrato.CLT, 36));

        funcionariosA.add(new Funcionario(
                "Pedro", LocalDate.of(2005, 8, 15),
                5000.00, Contrato.CLT, 21));

        funcionariosA.add(new Funcionario(
                "Sigrid", LocalDate.of(2003, 2, 12),
                3500.00, Contrato.PJ, 23));

        // Funcionários da empresa B

        List<Funcionario> funcionariosB = new ArrayList<>();

        funcionariosB.add(new Funcionario(
                "João", LocalDate.of(1978, 11, 5),
                2800.00, Contrato.PJ, 47));

        funcionariosB.add(new Funcionario(
                "Lucas", LocalDate.of(2004, 6, 18),
                6000.00, Contrato.CLT, 22));

        funcionariosB.add(new Funcionario(
                "Fernanda", LocalDate.of(1985, 9, 25),
                3000.00, Contrato.CLT, 41));

        funcionariosB.add(new Funcionario(
                "Andreia", LocalDate.of(2002, 4, 8),
                4200.00, Contrato.CLT, 24));

          // Criando as empresas
        Empresa empresaA = new Empresa("Empresa A", funcionariosA);
        Empresa empresaB = new Empresa("Empresa B", funcionariosB);

        List<Empresa> empresas = List.of(empresaA, empresaB);


        System.out.println( "=== FUNCIONÁRIOS NASCIDOS ENTRE 1975 E 1985 ===");

        List<Funcionario> resultado1 =
                RelatoriosDaEmpresa.filtrarFuncionarios(empresas);

        resultado1.forEach(System.out::println);

        System.out.println("\n=== SOMA DOS NÚMEROS PARES ===");

        List<Integer> numeros = List.of(2, 5, 8, 10, 13, 16, 21);

        int soma = RelatoriosDaEmpresa.somarNumerosPares(numeros);

        System.out.println("Soma dos números pares: " + soma);


        System.out.println("\n=== 30 MAIORES SALÁRIOS CLT COM MENOS DE 25 ANOS ===");

        List<Funcionario> resultado3 =
                RelatoriosDaEmpresa.maioresSalariosCLT(empresas);

        resultado3.forEach(System.out::println);
    }
}