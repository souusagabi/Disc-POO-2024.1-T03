package br.edu.principal;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double vant = sc.nextDouble();
        double vat = sc.nextDouble();

        System.out.printf("%.2f%%", percentual(vant, vat));
    }

    private static double percentual(double vant, double vat) {
        return (vat / vant - 1) * 100;
    }
}
