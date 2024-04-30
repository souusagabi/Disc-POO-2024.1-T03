package br.edu.principal;

import java.util.*;

public class Principal {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> numbs = new ArrayList<>();

        for (int i = 1; i <= 9; i++) {
            int num = sc.nextInt();
            numbs.add(num);
            if (isPrimo(num)) {
                System.out.printf("%d -> índice %d%n", num, i - 1);
            }
        }

        System.out.println(numbs);
    }

    private static boolean isPrimo(int numb) {
        if (numb == 1) return false;
        int qtdD = 0;
        for (int i = 1; i <= numb; i++) {
            if (numb % i == 0) qtdD++;
        }
        return qtdD <= 2;
    }

}
