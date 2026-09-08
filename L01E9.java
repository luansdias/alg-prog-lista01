import java.util.Scanner;

public class L01E9 {
    public static void main(String[] args) {
    
    double preco;
    
    Scanner leia = new Scanner(System.in);
    
    System.out.println("Digite o valor original do produto:");
    preco = leia.nextDouble();
    
    double desconto = (preco) * 0.15;
    double precoDesconto = (preco) - (desconto);
    
    System.out.println("O preço final com desconto aplicado é R$: " + precoDesconto);
    
    leia.close();

    }
}
