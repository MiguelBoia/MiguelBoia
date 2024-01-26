import java.util.Scanner;

public class questao1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        for(int b = 0; b < 2; b++){
    System.out.println("Coloque o número:");
        int numeroUm = teclado.nextInt();
        int soma = 1 ;
        System.out.print(1);
        for (int teste = 2; teste < numeroUm; teste++   ) {
            if (numeroUm%teste==0){
            soma = soma+teste;
            System.out.print("+");    
            System.out.print(teste);
        }
        };
        if (soma ==numeroUm) {
            System.out.println(" => É perfeito.");
        } 
        else {
            System.out.println(" => É imperfeito.");
         };
        };
     
        

          

        teclado.close();
    };
    
};
