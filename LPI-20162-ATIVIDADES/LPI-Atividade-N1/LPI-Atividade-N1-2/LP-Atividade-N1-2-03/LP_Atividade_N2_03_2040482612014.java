import java.util.Scanner;
public class LP_Atividade_N2_03_2040482612014 {
    public static final int PIN = 1234;
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);

        int pinDigitado = 0;
        int tentativas = 0;
        do{
            System.out.print("Informe o PIN de acesso: ");
            pinDigitado = scanner.nextInt();
            tentativas++;
            if (pinDigitado != PIN){
                System.out.println("PIN incorreto. Tente novamente.");
            }
        }while(pinDigitado != PIN);

        if(pinDigitado == PIN){
            System.out.println("Acesso concedido! Você utilizou " + tentativas + " tentativa(s).");
        }

        scanner.close();
    }
}