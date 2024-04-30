package br.edu.principal;

import java.util.ArrayList;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> v1 = new ArrayList<>();
        ArrayList<Integer> v2 = new ArrayList<>();
        ArrayList<Integer> v3 = new ArrayList<>();

        for (int i = 1; i <= 10; i++) {
            System.out.print("V1: ");
            int n1 = sc.nextInt();
            v1.add(n1);
            v3.add(n1);

            System.out.print("V2: ");
            int n2 = sc.nextInt();
            v2.add(n2);
            v3.add(n2);
        }

        System.out.println(v1);
        System.out.println(v2);
        System.out.println(v3);
    }

}
