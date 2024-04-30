package br.edu.principal;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double n = sc.nextDouble();
        System.out.println(isPositive(n));
    }

    private static int isPositive(double numb) {
        if (numb >= 0) return 1;
        return 0;
    }
}
