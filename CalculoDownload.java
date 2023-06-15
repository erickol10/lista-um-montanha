import java.util.Scanner;

public class CalculoDownload {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite o tamanho do arquivo para download (em MB): ");
        double tamanhoArquivo = scanner.nextDouble();
        
        System.out.print("Digite a velocidade do link de Internet (em Mbps): ");
        double velocidadeInternet = scanner.nextDouble();
        
        // Convertendo a velocidade de Mbps para MB por segundo
        double velocidadeMBps = velocidadeInternet / 8;
        
        // Calculando o tempo aproximado de download em segundos
        double tempoDownloadSegundos = tamanhoArquivo / velocidadeMBps;
        
        // Convertendo o tempo de download de segundos para minutos
        double tempoDownloadMinutos = tempoDownloadSegundos / 60;
        
        System.out.println("Tempo aproximado de download: " + tempoDownloadMinutos + " minutos");
        
        scanner.close();
    }
}
