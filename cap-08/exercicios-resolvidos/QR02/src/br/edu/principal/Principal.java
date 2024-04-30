package br.edu.principal;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();

        System.out.println(somarIntermediarios(n1, n2));
    }

    private static int somarIntermediarios(int n1, int n2) {
        int sum = 0;
        for (int i = n1 + 1; i < n2; i++) {
            sum += i;
        }
        return sum;
    }
}
