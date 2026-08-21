import java.util.Scanner;
public class LP_Atividade_N1_1_03_2040482612014{
	public static void main(String[] args){
		Scanner scanner = new Scanner (System.in);
		
		Integer idade = null;
		
		try{ 
		    int x = idade + 1;
		} catch(NullPointerException erro){
	    System.out.print("Tentando realizar operação aritmética com Integer nulo...");
		System.out.print("\nErro Capturado com sucesso: Não foi possível calcular porque a idade não foi informada (null)");
		System.out.print("\nDetalhe da excessão: java.lang.NullPointerException");
		System.out.print("\nInforme uma idade válida: ");
		}
		
		int novaIdade = scanner.nextInt();
		int proxIdade = novaIdade + 1;
		System.out.print("\nReatribuindo valor válido para a variável...");
		System.out.print("\nOperação bem-sucedida! Idade atual: " + novaIdade + " | Idade no próximo ano: " + proxIdade);
		
		scanner.close();
	}
}

 
    

