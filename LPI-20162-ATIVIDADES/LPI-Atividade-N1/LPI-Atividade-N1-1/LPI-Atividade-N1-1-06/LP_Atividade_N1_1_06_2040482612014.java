import java.util.Scanner;
public class LP_Atividade_N1_1_06_2040482612014 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("--- Execução 1 ---\n");
        System.out.print("Informe o nome de usuário: ");
        String texto = scanner.nextLine();

        if(texto != null && texto.length() > 0) {
            System.out.print("Usuário válido fornecido: " + texto + "\n");
        } else {
            System.out.print("Entrada rejeitada: o texto forncido está nulo ou vazio." + "\n");
        }   

        System.out.print("\n--- Execução 2 ---\n");
        System.out.print("Informe o nome de usuário: ");
        texto = scanner.nextLine();

        if(texto != null && texto.length() > 0) {
        //utilizar apenas "&" faria as duas condições serem avaliadas, quando uma deveria ser falsa, 
        // fazendo o texto.length() causar um NullPointerException.
            System.out.print("Usuário válido fornecido: " + texto + "\n");
        } else {
            System.out.print("Entrada rejeitada: o texto forncido está nulo ou vazio." + "\n");
        }   

        scanner.close();
    } 
}
