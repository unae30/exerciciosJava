import java.util.Scanner;

public class exe3c {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
  
        System.out.print("Digite a posição (iniciando em 1) da sequencia de número que começa em  0, 1, 4, 9, 16, 25, 36, _: ");
        int numero = scanner.nextInt();
        scanner.close();
        
        numero = numero - 1;

        int num = numero * numero;

        System.out.println("O número na posição " + numero + " é: " + num);

    }
}
