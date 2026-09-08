import java.util.Scanner;

public class L01E1 {
    public static void main(String[] args) {
        
        double a;
        double b;
        double c;
        
        Scanner leia = new Scanner(System.in);
        
        System.out.println("Digite o primeiro número:");
        a = leia.nextDouble();
        
        System.out.println("Digite o segundo número:");
        b = leia.nextDouble();
        
        System.out.println("Digite o terceiro número:");
        c = leia.nextDouble();
        
        double media = (a + b + c) / 3;
        
        System.out.println("A média é: " + media);
        
        leia.close();
    }
}
