package br.edu.principal;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();

    }

    private static void trasnformar(int s) {
        int m = s / 60;
        int h = m / 60;
        System.out.println(s);
        System.out.println(m);
        System.out.println(h);
    }
}
