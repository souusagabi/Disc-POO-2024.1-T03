package br.edu.principal;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(); // > 1
        int b = sc.nextInt();
        int c = sc.nextInt();


    }

    private static int somarIntervalo(int a, int b, int c) {
        int sum = 0;
        for (int i = b; i <= c; i++) {
            if (i % a == 0) sum += i;
        }
        return sum;
    }
}
