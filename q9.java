import java.util.Scanner;

public class q9 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Informe o número:");
        int numeroUm = teclado.nextInt();
        if (numeroUm % 2 == 0  ) {
            System.out.println("É par.");
        }
        else  {System.out.println("É ímpar");};

    };
};

