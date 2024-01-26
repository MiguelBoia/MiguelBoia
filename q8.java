import java.util.Scanner;

public class q8 {
    public static void main(String[] args) {
       Scanner teclado = new Scanner(System.in);                             // Progama para saber se dois números inteiros são iguais.
       System.out.println("Informe o primeiro número:");
       int numeroUm = teclado.nextInt();
       System.out.println("Informe o segundo número:");
       int numeroDois = teclado.nextInt();
       if (numeroUm == numeroDois){
        System.out.println("Iguais.");
       }
       else {System.out.println("Diferentes." );
    };  
    teclado.close();
    };
};
