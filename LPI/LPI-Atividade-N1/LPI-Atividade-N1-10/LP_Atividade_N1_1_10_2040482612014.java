import java.util.Scanner;
public class LP_Atividade_N1_1_10_2040482612014{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //1
        System.out.print("Informe o valor A: ");
        double a = scanner.nextDouble();

        System.out.print("Informe o valor B: ");
        double b = scanner.nextDouble();

        System.out.print("Informe o valor C: ");
        double c = scanner.nextDouble();

        System.out.print("Informe o valor D: ");
        double d = scanner.nextDouble();

        System.out.print("Informe a média do aluno: ");
        double media = scanner.nextDouble();

        System.out.print("Informe o percentual de presença: ");
        double presenca = scanner.nextDouble();

        double semParenteses = a + b - c * d + d;
        double comParenteses = a + b - (c * d) + d;

        boolean aprovadoDireto = (media >= 6) && (presenca >= 75);

        System.out.print("--- Demonstração de Precedência Aritmética ---");
        System.out.print("\nResultado Sem parênteses: " + semParenteses);
        System.out.print("\nResultado Com parênteses explícitos: " + comParenteses);
        System.out.print("\nNota: Ambos dão o mesmo resultado pela precedência natural (*, /");
        System.out.print("\ndepois +), mas a segunda forma é mais legível.\n");

        System.out.print("\n--- Validação do Critério de Aprovação ---");
        System.out.print("\nEntrada -> Média: " + media + " | Presença: " + (int)presenca + "%");
        System.out.print("\nResultado da avaliação (aprovadoDireto): " + aprovadoDireto + ".");

        scanner.close();
    }
}