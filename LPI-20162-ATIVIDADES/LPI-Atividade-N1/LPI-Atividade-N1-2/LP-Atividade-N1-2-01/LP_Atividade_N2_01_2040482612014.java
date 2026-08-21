import java.util.Scanner;
public class LP_Atividade_N2_01_2040482612014 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Quantidade de alunos na turma: ");
        int quantidadeAlunos = scanner.nextInt();

        double soma = 0;
        double maiorNota = 0;

        for(int i = 1; i <= quantidadeAlunos; i++) {
            System.out.print("Nota do aluno:");
            double nota = scanner.nextDouble();
            soma += nota;
            if(nota > maiorNota) {
                maiorNota = nota;
            }
        }

        System.out.print("Soma total das notas: " + soma);

        double media = soma / quantidadeAlunos;
        System.out.print("\nMédia da turma: " + media);
        System.out.print("\nMaior nota da turma: " + maiorNota);

        scanner.close();
    }
}
