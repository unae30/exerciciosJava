import java.util.Scanner;

public class exe3e {

    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
  
        System.out.print("Digite a posição (iniciando em 1) da sequencia de número que começa em  1, 1, 2, 3, 5, 8, _: ");
        int posicao = scanner.nextInt();
        scanner.close();
        
        int num_f = fibonacci(posicao);
        System.out.println("O número na posição " + posicao + " é: " + num_f );

    }
}
