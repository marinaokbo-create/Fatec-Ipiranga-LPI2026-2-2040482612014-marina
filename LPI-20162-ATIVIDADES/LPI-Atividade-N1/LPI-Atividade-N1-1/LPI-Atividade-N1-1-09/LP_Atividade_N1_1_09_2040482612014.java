import java.util.Scanner;
public class LP_Atividade_N1_1_09_2040482612014{
	public static void main(String[] args) {
		Scanner s = new Scanner (System.in);
		
		System.out.print("Informe a nota final do aluno: ");
		double notaFinal = s.nextDouble();
		System.out.print("--- Abordagem 1: Estrutura Condicional Tradicional (if-else) ---\n");
		
		if (notaFinal >= 6){
		    System.out.print("Situação (if-else): Aprovado\n");
		}
		
		else {
		    System.out.print("Situação (if-else): Reprovado\n");
		}
		
		String aprovaAluno = (notaFinal >= 6) ? "Aprovado" : "Reprovado";
		System.out.print("\n--- Abordagem 2: Operador Ternário Simples ---");
	    System.out.print("\nSituação (Ternário): " + aprovaAluno);
		s.close();
	}
}