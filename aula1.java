import java.util.Scanner;

public class aula1 {
    
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        System.out.println("Coloque a nota 1");
        int nota1 = teclado.nextInt();
        System.out.println("Coloque a nota 2");
        int nota2 = teclado.nextInt();
        System.out.println("Coloque a peso 1");
        double peso1 = teclado.nextDouble();
        System.out.println("Coloque a peso 2");
        double peso2 = teclado.nextDouble();
        double media = (nota1 * peso1 + nota2 * peso2) / (peso1 + peso2);
        if (media >= 6) {
            System.out.println("Aprovado");
        } 
        else if (media >= 4) {
            System.out.println("Recuperação");

        }
        else { System.out.println ("Rprovado" ); }


        teclado.close();

    } 
        
    
}

