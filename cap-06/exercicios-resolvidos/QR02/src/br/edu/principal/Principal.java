package br.edu.principal;

import java.util.ArrayList;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Double> precos = new ArrayList<>();
        ArrayList<Integer> qtds = new ArrayList<>();
        int indiceMaisV = 0;
        int qtdMaisV = 0;
        double precoMaisV = 0;
        double valorTotal = 0;

        for (int i = 1; i <= 10; i++) {
            System.out.print("Preço: ");
            double preco = sc.nextDouble();
            precos.add(preco);
            System.out.print("Quantidade: ");
            int qtd = sc.nextInt();
            qtds.add(qtd);

            if (qtd > qtdMaisV) {
                indiceMaisV = i;
                qtdMaisV = qtd;
                precoMaisV = preco;
            }
            valorTotal += preco * qtd;
            System.out.printf("Produto #%d\t", i);
            System.out.printf("Preço unitário: %.2f\t", preco);
            System.out.printf("Valor total de venda: %.2f\n\n", valorTotal);
        }
        System.out.printf("Valor total: %.2f\tComissão do vendedor: %.2f\n", valorTotal, 0.05 * valorTotal);
        System.out.printf("OBMV: %.2f\tIND: %d", precoMaisV, indiceMaisV);
    }

}
