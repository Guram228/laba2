package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите n ");
        int n = scanner.nextInt();
        System.out.print("Введите x ");
        int x = scanner.nextInt();
        double result=0;
        for (int p = 1; p <= n; p++) {
            int factN = 1;
            for (int y = 1; y <= p; y++) {
                factN *= y;

            }
            double summa = (Math.pow((-1), n) * Math.pow(x, n) / factN);
            result = result + summa;

        }

        System.out.println(result);

    }

}

