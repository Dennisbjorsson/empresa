import java.time.LocalDate;
import java.util.Comparator;
import java.util.List;

public class RelatoriosDaEmpresa {


    public static List<Funcionario> filtrarFuncionarios(
            List<Empresa> empresas) {

         LocalDate inicio = LocalDate.of(1975, 1, 1);
        LocalDate fim = LocalDate.of(1985, 12, 31);

          return empresas.stream()
                .flatMap(empresa -> empresa.getFuncionarios().stream())
                .filter(funcionario ->
                        !funcionario.getDataNascimento().isBefore(inicio)
                                && !funcionario.getDataNascimento().isAfter(fim)
                                && funcionario.getSalario() <= 3000.00)
                 .toList();
    }


      public static int somarNumerosPares(List<Integer> numeros) {

        return numeros.stream()
                .filter(numero -> numero % 2 == 0)
                .mapToInt(Integer::intValue)
                .sum();
    }


    public static List<Funcionario> maioresSalariosCLT(
            List<Empresa> empresas) {

        return empresas.stream()
                .flatMap(empresa -> empresa.getFuncionarios().stream())
                .filter(funcionario ->
                        funcionario.getContrato() == Contrato.CLT
                                && funcionario.getIdade() < 25 )
                .sorted(Comparator.comparingDouble(
                        Funcionario::getSalario).reversed())
                .limit(30)
                .toList();
    }




}