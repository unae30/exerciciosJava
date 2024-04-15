import java.util.Scanner;

public class exe3f {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
  
        System.out.print("Digite a posição (iniciando em 1) da sequencia de número que começa em  2,10, 12, 16, 17, 18, 19...: ");
        int posicao = scanner.nextInt();
        scanner.close();
        
        int pri = 2;
        int seg = 10;
        int ter = 12;
        int qua = 16;
        int qui = 17;
        int sex = 18;
        int set = 19;
        int oit = 200;

        if (posicao <= 8) {
          switch (posicao) {
            case 1:
                System.out.println(pri);
                break;

                case 2:
                System.out.println(seg);
                break;    

                case 3:
                System.out.println(ter);
                break;

                case 4:
                System.out.println(qua);
                break;

                case 5:
                System.out.println(qui);
                break;

                case 6:
                System.out.println(sex);
                break;

                case 7:
                System.out.println(set);
                break;

                case 8:
                System.out.println(oit);
                break;
        }}else{

            int resultado = 0;
            for(int i = 8; i <= posicao; i++){
                resultado = oit;
                oit += 1;
            }
            
            System.out.println(resultado);
        }
    }
}
