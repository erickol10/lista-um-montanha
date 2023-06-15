import java.util.Scanner;

public class ControlePescador {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o peso dos peixes em quilos: ");
        double peso = scanner.nextDouble();
        double limite = 50.0;

        double excesso = 0.0;
        double multa = 0.0;

        if (peso > limite) {
            excesso = peso - limite;
            multa = excesso * 4.0;
        }

        System.out.println("Peso dos peixes: " + peso + " kg");
        if (peso > limite) {
            System.out.println("Excesso de peso: " + excesso + " kg");
            System.out.println("Valor da multa a ser paga: R$ " + multa);
        } else {
            System.out.println("Não houve excesso de peso. Nenhuma multa a ser paga.");
        }

        scanner.close();
    }
}
