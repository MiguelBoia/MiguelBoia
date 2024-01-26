
import java.util.Scanner;

public class q2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Coloque a quantidade de chuva em polegadas:");
        double valorChuva = teclado.nextInt();
        double polegada = 25.4;
        double mult = (valorChuva * polegada );
        System.out.println(mult);
        teclado.close();
    }
}
