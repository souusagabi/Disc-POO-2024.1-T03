package br.edu.principal;

import java.util.ArrayList;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> numbs = new ArrayList<>();

        for (int j = 1; j <= 10; j++) {
            boolean jaFoiAdd = false;
            int n1 = sc.nextInt();
            if (numbs.isEmpty()) {
                numbs.add(n1);
                continue;
            }
            for (int i = 0; i < numbs.size(); i++) {
                if (n1 <= numbs.get(i)) {
                    numbs.add(i, n1);
                    jaFoiAdd = true;
                    break;
                }
            }
            if (!jaFoiAdd) numbs.add(n1);
        }

        System.out.println(numbs);
    }

}
