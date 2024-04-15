import java.util.Scanner;

public class exe3a {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = 1;      
        System.out.print("Digite a posição da sequencia (iniciando em 1) de número que começa em 1, 3, 5, 7, _: ");
        int numero = scanner.nextInt();
        scanner.close();
        
        for(int i = 1; i < numero; i++){
            num += 2;
        }

        System.out.println("O número na posição " + numero + " é: " + num);

    }
}
