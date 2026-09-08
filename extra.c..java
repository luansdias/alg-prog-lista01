import java.util.Scanner;

public class L01E {
    public static void main(String[] args) {
     
     int nota100;
     int nota50;
     int nota20;
     int nota10;
     int nota5;
     int nota2;
     int nota1;
     
     Scanner leia = new Scanner(System.in);
     
     System.out.println("Digite um valor:");
     int valor = leia.nextInt();
     
     nota100 = valor / 100;
     valor = valor % 100;
     
     nota50 = valor / 50;
     valor = valor % 50;
          
     nota20 = valor / 20;
     valor = valor % 20;
          
     nota10 = valor / 10;
     valor = valor % 10;
          
     nota5 = valor / 5;
     valor = valor % 5;
          
     nota2 = valor / 2;
     valor = valor % 2;
     
     nota1 = valor;
     
     System.out.println("A quantidade em notas de R$ 100 é: " + nota100);
     System.out.println("A quantidade em notas de R$ 50 é: " + nota50);
     System.out.println("A quantidade em notas de R$ 20 é: " + nota20);
     System.out.println("A quantidade em notas de R$ 10 é: " + nota10);
     System.out.println("A quantidade em notas de R$ 5 é: " + nota5);
     System.out.println("A quantidade em notas de R$ 2 é: " + nota2);
     System.out.println("A quantidade em notas de R$ 1 é: " + nota1);

     leia.close();
    
    }
}
