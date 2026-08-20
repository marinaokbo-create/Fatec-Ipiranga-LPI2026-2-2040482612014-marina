import java.util.Scanner;
public class LP_Atividade_N1_1_04_2040482612014{
    public static final String NOME_INSTITUICAO = "FATEC Ipiranga";
	public static final int PRAZO_MAX = 14;
	public static void main(String[] args){
		Scanner scanner = new Scanner (System.in);
		
		System.out.print("Informe o número de dias do empréstimo: ");
		int diasEmprestimo = scanner.nextInt();
		
		final int diasDevolucao = diasEmprestimo;
		//se diasDevolucao = 15 -> erro: não é possível alterar uma variável final após sua inicialização
		
		System.out.print("\nInstituição: " + NOME_INSTITUICAO);
		System.out.print("\nPrazo Máximo Padrão: " + PRAZO_MAX);
		System.out.print("\nDias calculados para devolução: " + diasDevolucao);
		
		scanner.close();
	}
}
