import java.util.Scanner;

public class CalculoSalarioTaxas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite o valor da sua hora de trabalho: R$ ");
        double valorHora = scanner.nextDouble();
        
        System.out.print("Digite o número de horas trabalhadas no mês: ");
        double horasTrabalhadas = scanner.nextDouble();
        
        double salarioBruto = valorHora * horasTrabalhadas;
        double impostoRenda = salarioBruto * 0.11;
        double inss = salarioBruto * 0.08;
        double sindicato = salarioBruto * 0.05;
        double salarioLiquido = salarioBruto - impostoRenda - inss - sindicato;
        
        System.out.println("Salário Bruto: R$ " + salarioBruto);
        System.out.println("Valor pago ao INSS: R$ " + inss);
        System.out.println("Valor pago ao Sindicato: R$ " + sindicato);
        System.out.println("Salário Líquido: R$ " + salarioLiquido);
        
        scanner.close();
    }
}
