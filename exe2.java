import java.util.Scanner;

public class exe2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número para verificar se está na sequência de Fibonacci: ");
        int numero = scanner.nextInt();
        scanner.close();

        int maximo = 100; // Limite superior para o cálculo da sequência de Fibonacci
        int[] fibonacci = new int[maximo];

        // Calcula a sequência de Fibonacci até o número máximo
        fibonacci[0] = 0;
        fibonacci[1] = 1;
        int indice = 2;
        while (indice < maximo) {
            fibonacci[indice] = fibonacci[indice - 1] + fibonacci[indice - 2];
            if (fibonacci[indice] > numero) {
                break;
            }
            indice++;
        }

        boolean encontrado = false;
        for (int i = 0; i < indice; i++) {
            if (fibonacci[i] == numero) {
                encontrado = true;
                break;
            }
        }

        if (encontrado) {
            System.out.println(numero + " está na sequência de Fibonacci.");
        } else {
            System.out.println(numero + " não está na sequência de Fibonacci.");
        }
    }
}
