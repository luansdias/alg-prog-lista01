import java.util.Scanner;

public class L01E3 {
    public static void main(String[] args) {
     
     int ano;
     
     Scanner leia = new Scanner(System.in);
     
     System.out.println("Digite um número");
     ano = leia.nextInt();
     
     double segundos = (ano * 365 * 24 * 60 * 60);
     
     System.out.println("O valor em segundos é: " + segundos);
     
     leia.close();
    }
}
