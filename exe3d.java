import java.util.Scanner;

public class exe3d {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
  
        System.out.print("Digite a posição (iniciando em 1) da sequencia de número que começa em  4, 16, 36, 64, _: ");
        int posicao = scanner.nextInt();
        scanner.close();
        
        int numero = posicao * 2;

        System.out.println("O número na posição " + posicao + " é: " + (numero * numero) );

    }
}
