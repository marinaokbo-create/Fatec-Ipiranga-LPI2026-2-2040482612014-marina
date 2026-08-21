import java.util.Scanner;
public class LP_Atividade_N2_02_2040482612014 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("- Execução 1 (com vendas) -\n");
        double valorVenda = 0;

        double total = 0;
        int qtdVendas = 0;

        do{
            System.out.print("Valor da venda (ou 0 para encerrar): ");
            valorVenda = scanner.nextDouble();
            total += valorVenda;

            if(valorVenda != 0){
                qtdVendas++;
            }
        }while(valorVenda != 0);

        System.out.print("Total vendido no turno: R$ " + total);
        System.out.print("\nQuantidade de vendas: " + qtdVendas);

        double media = total / qtdVendas;
        System.out.printf("\nValor médio por venda: R$ %.2f\n", media);

        System.out.print("\n- Execução 2 (encerramento imediato) -\n");
        
        int qtdVendas2 = 0;
        do{
            System.out.print("Valor da venda (ou 0 para encerrar): ");
            valorVenda = scanner.nextDouble();
            total += valorVenda;
            if(valorVenda != 0){
                qtdVendas2++;
            }
        }while(valorVenda != 0);

        if(qtdVendas2 == 0){
            System.out.print("Nenhuma venda registrada nesta sessão de caixa.");
        }

        scanner.close();
    }
}