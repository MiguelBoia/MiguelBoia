import java.util.Scanner;

public class q3 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        System.out.println("Coloque o número:");
        double elevarQuadrado = teclado.nextInt();
        double mult = (elevarQuadrado * elevarQuadrado);
        System.out.println(mult);
     
        teclado.close();
    }

}
