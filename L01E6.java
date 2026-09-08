import java.util.Scanner;

public class L01E6 {
    public static void main(String[] args) {
      
      double produto1;
      double produto2;
      double produto3;
      
      Scanner leia = new Scanner(System.in);
     
      System.out.println("Qual valor do primeiro produto?");
      produto1 = leia.nextDouble();
      
      System.out.println("Qual valor do segundo produto?");
      produto2 = leia.nextDouble();
      
      System.out.println("Qual valor do terceiro produto?");
      produto3 = leia.nextDouble();
      
      double total = (produto1 + produto2 + produto3);
      
      System.out.println("O total da compra é R$: " + total);
      
      System.out.println("Insira o pagamento:");
      double pagamento = leia.nextDouble();
      
      
      while (pagamento < total) {
          
          System.out.println("Pagamento insuficiente, por favor, insira uma quantia válida:");
          pagamento = leia.nextDouble();
    
      }
      
      double troco = (pagamento - total);
      System.out.println("Pagamento realizado! Seu troco é R$: " + troco);
      
      leia.close();

    }
}

