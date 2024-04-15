import java.util.Scanner;

public class exe5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite uma string para inverter:");
        String original = scanner.nextLine();
        scanner.close();

        String invertida = inverterString(original);
        System.out.println("String original: " + original);
        System.out.println("String invertida: " + invertida);
    }

    public static String inverterString(String str) {
        char[] caracteres = str.toCharArray();
        int tamanho = caracteres.length;
        for (int i = 0; i < tamanho / 2; i++) {
            char temp = caracteres[i];
            caracteres[i] = caracteres[tamanho - 1 - i];
            caracteres[tamanho - 1 - i] = temp;
        }
        return new String(caracteres);
    }
}
