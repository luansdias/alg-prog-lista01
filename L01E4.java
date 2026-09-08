import java.util.Scanner;

public class L01E4 {
    public static void main(String[] args) {
     
     double alturaMetros;
     
     Scanner leia = new Scanner(System.in);
     
     System.out.println("Digite um valor em metros:");
     alturaMetros = leia.nextDouble();
     
     int pe = (int) (alturaMetros * 3.281);
     double polegada = (alturaMetros) * 39.37;
     
     System.out.println("O valor em pés é: " + pe);
     System.out.println("O valor em polegadas é: " + polegada);

     leia.close();
     
    }
}
