import java.util.Scanner;

public class CalculoSalario {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite o valor ganho por hora: ");
        double valorPorHora = scanner.nextDouble();
        
        System.out.print("Digite o número de horas trabalhadas no mês: ");
        double horasTrabalhadas = scanner.nextDouble();
        
        double salarioTotal = valorPorHora * horasTrabalhadas;
        System.out.println("O total do seu salário no mês é: " + salarioTotal);
        
        scanner.close();
    }
}
