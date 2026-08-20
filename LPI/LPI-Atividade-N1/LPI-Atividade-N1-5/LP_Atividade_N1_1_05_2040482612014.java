import java.util.Scanner;
public class LP_Atividade_N1_1_05_2040482612014{
	public static void main(String[] args){
	    Scanner scanner = new Scanner (System.in);
	    //1
	    System.out.print("Estoque inicial: ");
		int estoque = scanner.nextInt();
		
		//2
		System.out.print("Quantidade de entrada: ");
		int qtdEntrada = scanner.nextInt();
		
		//3
		System.out.print("Quantidade de saída 1: ");
		int qtdSaida1 = scanner.nextInt();
		
		//4
		System.out.print("Quantidade de saída 2: ");
		int qtdSaida2 = scanner.nextInt();
		
		//5
		System.out.print("Estoque mínimo: ");
		int estoqueMinimo = scanner.nextInt();
		
		//6
		System.out.print("Tamanho do lote (caixa): ");
		int tamanhoLote = scanner.nextInt();
		
		System.out.print("\nEstoque inicial: " + estoque + " unidades.");
		
		System.out.print("\nApós entrada (+" + qtdEntrada + "): " + (estoque + qtdEntrada) + " unidades.");
		
		estoque = estoque + qtdEntrada;
		System.out.print("\nApós saída (-" + qtdSaida1 + "): " + (estoque - qtdSaida1) + " unidades.");
		
		estoque = estoque - qtdSaida1;
		System.out.print("\nApós outra saída (-" + qtdSaida2 + "): " + (estoque - qtdSaida2) + " unidades.");
		
		estoque = estoque - qtdSaida2;
		System.out.print("\nO nível de estoque atual (" + estoque + ") está abaixo do mínimo (" + estoqueMinimo + ")? ");
		System.out.print(estoque < estoqueMinimo);
		
		System.out.print("\nUnidades fora de caixas fechadas de " + tamanhoLote + ": " + (estoque % tamanhoLote));
		
		System.out.print("\nO estoque está perfeitamente fracionado em caixas completas? ");
		System.out.print(estoque % tamanhoLote == 0);
		
		scanner.close();
	}
}
