import java.util.Scanner;

public class CalculoPesoIdeal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite a altura da pessoa em metros: ");
        double altura = scanner.nextDouble();
        
        double pesoIdeal = (72.7 * altura) - 58;
        System.out.println("O peso ideal dessa pessoa é: " + pesoIdeal + " kg");
        
        scanner.close();
    }
}
