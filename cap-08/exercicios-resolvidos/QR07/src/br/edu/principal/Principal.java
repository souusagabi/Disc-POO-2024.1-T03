package br.edu.principal;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double n1 = sc.nextInt();
        double n2 = sc.nextInt();
        double n3 = sc.nextInt();
        String l = sc.next().toUpperCase();

        System.out.println(media(n1, n2, n3, l));
    }

    private static double media(double n1, double n2, double n3, String l) {
        double media;
        if (l.equals("A")) {
            media = (n1 + n2 + n3) / 3;
        } else {
            media = (n1 * 5 + n2 * 3 + n3 * 2) / 10;
        }
        return media;
    }
}
