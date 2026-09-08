import java.util.Scanner;

public class L01E7 {
    public static void main(String[] args) {
      
      double reais;
      double conversao;
      
      Scanner leia = new Scanner(System.in);
      
      System.out.println("Digite um valor em reais:");
      reais = leia.nextDouble();
      
      System.out.println("Digite uma taxa de conversão. Por ex: 0.17, 0.20, 0.50");
      conversao = leia.nextDouble();
      
      double euro = (reais) * (conversao);
      
      System.out.println("Seu valor em euros é EUR: " + euro);
      
      leia.close();
  
    }
}
