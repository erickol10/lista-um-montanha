import java.util.Scanner;

public class LojaDeTintas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite o tamanho em metros quadrados da área a ser pintada: ");
        double area = scanner.nextDouble();
        
        // Calculando a quantidade de litros de tinta necessária
        double litrosTinta = area / 3.0;
        
        // Calculando a quantidade de latas de tinta necessária
        int latasTinta = (int) Math.ceil(litrosTinta / 18.0);
        
        // Calculando o preço total das latas de tinta
        double precoTotal = latasTinta * 80.0;
        
        System.out.println("Quantidade de latas de tinta a serem compradas: " + latasTinta);
        System.out.println("Preço total: R$ " + precoTotal);
        
        scanner.close();
    }
}
